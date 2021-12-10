package com.thp.spring.simplecontext.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`user`")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long userId;

	private String firstname;

	private String name;

	private String mail;

	private String userPassword;

	@ManyToMany
	@JoinTable(name = "userRoles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	public Set<Role> ListRole;

	public User() {
		super();
	}

	public User( String firstname, String name, String mail, String userPassword) {
		super();
	
		this.firstname = firstname;
		this.name = name;
		this.mail = mail;
		this.userPassword = userPassword;

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
		return "User [userId=" + userId + ", firstname=" + firstname + ", name=" + name + ", mail=" + mail
				+ ", userPassword=" + userPassword + ", ListRole=" + ListRole + "]";
	}

}
