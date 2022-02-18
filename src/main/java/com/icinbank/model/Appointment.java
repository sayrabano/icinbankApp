package com.icinbank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Appointment {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private String accountType;
private String description;
private boolean confirmed;

@ManyToOne
@JoinColumn(name = "user_id")
private User user;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}


public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public boolean isConfirmed() {
	return confirmed;
}

public void setConfirmed(boolean confirmed) {
	this.confirmed = confirmed;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Appointment(Long id,  String accountType, String description, boolean confirmed, User user) {
	super();
	this.id = id;

	this.accountType = accountType;
	this.description = description;
	this.confirmed = confirmed;
	this.user = user;
}

public Appointment() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Appointment [id=" + id + ", accountType=" + accountType + ", description=" + description + ", confirmed="
			+ confirmed + ", user=" + user + "]";
}




}