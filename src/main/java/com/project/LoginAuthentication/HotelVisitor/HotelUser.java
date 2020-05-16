package com.project.LoginAuthentication.HotelVisitor;

public class HotelUser {
	
	
	private String userName;

	
	private String password;
	
	
	private String matchingPassword;

	
	private String firstName;

	
	private String lastName;

	
	private String email;
	

/*	private Collection<Role> roles;
*/
	public HotelUser() {
		
	}

	
public HotelUser(String userName, String password, String matchingPassword, String firstName, String lastName,
		String email) {
	super();
	this.userName = userName;
	this.password = password;
	this.matchingPassword = matchingPassword;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}


/*	public HotelUser(String userName, String password, String matchingPassword, String firstName, String lastName,
			String email, Collection<Role> roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.matchingPassword = matchingPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roles = roles;
	}
*/

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


	public String getMatchingPassword() {
		return matchingPassword;
	}


	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

/*
	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	*/
	
	


}
