package com.lti.AIRLINERESERVATIONSYSTEM.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {
	
	@Id
	@Column(name="ADMIN_ID")
	private int adminId;
	
	@Column(name="LOGIN_ID")
	private String loginId;

	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ADMIN_NAME")
	private String adminName;
	public Admin() {
		super();
	}
	public Admin(int adminId, String loginId, String password, String adminName) {
		super();
		this.adminId = adminId;
		this.loginId = loginId;
		this.password = password;
		this.adminName = adminName;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	@Override
	public String toString() {
		return "\nAdmin [adminId=" + adminId + ", loginId=" + loginId + ", password=" + password + ", adminName="
				+ adminName + "]";
	}
	
	
}
