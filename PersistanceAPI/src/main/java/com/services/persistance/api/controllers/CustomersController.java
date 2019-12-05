package com.services.persistance.api.controllers;

import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.services.persistance.api.entities.Customers;
import com.services.persistance.api.repository.CustomersRepository;

@Controller
@RequestMapping(path = "/customers")
public class CustomersController {

	@Autowired
	private CustomersRepository customersRepository;

	@PatchMapping
	public @ResponseBody Customers updateCustomer(@RequestBody Customers customer) {

		try {
			Customers n = customersRepository.getOne(customer.getCustomerid());
			n.setCustomername(customer.getCustomername());
			return customersRepository.save(n);
		} catch (EntityNotFoundException e) {

			e.printStackTrace();

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Customer not found with ID " + customer.getCustomerid());
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
					" Error Updating Customer with ID " + customer.getCustomerid());
		}

	}

	@PutMapping
	public @ResponseBody Customers addCustomer(@RequestBody Customers customer) {

		Customers n = new Customers();
		n.setCustomername(customer.getCustomername());
		n.setCustomerguid(UUID.randomUUID().toString());
		try {
			Customers ret = customersRepository.save(n);
			return ret;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
					"Customer not Add Customer with ID " + customer.getCustomerid());
		}

	}

	@GetMapping("/findCustomer/{customerid}")
	public @ResponseBody Customers findCustomerByid(@PathVariable Long customerid) {

		try {
			Customers customer = customersRepository.getOne(customerid);

			return customer;

		} catch (EntityNotFoundException e) {

			e.printStackTrace();

			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found with ID " + customerid);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
					" Error Finding Customer with ID " + customerid);
		}

	}
}