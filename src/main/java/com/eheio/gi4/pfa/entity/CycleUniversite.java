package com.eheio.gi4.pfa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class CycleUniversite implements Serializable {

	 @Id
	 @GeneratedValue
	private int id;
	private String libelle;
	private String details;
	public CycleUniversite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CycleUniversite(String libelle, String details) {
		super();
		this.libelle = libelle;
		this.details = details;
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
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
