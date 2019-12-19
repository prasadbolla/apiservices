/**
 * 
 */
package com.services.order.save.api.common;

/**
 * @author PRASADBolla
 *
 */
public class Message {
	public String id;
	public String description;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param id
	 * @param description
	 */
	public Message(String id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * public Message getSuccessMessage() { return new
	 * Message(CommonConstants.SUCCESS_MESSAGE_ID,
	 * CommonConstants.SUCCESS_MESSAGE_DESCRIPTION);
	 * 
	 * }
	 */
}
