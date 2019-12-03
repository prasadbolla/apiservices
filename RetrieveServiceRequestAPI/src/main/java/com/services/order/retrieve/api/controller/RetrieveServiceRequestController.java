/**
 * 
 */
package com.services.order.retrieve.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.services.order.retrieve.api.domain.RetrieveServiceResponse;
import com.services.order.retrieve.api.service.RetrieveRequestService;

/**
 * @author PRASADBolla
 *
 */
@RestController
public class RetrieveServiceRequestController {
	@Autowired
	RetrieveRequestService retrieveRequestService;

	@GetMapping(value = "/retrieveRequests/request/{requestId}")
	public ResponseEntity<RetrieveServiceResponse> retrieve(
			@PathVariable String requestId) {
		return ResponseEntity.ok(retrieveRequestService
				.retrieveRequest(requestId));
	}
}
