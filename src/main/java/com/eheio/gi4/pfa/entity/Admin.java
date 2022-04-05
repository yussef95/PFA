package com.eheio.gi4.pfa.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin implements Serializable {
	 @Id
	 @GeneratedValue
	private int id;
	private String email;
	private String login;
	private String pwd;
	/*
	@OneToMany(mappedBy = "admin",fetch = FetchType.LAZY )
	private Collection<Conseiller>conseillers;
	@OneToMany(mappedBy = "admin",fetch = FetchType.LAZY )
	private Collection<User>users;
	*/

	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String email, String login, String pwd) {
		super();
		this.email = email;
		this.login = login;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	

}
