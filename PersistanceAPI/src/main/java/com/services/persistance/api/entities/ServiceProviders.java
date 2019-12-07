package com.services.persistance.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ServiceProviders implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceprovideid;
	private String serviceprovidername;
	public Integer getServiceprovideid() {
		return serviceprovideid;
	}
	public void setServiceprovideid(Integer serviceprovideid) {
		this.serviceprovideid = serviceprovideid;
	}
	public String getServiceprovidername() {
		return serviceprovidername;
	}
	public void setServiceprovidername(String serviceprovidername) {
		this.serviceprovidername = serviceprovidername;
	}
	@Override
	public String toString() {
		return "ServiceProviders [serviceprovideid=" + serviceprovideid + ", serviceprovidername=" + serviceprovidername
				+ "]";
	}

}
