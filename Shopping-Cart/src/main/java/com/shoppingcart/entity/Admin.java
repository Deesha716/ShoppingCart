package com.shoppingcart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
   @Id
	@GeneratedValue
	private int adminId;
	private String userName;
	private String password;
	private Boolean status = false;
	public Admin() {
		super();
	}
	public Admin(int adminId, String userName, String password, Boolean status) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.status = status;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", status=" + status
				+ "]";
	}
	
	
}
