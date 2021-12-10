package com.thp.spring.simplecontext.dto;

import java.util.Set;

import com.thp.spring.simplecontext.entity.ERole;
import com.thp.spring.simplecontext.entity.User;

public class RoleDTO {

	private Long roleId;
	private ERole name;
	Set<User> listUser;

	public RoleDTO(Long roleId, ERole name, Set<User> listUser) {
		super();
		this.roleId = roleId;
		this.name = name;
		this.listUser = listUser;
	}

	public RoleDTO() {
		super();
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}

	public Set<User> getListUser() {
		return listUser;
	}

	public void setListUser(Set<User> listUser) {
		this.listUser = listUser;
	}

	@Override
	public String toString() {
		return "RoleDTO [roleId=" + roleId + ", name=" + name + ", listUser=" + listUser + "]";
	}

}
