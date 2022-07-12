package com.oldtimer.engine;

import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.jsf.dao.CarDAO;
import com.jsf.entities.Car;


@Named
@RequestScoped
public class AddBB {
	private static final String HOME_PAGE = "/index?faces-redirect=true";
	private static final String PAGE_STAY_AT_THE_SAME = null;
	
	@EJB
	CarDAO carDAO;
	
	private String title;
	private String content;
	private Integer price;
	private String brand;
	private String model;
	private Integer year;
	private String localization;
	private Integer mileage;
	private Integer engine;
	private Integer horsepower;
	private Date date;
	
	public String add() {
		Car car = new Car();
		car.setTitle(title);
		car.setContent(content);
		car.setPrice(price);
		car.setBrand(brand);
		car.setModel(model);
		car.setYear(year);
		car.setLocalization(localization);
		car.setMileage(mileage);
		car.setEngine(engine);
		car.setHorsepower(horsepower);
		car.setDate(date);
		
		carDAO.create(car);

		return HOME_PAGE;
	}

	public String delete(Car car){
		carDAO.remove(car);
		return PAGE_STAY_AT_THE_SAME;
	}
	
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getLocalization() {
		return this.localization;
	}

	public void setLocalization(String localization) {
		this.localization = localization;
	}
	
	public Integer getMileage() {
		return this.mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	
	public Integer getEngine() {
		return this.engine;
	}

	public void setEngine(Integer engine) {
		this.engine = engine;
	}
	
	public Integer getHorsepower() {
		return this.horsepower;
	}

	public void setHorsepower(Integer horsepower) {
		this.horsepower = horsepower;
	}
	public void saveFile() {
	}
}