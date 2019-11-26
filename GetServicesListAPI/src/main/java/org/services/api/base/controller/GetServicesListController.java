package org.services.api.base.controller;

//package org.arpit.java2blog.springboot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GetServicesListController {
	// HelloWorldController
	@RequestMapping("/getServicesListAPI")
	public ModelAndView hello() {
		return new ModelAndView("hello", "message", "Test: GetServicesListAPI");
	}
}
