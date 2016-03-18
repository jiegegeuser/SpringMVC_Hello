package com.atguigu.springmvc.entity;

public class User {

	private Integer userId;
	private String userName;
	private String passWord;
	private String address;
	private String gender;

	public User() {
	}

	public User(Integer userId, String userName, String passWord, String address, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.address = address;
		this.gender = gender;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


}
