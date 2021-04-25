package com.jwt.model;

import java.util.List;

public class JwtResponse {
	private String token;
	private String userName;
	private Long id;
	private String email;
	private List<String> roles;
	private String password;

	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JwtResponse(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public JwtResponse(String token, String userName, String password, Long id) {
		super();
		this.token = token;
		this.userName = userName;
		this.id = id;
		this.password = password;
	}

	public JwtResponse(String token, Long id, String userName, String email, List<String> roles) {
		this.token = token;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;

	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
