package com.oldtimer.login;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LoggedBB implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id = null;
	private String nick = null;
	private String mail = null;
	private String number = null;
	private String role = null;
	
	public void clean() {
		setId(null);
		setNick(null);
		setMail(null);
		setNumber(null);
		setRole(null);
	}
	
	public boolean isUser() {
		return role.equals("user");
	}
	
	public boolean isAdmin() {
		return role.equals("admin");
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
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