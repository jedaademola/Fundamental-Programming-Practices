package com.fpp;

public interface NameAddress {
	String getFirstName();

	String getLastName();

	String getStreet();

	String getCity();

	String getState();

	default String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	default String getFullAddress() {
		return getStreet() + "\n" + getCity() + ", " + getState();
	}

}
