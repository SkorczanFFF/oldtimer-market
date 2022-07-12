package com.jsf.entities;

import java.io.Serializable;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id_user;
	
	//@Column(length=25)
	private String nick;

	//@Column(length=32)
	private String pass;
	
	//@Column(length=64)
	private String mail;
	
	//@Column(length=9)
	private String number;
	
	//@Column(length=6)
	private String role;
	
		public Integer getId() {
			return id_user;
		}
		public void setId(Integer id_user) {
			this.id_user = id_user;
		}
		public String getNick() {
			return nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
}