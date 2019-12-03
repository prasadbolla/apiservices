/**
 * 
 */
package com.services.serviceInfo.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.services.serviceInfo.api.domain.GetServiceInfoResponse;

/**
 * @author PRASADBolla
 *
 */
@Service
public class GetServiceInfoService {
	public static List<GetServiceInfoResponse> getServiceInfoList = new ArrayList<GetServiceInfoResponse>();
	static {
		getServiceInfoList.add(new GetServiceInfoResponse("1", "Azure Sql DB",
				"active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("2", "Azure  xx DB",
				"active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("3", "Azure xxx DB",
				"active", "12345"));
		getServiceInfoList.add(new GetServiceInfoResponse("4", "Azure xxx DB",
				"active", "12345"));
	}

	/**
	 * @return the getServiceInfoList
	 */
	public List<GetServiceInfoResponse> getGetServiceInfoList() {
		return getServiceInfoList;
	}
}
