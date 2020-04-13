package org.ics.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company implements Serializable{
	
	private String cid;
	private String companyName;
	private String phoneNbr;

	
	//Can only belong to one customer
	
	@Id
	@Column(name="cid")
	public String getCid() {
		return cid;
	}
	
	public void setCid(String cid) {
		this.cid = cid;
	}	
	@Column(name="companyName")
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Column(name="phoneNbr")
	public String getPhoneNbr() {
		return phoneNbr;
	}
	
	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	
}