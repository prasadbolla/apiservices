/**
 * 
 */
package com.services.order.retrieve.api.service;

import org.springframework.stereotype.Service;

import com.services.order.retrieve.api.domain.RetrieveServiceResponse;

/**
 * @author PRASADBolla
 *
 */
@Service
public class RetrieveRequestService {
	
	public RetrieveServiceResponse retrieveRequest(String serviceRequestId) {
		return new RetrieveServiceResponse();
	}
}
