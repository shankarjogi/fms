package com.shankar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	private String username;
	private String email;
	private String contact_info;
	private String password;
	private String confirm_password;
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_info() {
		return contact_info;
	}
	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public Login() {}
	

	public Login(String username, String email, String contact_info, String password, String confirm_password) {
		super();
		this.username = username;
		this.email = email;
		this.contact_info = contact_info;
		this.password = password;
		this.confirm_password = confirm_password;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", email=" + email + ", contact_info=" + contact_info + ", password="
				+ password + ", confirm_password=" + confirm_password + "]";
	}


	
}
