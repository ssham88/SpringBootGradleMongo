package com.demo.model;

import org.springframework.data.annotation.Id;

public class Customer {
@Id
private String id;

private String firstName;
private String lastname;
@Override
public String toString() {
	return "Customer [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + "]";
}
public Customer(String firstName, String lastname) {
	super();
	this.firstName = firstName;
	this.lastname = lastname;
}
public String getId() {
	return id;
}
public String getFirstName() {
	return firstName;
}
public String getLastname() {
	return lastname;
}

}
