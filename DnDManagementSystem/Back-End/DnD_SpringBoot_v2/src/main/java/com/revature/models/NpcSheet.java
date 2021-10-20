package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity


@Table(name = "npcsheet_db")
public class NpcSheet {
	@Id
	@Column(name = "npcSheetId") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int npcSheetId;
	
	@Column(name = "name")
	String name;
	@Column(name = "personality")
	String personality;
	@Column(name = "description")
	String description;
	@Column(name = "location")
	String location;
	@Column(name = "items")
	String items;
	@Column(name = "quests")
	String quests;
	
	
	@ManyToOne
	@JoinColumn(name = "dungeonMasterId")
	private DungeonMaster dungeonMaster;
}
