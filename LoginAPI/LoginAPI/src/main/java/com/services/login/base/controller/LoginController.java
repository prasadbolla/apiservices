/**
 * 
 */
package com.services.login.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.login.base.domain.AuthenticationBean;

/**
 * @author PRASADBolla
 *
 */
@RestController
public class LoginController {
	@GetMapping(value = "/authenticate")
	public AuthenticationBean basicAuth() {
		return new AuthenticationBean("You are authenticated");

	}

}
