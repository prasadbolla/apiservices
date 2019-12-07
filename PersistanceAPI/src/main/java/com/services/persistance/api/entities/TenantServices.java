package com.services.persistance.api.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class TenantServices implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tenantservicesid;
	private Long tenantid;
	private Long servicesid;
	private Timestamp serviceprovisiondate;
	public Long getTenantservicesid() {
		return tenantservicesid;
	}
	public void setTenantservicesid(Long tenantservicesid) {
		this.tenantservicesid = tenantservicesid;
	}
	public Long getTenantid() {
		return tenantid;
	}
	public void setTenantid(Long tenantid) {
		this.tenantid = tenantid;
	}
	public Long getServicesid() {
		return servicesid;
	}
	public void setServicesid(Long servicesid) {
		this.servicesid = servicesid;
	}
	public Timestamp getServiceprovisiondate() {
		return serviceprovisiondate;
	}
	public void setServiceprovisiondate(Timestamp serviceprovisiondate) {
		this.serviceprovisiondate = serviceprovisiondate;
	}
	@Override
	public String toString() {
		return "TenantServices [tenantservicesid=" + tenantservicesid + ", tenantid=" + tenantid + ", servicesid="
				+ servicesid + ", serviceprovisiondate=" + serviceprovisiondate + "]";
	}

}
