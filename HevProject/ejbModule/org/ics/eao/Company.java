package org.ics.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Company
 */
@Stateless
@LocalBean
public class Company implements CompanyRemote, CompanyLocal {
	
	private String cin;
	private String companyName;
	private String phoneNbr;

	
	
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNbr() {
		return phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

    /**
     * Default constructor. 
     */
    public Company() {
        // TODO Auto-generated constructor stub
    }
    
}
