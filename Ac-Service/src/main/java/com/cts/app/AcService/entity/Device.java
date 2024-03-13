package com.cts.app.AcService.entity;

import com.cts.app.AcService.dao.DeviceDao;

public class Device  {

	private int id;
	private String type;
	private String brand;
	private String model;
	private String problem;
	
	public Device() {
	
	}
	public Device(int id, String type, String brand, String model,String problem) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.problem=problem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", type=" + type + ", brand=" + brand + ", model=" + model + ",problem="+problem+" ]";
	}
  
}
