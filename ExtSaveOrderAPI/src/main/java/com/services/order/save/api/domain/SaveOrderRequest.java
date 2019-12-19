/**
 * 
 */
package com.services.order.save.api.domain;

import java.util.Date;

/**
 * @author PRASADBolla
 *
 */
public class SaveOrderRequest {
	public String serviceRequestId;
	public String serviceId;
	public String serviceScenarioId;
	public String userId;
	public String requestData;
	public Date requestDate;
	public Date requestExpiry;
	public String statusId;
	public String scheduleType;
	public Date scheduleDateTime;
	public int schedulePriority;

	/**
	 * Default constructor
	 */
	public SaveOrderRequest() {

	}

	/**
	 * @return the serviceRequestId
	 */
	public String getServiceRequestId() {
		return serviceRequestId;
	}

	/**
	 * @param serviceRequestId
	 *            the serviceRequestId to set
	 */
	public void setServiceRequestId(String serviceRequestId) {
		this.serviceRequestId = serviceRequestId;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the serviceScenarioId
	 */
	public String getServiceScenarioId() {
		return serviceScenarioId;
	}

	/**
	 * @param serviceScenarioId
	 *            the serviceScenarioId to set
	 */
	public void setServiceScenarioId(String serviceScenarioId) {
		this.serviceScenarioId = serviceScenarioId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the requestData
	 */
	public String getRequestData() {
		return requestData;
	}

	/**
	 * @param requestData
	 *            the requestData to set
	 */
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	/**
	 * @return the requestDate
	 */
	public Date getRequestDate() {
		return requestDate;
	}

	/**
	 * @param requestDate
	 *            the requestDate to set
	 */
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	/**
	 * @return the requestExpiry
	 */
	public Date getRequestExpiry() {
		return requestExpiry;
	}

	/**
	 * @param requestExpiry
	 *            the requestExpiry to set
	 */
	public void setRequestExpiry(Date requestExpiry) {
		this.requestExpiry = requestExpiry;
	}

	/**
	 * @return the statusId
	 */
	public String getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId
	 *            the statusId to set
	 */
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the scheduleType
	 */
	public String getScheduleType() {
		return scheduleType;
	}

	/**
	 * @param scheduleType
	 *            the scheduleType to set
	 */
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	/**
	 * @return the scheduleDateTime
	 */
	public Date getScheduleDateTime() {
		return scheduleDateTime;
	}

	/**
	 * @param scheduleDateTime
	 *            the scheduleDateTime to set
	 */
	public void setScheduleDateTime(Date scheduleDateTime) {
		this.scheduleDateTime = scheduleDateTime;
	}

	/**
	 * @return the schedulePriority
	 */
	public int getSchedulePriority() {
		return schedulePriority;
	}

	/**
	 * @param schedulePriority
	 *            the schedulePriority to set
	 */
	public void setSchedulePriority(int schedulePriority) {
		this.schedulePriority = schedulePriority;
	}

	/**
	 * @param serviceRequestId
	 * @param serviceId
	 * @param serviceScenarioId
	 * @param userId
	 * @param requestData
	 * @param requestDate
	 * @param requestExpiry
	 * @param statusId
	 * @param scheduleType
	 * @param scheduleDateTime
	 * @param schedulePriority
	 */
	public SaveOrderRequest(String serviceRequestId, String serviceId,
			String serviceScenarioId, String userId, String requestData,
			Date requestDate, Date requestExpiry, String statusId,
			String scheduleType, Date scheduleDateTime, int schedulePriority) {
		super();
		this.serviceRequestId = serviceRequestId;
		this.serviceId = serviceId;
		this.serviceScenarioId = serviceScenarioId;
		this.userId = userId;
		this.requestData = requestData;
		this.requestDate = requestDate;
		this.requestExpiry = requestExpiry;
		this.statusId = statusId;
		this.scheduleType = scheduleType;
		this.scheduleDateTime = scheduleDateTime;
		this.schedulePriority = schedulePriority;
	}
}
