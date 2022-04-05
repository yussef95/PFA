package com.eheio.gi4.pfa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable {

	 @Id
	 @GeneratedValue
	private int id;
	private String cycle;
	
	public Categorie(int id, String cycle) {
		super();
		this.id = id;
		this.cycle = cycle;
	}

	public Categorie(String cycle) {
		super();
		this.cycle = cycle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	
}
