package com.services.persistance.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ServiceScenario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long servicescenarioid;
	private String servicescenarioname;
	private String servicescenariodescription;
	private Long serviceid;
	public Long getServicescenarioid() {
		return servicescenarioid;
	}
	public void setServicescenarioid(Long servicescenarioid) {
		this.servicescenarioid = servicescenarioid;
	}
	public String getServicescenarioname() {
		return servicescenarioname;
	}
	public void setServicescenarioname(String servicescenarioname) {
		this.servicescenarioname = servicescenarioname;
	}
	public String getServicescenariodescription() {
		return servicescenariodescription;
	}
	public void setServicescenariodescription(String servicescenariodescription) {
		this.servicescenariodescription = servicescenariodescription;
	}
	public Long getServiceid() {
		return serviceid;
	}
	public void setServiceid(Long serviceid) {
		this.serviceid = serviceid;
	}
	@Override
	public String toString() {
		return "ServiceScenario [servicescenarioid=" + servicescenarioid + ", servicescenarioname="
				+ servicescenarioname + ", servicescenariodescription=" + servicescenariodescription + ", serviceid="
				+ serviceid + "]";
	}
}
