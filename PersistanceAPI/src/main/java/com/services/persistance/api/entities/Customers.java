package com.services.persistance.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Customers implements Serializable {

	private static final long serialVersionUID = 1L;

	public Customers(Long customerId, String customerName, String customerGUID) {
		super();
		this.customerid = customerId;
		this.customername = customerName;
		this.customerguid = customerGUID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerid;
	private String customername;
	private String customerguid;

	public Customers() {
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerguid() {
		return customerguid;
	}

	public void setCustomerguid(String customerguid) {
		this.customerguid = customerguid;
	}

	@Override
	public String toString() {
		return "Customers [customerid=" + customerid + ", customername=" + customername + ", customerguid="
				+ customerguid + "]";
	}

}