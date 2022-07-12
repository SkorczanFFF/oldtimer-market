package com.oldtimer.login;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.simplesecurity.RemoteClient;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.jsf.dao.UserDAO;
import com.jsf.entities.User;

@Named
@RequestScoped
public class LoginBB {
	private static final String HOME_PAGE = "/index?faces-redirect=true";
	private static final String HOME_PAGE_ADMIN = "/panel?faces-redirect=true";
	private static final String SITE_LOGIN = "/login?faces-redirect=true";
	private static final String STAY_AT_THE_SAME = null;
	
	private String nick;
	private String pass;
	
	@EJB
	UserDAO userDAO;
	
	@Inject
	LoggedBB loggedBB;
	
	public String login() {
		FacesContext ctx = FacesContext.getCurrentInstance();

		User user = null;
		user = userDAO.login(nick, pass);

		if (user == null) {
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Niepoprawny email lub haslo!", null));
			
			return STAY_AT_THE_SAME;
		}
		
		RemoteClient<User> client = new RemoteClient<User>();
		client.setDetails(user);
		client.getRoles().add(user.getRole());

		HttpServletRequest request = (HttpServletRequest) ctx.getExternalContext().getRequest();
		client.store(request);
		
		loggedBB.setId(user.getId());
		loggedBB.setNick(user.getNick());
		loggedBB.setMail(user.getMail());
		loggedBB.setNumber(user.getNumber());
		loggedBB.setRole(user.getRole());

		if (loggedBB.getRole().equals("user")) {
			return HOME_PAGE;
		} else {
			return HOME_PAGE_ADMIN;
		}
	}

	public String logout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		
		loggedBB.clean();
		
		return SITE_LOGIN;
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
}