package com.oldtimer.car;

import java.io.IOException;
import java.io.Serializable;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.ejb.EJB;

import com.jsf.dao.UserDAO;
import com.jsf.entities.Car;
import com.jsf.entities.User;


@Named
@ViewScoped
public class UserListBB implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String PAGE_PROFILE = "profile?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;

	@EJB
	UserDAO userDAO;
	private User user = new User();
	private User loaded = null;

	public User getUser() {
		return user;
	}

	public void onLoad() throws IOException {
		FacesContext context = FacesContext.getCurrentInstance();

		if (!context.isPostback()) {
			if (!context.isValidationFailed() && user.getNick() != null) {
				loaded = userDAO.find(user.getNick());
			}
			if (loaded != null) {
				user = loaded;
			} else {
				context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "B³êdne u¿ycie systemu", null));
				//if (!context.isPostback()) { // possible redirect
				//	context.getExternalContext().redirect("personList.xhtml");
				//	context.responseComplete();
				//}
			}
		}

	}

	public String saveData() {
		// no Person object passed
		if (loaded == null) {
			return PAGE_STAY_AT_THE_SAME;
		}

		try {
			if (user.getNick() == null) {
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

		return PAGE_PROFILE;
	}
	
	public String viewUser(User user){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("user", user);
		return PAGE_PROFILE;
	}
}
