package com.oldtimer.car;

import java.io.IOException;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.faces.application.FacesMessage;

import com.jsf.dao.CarDAO;
import com.jsf.entities.Car;

@Named
@ViewScoped
public class CarViewBB implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Car car = new Car();
	private Car loaded = null;

	public Car getCar() {
		return car;
	}

	@EJB
	CarDAO carDAO;
	
	public void onLoad() throws IOException {
	    FacesContext context = FacesContext.getCurrentInstance();

		// load car passed through session
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

}
