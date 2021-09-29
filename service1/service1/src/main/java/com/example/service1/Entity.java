package com.example.service1;

public class Entity {

	int id;
	String name;
	String pincodeString;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPincodeString() {
		return pincodeString;
	}
	public void setPincodeString(String pincodeString) {
		this.pincodeString = pincodeString;
	}
	public Entity(int id, String name, String pincodeString) {
		super();
		this.id = id;
		this.name = name;
		this.pincodeString = pincodeString;
	}
	
	
}
