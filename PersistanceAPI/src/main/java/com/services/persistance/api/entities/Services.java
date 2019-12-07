package com.services.persistance.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Services implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceid;
	private String servicename;
	private Boolean active;
	private Long serviceproviderid;
	public Long getServiceid() {
		return serviceid;
	}
	public void setServiceid(Long serviceid) {
		this.serviceid = serviceid;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Long getServiceproviderid() {
		return serviceproviderid;
	}
	public void setServiceproviderid(Long serviceproviderid) {
		this.serviceproviderid = serviceproviderid;
	}
	@Override
	public String toString() {
		return "Services [serviceid=" + serviceid + ", servicename=" + servicename + ", active=" + active
				+ ", serviceproviderid=" + serviceproviderid + "]";
	}

}
