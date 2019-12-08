/**
 * 
 */
package com.services.order.save.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.services.order.save.api.common.CommonConstants;
import com.services.order.save.api.common.Message;
import com.services.order.save.api.domain.SaveOrderRequest;
import com.services.order.save.api.domain.SaveOrderResponse;

/**
 * @author PRASADBolla
 *
 */
@Service
public class SaveOrderAPIService {
	// temp persistance object
	public static List<SaveOrderRequest> saveOrderRequestList = new ArrayList<SaveOrderRequest>();

	public SaveOrderResponse saveOrder(SaveOrderRequest orderRequest) {
		saveOrderRequestList.add(orderRequest);
		return new SaveOrderResponse(new Message(
				CommonConstants.SUCCESS_MESSAGE_ID,
				CommonConstants.SUCCESS_MESSAGE_DESCRIPTION), "1234", "Save");
	}
}
