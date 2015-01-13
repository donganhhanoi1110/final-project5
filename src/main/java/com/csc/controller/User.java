/**
 * 
 */
/**
 * @author cscadmin
 *
 */
package com.csc.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private String fullName;

	private Integer age;

	private String email;
	


	private String password;
	// GETTER-SETTER ===========================
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName=fullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age=age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email=email;
	}
}