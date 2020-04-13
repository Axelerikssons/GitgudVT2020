package org.ics.eao;

import javax.ejb.Local;

@Local
public interface PersonLocal {
	
	public String getSsn();
	public void setSsn(String ssn);
	public String getFirstName();
	public void setFirstName(String firstName);
	public String getLastName();
	public void setLastName(String lastName);
	public String getGender();
	public void setGender(String gender);
	public String getPhoneNbr();
	public void setPhoneNbr(String phoneNbr);
	

}
