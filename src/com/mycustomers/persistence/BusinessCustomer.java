package com.mycustomers.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@DiscriminatorValue("BusinessCustomer")
@Table
public class BusinessCustomer extends Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3517617273909195532L;
	
	@Column
	private String taxNr;
	@Column
	private String companyName;

	
	
	public BusinessCustomer() {
	}
	
	public BusinessCustomer(String lastName, String firstName) {
		super(lastName, firstName);
	}
	
	
	
	public String getTaxNr() {
		return taxNr;
	}
	
	public void setTaxNr(String taxNr) {
		this.taxNr = taxNr;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}