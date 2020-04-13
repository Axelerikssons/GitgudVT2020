package org.ics.eao;

import javax.ejb.Local;

@Local
public interface AddressLocal {
	
	public String getStreetName();
	public void setStreetName(String streetName);
	public String getStreetNbr();
	public void setStreetNbr(String streetNbr);
	public String getZipCode();
	public void setZipCode(String zipCode);

}
