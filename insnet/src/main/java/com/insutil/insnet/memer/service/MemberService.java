package com.insutil.insnet.memer.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.insutil.insnet.common.exceptions.DataNotFoundedException;
import com.insutil.insnet.memer.model.MemberVO;
import com.insutil.insnet.memer.repository.JdbcMemberRepository;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	JdbcMemberRepository repo;
	
	public List<MemberVO> getMemberList() throws DataNotFoundedException {
		Optional<List<MemberVO>> result = repo.findAll();
		return result.orElseThrow(DataNotFoundedException::new);
	}
	
	public String getMemberListFormedJson() throws DataNotFoundedException{
		List<MemberVO> codeList = this.getMemberList();
		JsonArray jsonArray = new JsonArray();
		codeList.stream().map(obj -> obj.makeReturnToJson()).forEach(jsonArray::add);
		return new Gson().toJson(jsonArray);

	}	
}
