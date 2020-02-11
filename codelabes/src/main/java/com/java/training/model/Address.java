package com.java.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String addressone;
	String city;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddressone() {
		return addressone;
	}
	public void setAddressone(String addressone) {
		this.addressone = addressone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressone=" + addressone + ", city=" + city + "]";
	}
	public Address(Integer id, String addressone, String city) {
		super();
		this.id = id;
		this.addressone = addressone;
		this.city = city;
	}
	

	
}
