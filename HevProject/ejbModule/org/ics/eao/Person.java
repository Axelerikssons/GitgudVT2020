package org.ics.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Person
 */
@Stateless
@LocalBean
public class Person implements PersonRemote, PersonLocal {
	
	private String ssn;
	private String firstName;
	private String lastName;
	private String gender;
	private String phoneNbr;
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
    public Person() {
        // TODO Auto-generated constructor stub
    }

}
