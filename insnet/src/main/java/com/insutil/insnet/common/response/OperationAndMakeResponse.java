package com.insutil.insnet.common.response;

import org.springframework.util.StringUtils;

import com.insutil.insnet.common.response.OperationResponse.ResponseStatusEnum;


//@FunctionalInterface
public interface OperationAndMakeResponse {
//	OperationResponse operation(T t);
	static String defaultSuccessMsg() {
		return "Success to work your job";
	}
	
	static String defaultFailMsg() {
		return "Fail to work your job";
	}
	
	default public OperationResponse operationAndMakeResponse(boolean result) {
		OperationResponse response = new OperationResponse();
		if(result) {
			response.setOperationStatus(ResponseStatusEnum.SUCCESS);
			response.setOperationMessage(defaultSuccessMsg());
		} else {
			response.setOperationStatus(ResponseStatusEnum.ERROR);
			response.setOperationMessage(defaultFailMsg());
		}
		return response;
	}

	default public OperationResponse operationAndMakeResponse(boolean result, final String resultMsg) {
		OperationResponse response = this.operationAndMakeResponse(result);
		response.setOperationMessage(resultMsg);
		return response;
	}
	
	default public OperationResponse operationAndMakeResponse(ResponseStatusEnum statusEnum, final String resultMsg) {
		OperationResponse response = new OperationResponse();
		response.setOperationStatus(statusEnum);
		response.setOperationMessage(resultMsg);
		return response;
	}
}
