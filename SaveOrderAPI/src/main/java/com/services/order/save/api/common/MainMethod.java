/**
 * 
 */
package com.services.order.save.api.common;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.order.save.api.domain.SaveOrderRequest;

/**
 * @author PRASADBolla
 *
 */
public class MainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SaveOrderRequest saveOrderRequest = new SaveOrderRequest("12243",
				"serivceId_11", "serviceScenario_id", "userId", "data",
				new Date(), new Date(), "statusId_11", "scheduleType_type",
				new Date(), 0);
		// Creating Object of ObjectMapper define in Jakson Api
		ObjectMapper Obj = new ObjectMapper();

		// get SaveOrderRequest object as a json string
		String jsonStr = null;
		;
		try {
			jsonStr = Obj.writeValueAsString(saveOrderRequest);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Displaying JSON String
		System.out.println(jsonStr);

	}

}
