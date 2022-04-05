package com.eheio.gi4.pfa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class NiveauLycee implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private String libelle;
	private String description;
	@ManyToOne
	//@JoinColumn(name = "")
	private CycleLycee lycee;
	public NiveauLycee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NiveauLycee(String libelle, String description, CycleLycee lycee) {
		super();
		this.libelle = libelle;
		this.description = description;
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
	public CycleLycee getLycee() {
		return lycee;
	}
	public void setLycee(CycleLycee lycee) {
		this.lycee = lycee;
	}
	

}
