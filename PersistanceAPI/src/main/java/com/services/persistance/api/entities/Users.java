package com.services.persistance.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	private String username;
	private String pwd;
	private String email;
	private Long tenentid;
	private Long apporvaluserid;
	private Long adminuserid;
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTenentid() {
		return tenentid;
	}
	public void setTenentid(Long tenentid) {
		this.tenentid = tenentid;
	}
	public Long getApporvaluserid() {
		return apporvaluserid;
	}
	public void setApporvaluserid(Long apporvaluserid) {
		this.apporvaluserid = apporvaluserid;
	}
	public Long getAdminuserid() {
		return adminuserid;
	}
	public void setAdminuserid(Long adminuserid) {
		this.adminuserid = adminuserid;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", pwd=" + pwd + ", email=" + email
				+ ", tenentid=" + tenentid + ", apporvaluserid=" + apporvaluserid + ", adminuserid=" + adminuserid
				+ "]";
	}

}
