package com.oldtimer.car;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.ejb.EJB;

import com.jsf.dao.CarDAO;
import com.jsf.entities.Car;


@Named
@ViewScoped
public class CarListBB implements Serializable {

	private static final String PAGE_CAR_EDIT = "carEdit?faces-redirect=true";
	private static final String PAGE_CAR_ADD = "carEdit?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;

	private final String PAGE_CAR_VIEW = "view?faces-redirect=true";
	
	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@EJB
	CarDAO carDAO;
	
	public List<Car> getList(){
		List<Car> list = null;
		
		//1. Prepare search params
		Map<String,Object> searchParams = new HashMap<String, Object>();
		
		if (brand != null && brand.length() > 0){
			searchParams.put("brand", brand);
		}
		
		//2. Get list
		list = carDAO.getList(searchParams);
		
		return list;
	
	}
	
	public List<Car> getNewest(){
		List<Car> list = null;
		
		//1. Prepare search params
		Map<String,Object> inputParams = new HashMap<String, Object>();
		
		if (brand != null && brand.length() > 0){
			inputParams.put("brand", brand);
		}
		
		//2. Get list
		list = carDAO.getList(inputParams);
		
		return list;
	
	}	
	public List<Car> getFullList(){
		return carDAO.getFullList();
	}
	
	public String viewCar(Car car){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("car", car);
		return PAGE_CAR_VIEW;
	}
	
	public String editCar(Car car){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.setAttribute("car", car);
		return PAGE_CAR_EDIT;
	}

	public String deleteCar(Car car){
		carDAO.remove(car);
		return PAGE_STAY_AT_THE_SAME;
	}
	
	public String newCar(){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(true);
		Car car = new Car();
		session.setAttribute("car", car);
		return PAGE_CAR_ADD;
	}
}
