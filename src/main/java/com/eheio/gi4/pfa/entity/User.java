package com.eheio.gi4.pfa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import javax.persistence.Id;

@Entity
public class User implements Serializable {
	 @Id
	 @GeneratedValue
	private int id;
	private String login;
	private String email;
	private String pwd;
	@ManyToOne
	//@JoinColumn(name = "")
    private Admin admin;

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String login, String email, String pwd,Admin admin) {
		super();
		this.login = login;
		this.email = email;
		this.pwd = pwd;
		this.admin = admin;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
   
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	

}
