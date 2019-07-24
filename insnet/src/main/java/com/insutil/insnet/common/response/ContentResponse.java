package com.insutil.insnet.common.response;

public class ContentResponse<T> extends OperationResponse {
	public ContentResponse(ResponseStatusEnum operationStatus, String operationMessage) {
		super(operationStatus, operationMessage);
		// TODO Auto-generated constructor stub
	}

	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T data) {
		this.content = data;
	}
	
	public void setSuccessResponse(ResponseStatusEnum result, String msg, T content) {
		super.setOperationStatus(result);
		super.setOperationMessage(msg);
		this.content = content;
	}

}
