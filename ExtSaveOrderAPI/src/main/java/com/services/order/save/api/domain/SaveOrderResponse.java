/**
 * 
 */
package com.services.order.save.api.domain;

import com.services.order.save.api.common.Message;

/**
 * @author PRASADBolla
 *
 */
public class SaveOrderResponse {
public Message message;
public String requestId;
public String requestStatus;
/**
 * @param message
 * @param requestId
 * @param requestStatus
 */
public SaveOrderResponse(Message message, String requestId, String requestStatus) {
	super();
	this.message = message;
	this.requestId = requestId;
	this.requestStatus = requestStatus;
}
/**
 * @return the message
 */
public Message getMessage() {
	return message;
}
/**
 * @param message the message to set
 */
public void setMessage(Message message) {
	this.message = message;
}
/**
 * @return the requestId
 */
public String getRequestId() {
	return requestId;
}
/**
 * @param requestId the requestId to set
 */
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
/**
 * @return the requestStatus
 */
public String getRequestStatus() {
	return requestStatus;
}
/**
 * @param requestStatus the requestStatus to set
 */
public void setRequestStatus(String requestStatus) {
	this.requestStatus = requestStatus;
}
}
