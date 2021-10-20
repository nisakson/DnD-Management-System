package com.revature.models.charactersheet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.revature.models.CharacterSheet;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Lombok
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@EqualsAndHashCode
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "abilitySheetId")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "abilitySheet_db")

public class AbilitySheet {
	@Id
	@Column(name = "abilitySheetId") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int abilitySheetId;
	
	@OneToOne
	@JoinColumn(name = "characterSheetId", unique = true)
	private CharacterSheet characterSheet;
	
	@OneToMany(mappedBy = "abilitySheet")
	private List<Ability> abilities = new ArrayList<>();
	
}
