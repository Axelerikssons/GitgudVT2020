package org.ics.eao;

import javax.ejb.Local;

@Local
public interface CompanyLocal {
	
	public String getCin();
	public void setCin(String cin);
	public String getCompanyName();
	public void setCompanyName(String companyName);
	public String getPhoneNbr();
	public void setPhoneNbr(String phoneNbr);
}
