package com.eheio.gi4.pfa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Id;


@Entity
public class Niveau implements Serializable {
	 @Id
	 @GeneratedValue
	private int id;
	private String libelle;
	private String description;
	@ManyToOne
	//@JoinColumn(name = "")
	private CycleCollege college;
	
	@ManyToOne
	//@JoinColumn(name = "")
	private CycleLycee lycee ;

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Niveau(String libelle, String description,CycleCollege college,CycleLycee lycee) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.college = college;
		this.lycee = lycee;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CycleCollege getCollege() {
		return college;
	}
	public void setCollege(CycleCollege college) {
		this.college = college;
	}
	public CycleLycee getLycee() {
		return lycee;
	}
	public void setLycee(CycleLycee lycee) {
		this.lycee = lycee;
	}
}
