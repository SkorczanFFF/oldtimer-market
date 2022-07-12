package com.oldtimer.panel;

import java.util.List;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.ejb.EJB;

import com.jsf.dao.UserDAO;
import com.jsf.entities.User;


@Named
@RequestScoped
public class AdminPanelBB {

	private static final String PAGE_USER_EDIT = "userEdit?faces-redirect=true";
	private static final String PAGE_USER_ADD = "userEdit?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;
	
	private String nick;
	
	public String getNick() {
		return nick;
	}

	public void setBrand(String nick) {
		this.nick = nick;
	}

	@EJB
	UserDAO userDAO;
	
	public List<User> getList(){
		List<User> list = null;
		
		list = userDAO.getList();
		
		return list;
	
	}
			
	public List<User> getFullList(){
		return userDAO.getList();
	}

	public String editUser(User user){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("user", user);
		return PAGE_USER_EDIT;
	}

	public String deleteUser(User user){
		userDAO.remove(user);
		return PAGE_STAY_AT_THE_SAME;
	}
	
	public String newUser(){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(true);
		User user = new User();
		session.setAttribute("user", user);
		return PAGE_USER_ADD;
	}
}
