package com.revature.models.charactersheet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

//Lombok
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@EqualsAndHashCode
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "itemId")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Table(name = "item_db")

public class Item {
	@Id
	@Column(name = "itemId") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int itemId;
	
	@Column(name = "name")
	String name;
	@Column(name = "weight")
	String weight;
	@Column(name = "value")
	String value;
	@Column(name = "description")
	String description;
	
	
	@ManyToOne
	@JoinColumn(name = "inventorySheetId")
	private InventorySheet inventorySheet;
	
	
	
}
