package com.services.persistance.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Tenants implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tenantid;
	private String tenantname;
	private String tenantGUID;
	private Long customerid;
	public Long getTenantid() {
		return tenantid;
	}
	public void setTenantid(Long tenantid) {
		this.tenantid = tenantid;
	}
	public String getTenantname() {
		return tenantname;
	}
	public void setTenantname(String tenantname) {
		this.tenantname = tenantname;
	}
	public String getTenantGUID() {
		return tenantGUID;
	}
	public void setTenantGUID(String tenantGUID) {
		this.tenantGUID = tenantGUID;
	}
	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	@Override
	public String toString() {
		return "Tenants [tenantid=" + tenantid + ", tenantname=" + tenantname + ", tenantGUID=" + tenantGUID
				+ ", customerid=" + customerid + "]";
	}

}
