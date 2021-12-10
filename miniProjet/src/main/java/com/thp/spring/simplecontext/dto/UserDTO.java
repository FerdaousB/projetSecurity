package com.thp.spring.simplecontext.dto;

import java.util.Set;

import com.thp.spring.simplecontext.entity.Role;

public class UserDTO {

	private Long userId;
	private String firstname;
	private String name;
	private String mail;
	private String userPassword;
	public Set<Role> ListRole;

	public UserDTO() {
		super();
	}

	public UserDTO(Long userId, String firstname, String name, String mail, String userPassword, Set<Role> listRole) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.name = name;
		this.mail = mail;
		this.userPassword = userPassword;
		ListRole = listRole;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Set<Role> getListRole() {
		return ListRole;
	}

	public void setListRole(Set<Role> listRole) {
		ListRole = listRole;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", firstname=" + firstname + ", name=" + name + ", mail=" + mail
				+ ", userPassword=" + userPassword + ", ListRole=" + ListRole + "]";
	}

}
