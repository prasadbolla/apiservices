package com.services.persistance.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ScheduleTypes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer scheduletypeid;
	private String scheduletype;

	public ScheduleTypes() {
	}

	public Integer getScheduletypeid() {
		return scheduletypeid;
	}

	public void setScheduletypeid(Integer scheduletypeid) {
		this.scheduletypeid = scheduletypeid;
	}

	public String getScheduletype() {
		return scheduletype;
	}

	public void setScheduletype(String scheduletype) {
		this.scheduletype = scheduletype;
	}

	@Override
	public String toString() {
		return "ScheduleTypes [scheduletypeid=" + scheduletypeid + ", scheduletype=" + scheduletype + "]";
	}

}