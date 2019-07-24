package com.insutil.insnet.memer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.insutil.insnet.memer.model.Member;

@Repository
public class JdbcMemberRepository implements MemberRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Optional<List<Member>> findAll() {
		String query = "SELECT id_user as username FROM tn_qa_user";
		return Optional.ofNullable(jdbcTemplate.query(query, new BeanPropertyRowMapper<Member>(Member.class)));
	}
	
}
