package com.bookhe.user.dto;

public class User {

	private int UID;
	private String name;
	private Address address;
	private String contactNumber;
	private String emailId;
	private String password;
	private double  points;
	
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points = points;
	}
	public User(){
		this("default name",new Address("venice","bookhe","enemy"),"1234","1234email","empty",100);
	}
	public User(String name, Address address,
			String contactNumber, String emailId, String password, double points) {
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
		this.points = points;
	}
	public boolean validateContents(){
		return true;
	}
	
}