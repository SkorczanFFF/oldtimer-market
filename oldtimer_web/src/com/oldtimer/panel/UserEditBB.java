package com.oldtimer.panel;

import java.io.IOException;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import com.jsf.dao.UserDAO;
import com.jsf.entities.User;

@Named
@ViewScoped
public class UserEditBB implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String PAGE_PANEL = "panel?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;

	private User user = new User();
	private User loaded = null;

	public User getUser() {
		return user;
	}

	@EJB
	UserDAO userDAO;
	
	public void onLoad() throws IOException {
	    FacesContext context = FacesContext.getCurrentInstance();

		// load person passed through session
		HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

		loaded = (User) session.getAttribute("user");

		// cleaning: attribute received => delete it from session
		if (loaded != null) {
			user = loaded;
			session.removeAttribute("user");
		} else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "B³êdne u¿ycie systemu", null));
			//if (!context.isPostback()) { //possible redirect 
			//	context.getExternalContext().redirect("personList.xhtml");
			//	context.responseComplete();
			//}
		}

	 }

	public String saveData() {
		// no Person object passed
		if (loaded == null) {
			return PAGE_STAY_AT_THE_SAME;
		}

		try {
			if (user.getId() == null) {
				// new record
				userDAO.create(user);
			} else {
				// existing record
				userDAO.merge(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "wyst¹pi³ b³¹d podczas zapisu", null));
			return PAGE_STAY_AT_THE_SAME;
		}

		return PAGE_PANEL;
	}
}
