/**
 * 
 */
package com.services.login.base.domain;

/**
 * @author PRASADBolla
 *
 */
public class AuthenticationBean {
	private String message;

	public AuthenticationBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("AuthenticationBean [message=%s]", message);
	}

}
