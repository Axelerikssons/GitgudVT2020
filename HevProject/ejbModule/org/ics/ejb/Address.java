package org.ics.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address implements Serializable{
	
	private String streetName;
	private String streetNbr;
	private String zipCode;
	

	
	//Can only belong to one customer
	
	@Id
	@Column(name="streetName")
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}	
	@Column(name="streetNbr")
	public String getstreetNbr() {
		return streetNbr;
	}
	
	public void setStreetNbr(String streetNbr) {
		this.streetNbr = streetNbr;
	}
	
	@Column(name="zipCode")
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}