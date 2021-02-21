package com.mycustomers.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@DiscriminatorValue("PrivateCustomer")
@Table
public class PrivateCustomer extends Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1803150969481072163L;
	
	@Column
	private String taxNr;
	
	

	public PrivateCustomer() {
	}
	
	public PrivateCustomer(String lastName, String firstName) {
		super(lastName, firstName);
	}
	
	
	
	public String getTaxNr() {
		return taxNr;
	}
	
	public void setTaxNr(String taxNr) {
		this.taxNr = taxNr;
	}
}