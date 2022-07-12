package com.oldtimer.car;

import java.io.IOException;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import com.jsf.dao.CarDAO;
import com.jsf.entities.Car;

@Named
@ViewScoped
public class CarEditBB implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String PAGE_PANEL = "panel?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;

	private Car car = new Car();
	private Car loaded = null;

	public Car getCar() {
		return car;
	}

	@EJB
	CarDAO carDAO;
	
	public void onLoad() throws IOException {
	    FacesContext context = FacesContext.getCurrentInstance();

		// load person passed through session
		HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

		loaded = (Car) session.getAttribute("car");

		// cleaning: attribute received => delete it from session
		if (loaded != null) {
			car = loaded;
			session.removeAttribute("car");
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
			if (car.getIdCar() == null) {
				// new record
				carDAO.create(car);
			} else {
				// existing record
				carDAO.merge(car);
			}
		} catch (Exception e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "wyst¹pi³ b³¹d podczas zapisu", null));
			return PAGE_STAY_AT_THE_SAME;
		}

		return PAGE_PANEL;
	}
	
	
}
