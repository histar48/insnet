package com.insutil.insnet.memer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insutil.insnet.common.exceptions.DataNotFoundedException;
import com.insutil.insnet.common.response.ContentResponse;
import com.insutil.insnet.common.response.OperationResponse;
import com.insutil.insnet.common.response.OperationResponse.ResponseStatusEnum;
import com.insutil.insnet.memer.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	@ResponseBody
	@GetMapping(value = {"/members"}) 
	public ResponseEntity<OperationResponse> getMembersInfo() throws DataNotFoundedException {
		ContentResponse<String> response = new ContentResponse<>(ResponseStatusEnum.SUCCESS, "SUCCESS");
		response.setContent(service.getMemberListFormedJson());
		return new ResponseEntity<OperationResponse>(response, HttpStatus.OK);
	}	
}
