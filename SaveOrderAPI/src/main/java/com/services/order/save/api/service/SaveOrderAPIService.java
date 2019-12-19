/**
 * 
 */
package com.services.order.save.api.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.services.order.save.api.common.CommonConstants;
import com.services.order.save.api.common.Message;
import com.services.order.save.api.domain.SaveOrderRequest;
import com.services.order.save.api.domain.SaveOrderResponse;
import com.services.order.save.api.persistance.ServiceRequests;
import com.services.order.save.api.persistance.ServiceRequestsRepository;

/**
 * @author PRASADBolla
 *
 */
@Service
public class SaveOrderAPIService {
	
	@Autowired
	private ServiceRequestsRepository serviceRequestsRepository;
	
	// temp persistance object
	public static List<SaveOrderRequest> saveOrderRequestList = new ArrayList<SaveOrderRequest>();

	public SaveOrderResponse saveOrder(SaveOrderRequest orderRequest) {
		
		ServiceRequests serviceRequest = new ServiceRequests();
		
		serviceRequest.setRequestdata(orderRequest.getRequestData());
		serviceRequest.setRequestdate(new Timestamp(orderRequest.getRequestDate().getTime()));
		serviceRequest.setRequestexpiry(new Timestamp(orderRequest.getRequestExpiry().getTime()));
		serviceRequest.setScheduledatetime(new Timestamp(orderRequest.getScheduleDateTime().getTime()));
		serviceRequest.setSchedulepriority(orderRequest.getSchedulePriority());
		serviceRequest.setScheduletype(Integer.parseInt(orderRequest.getScheduleType()));
		serviceRequest.setServiceid(Long.parseLong(orderRequest.getServiceId()));
		serviceRequest.setServicerequestid(Long.parseLong(orderRequest.getServiceRequestId()));
		serviceRequest.setServicescenarioid(Long.parseLong(orderRequest.getServiceScenarioId()));
		serviceRequest.setStatusid(Integer.parseInt(orderRequest.getStatusId()));
		serviceRequest.setUserid(Long.parseLong(orderRequest.getUserId()));
		serviceRequestsRepository.save(serviceRequest);
		
		//saveOrderRequestList.add(orderRequest);
		return new SaveOrderResponse(new Message(
				CommonConstants.SUCCESS_MESSAGE_ID,
				CommonConstants.SUCCESS_MESSAGE_DESCRIPTION), orderRequest.getServiceRequestId(),orderRequest.getServiceId());
	}
}
