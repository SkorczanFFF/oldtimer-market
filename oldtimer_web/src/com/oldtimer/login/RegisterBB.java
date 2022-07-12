package com.oldtimer.login;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import com.jsf.dao.UserDAO;
import com.jsf.entities.User;

@Named
@RequestScoped
public class RegisterBB implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String PAGE_LOGIN = "/login?faces-redirect=true";

	@EJB
	UserDAO userDAO;
	
	private String nick;
	private String pass;
	private String mail;
	private String number;

	public String register() {
		User user = new User();
		user.setNick(nick);
		user.setPass(pass);
		user.setMail(mail);
		user.setNumber(number);
		user.setRole("user");
		
		userDAO.create(user);
		
		return PAGE_LOGIN;
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
}