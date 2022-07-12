package com.jsf.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table(name="car")
@NamedQuery(name="Car.findAll", query="SELECT c FROM Car c")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id_car;

	@Temporal(TemporalType.DATE)
	private Date date;
	

	@Column(length=64)
	private String title;

	@Column(length=5000)
	private String content;
	
	@Column(length=10)
	private Integer price;
	
	@Column(length=50)
	private String brand;

	@Column(length=50)
	private String model;
	
	@Column(length=4)
	private Integer year;
	
	@Column(length=25)
	private String localization;
	
	@Column(length=16)
	private Integer mileage;
	
	@Column(length=5)
	private Integer engine;
	
	@Column(length=4)
	private Integer horsepower;
	
	@Column
	private String pic1;
	
	@Column
	private String pic2;
	
	@Column
	private String pic3;
	
	@Column
	private String pic4;
	
	@Column
	private String pic5;
	
	@Column
	private String pic6;
	
	@Column
	private String user;
	
	public Car() {
	}

	public Integer getIdCar() {
		return this.id_car;
	}

	public void setIdCar(Integer id_car) {
		this.id_car = id_car;
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
	
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public String getPic1() {
		return this.pic1;
	}
	
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getPic2() {
		return this.pic2;
	}
	
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}

	public String getPic3() {
		return this.pic3;
	}
	
	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}

	public String getPic4() {
		return this.pic4;
	}
	
	public void setPic5(String pic5) {
		this.pic5 = pic5;
	}

	public String getPic5() {
		return this.pic5;
	}
	
	public void setPic6(String pic6) {
		this.pic6 = pic6;
	}

	public String getPic6() {
		return this.pic6;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public String getUser() {
		return this.user;
	}
}