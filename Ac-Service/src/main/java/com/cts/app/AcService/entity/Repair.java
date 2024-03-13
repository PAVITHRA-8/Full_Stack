package com.cts.app.AcService.entity;

public class Repair {

    private int id;
    private String type;
    private String brand;
    private String model;
    private String description;
    private String status;
    
    public Repair() {
    	
    }
	public Repair(int id, String type, String brand, String model, String description, String status) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.description = description;
		this.status = status;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Repair [id=" + id + ", type=" + type + ", brand=" + brand + ", model=" + model + ", description="
				+ description + ", status=" + status + "]";
	}

    
    
}
