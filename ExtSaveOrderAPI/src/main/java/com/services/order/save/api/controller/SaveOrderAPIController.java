/**
 * 
 */
package com.services.order.save.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.services.order.save.api.domain.SaveOrderRequest;
import com.services.order.save.api.domain.SaveOrderResponse;
import com.services.order.save.api.service.SaveOrderAPIService;

/**
 * @author PRASADBolla
 *
 */
@RestController
public class SaveOrderAPIController {
	@Autowired
	SaveOrderAPIService saveOrderAPIService;

	@PostMapping(value = "/save")
	public ResponseEntity<SaveOrderResponse> save(
			@RequestBody SaveOrderRequest saveOrderRequest) {
		SaveOrderResponse res = saveOrderAPIService.saveOrder(saveOrderRequest);
		
		//return ResponseEntity.ok(new SaveOrderResponse(new Message("1", "msg"),"1","2") );
		return ResponseEntity.ok(res);
	}
}
