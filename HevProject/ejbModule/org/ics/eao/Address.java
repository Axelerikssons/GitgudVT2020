package org.ics.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Address
 */
@Stateless
@LocalBean
public class Address implements AddressRemote, AddressLocal {
	
	private String streetName;
	private String streetNbr;
	private String zipCode;
	
	
	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getStreetNbr() {
		return streetNbr;
	}


	public void setStreetNbr(String streetNbr) {
		this.streetNbr = streetNbr;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	

    /**
     * Default constructor. 
     */
    public Address() {
        // TODO Auto-generated constructor stub
    }

}
