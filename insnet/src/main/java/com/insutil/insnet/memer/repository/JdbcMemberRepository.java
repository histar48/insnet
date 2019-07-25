package com.insutil.insnet.memer.repository;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.GenericStoredProcedure;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Repository;

import com.insutil.insnet.memer.model.MemberVO;

@Repository
public class JdbcMemberRepository implements MemberRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;

	@Autowired
	private EntityManager entityManager;
	
//	@Override
//	public Optional<List<MemberVO>> findAll() {
//		String query = "SELECT id_user as username FROM tn_qa_user";
//		return Optional.ofNullable(jdbcTemplate.query(query, new BeanPropertyRowMapper<MemberVO>(MemberVO.class)));
//	}

	/*
	 * @Override public Optional<List<MemberVO>> findAll() { StoredProcedure
	 * procedure = new GenericStoredProcedure();
	 * procedure.setDataSource(dataSource); procedure.setSql("SP_SELECT_MEMBER");
	 * procedure.setFunction(false);
	 * 
	 * SqlParameter[] parameters = { new SqlParameter(Types.BIGINT), new
	 * SqlOutParameter("status_out", Types.JAVA_OBJECT) };
	 * 
	 * procedure.setParameters(); procedure.compile();
	 * 
	 * // SP가 파라미터 선언되지 않았는데, 파라미터 넣으면 안된다. setParameters(), execute(0, ..); 둘다
	 * Map<String, Object> result = procedure.execute();
	 * 
	 * return null; }
	 */
	@Override
	public Optional<List<MemberVO>> findAll() {
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("SP_SELECT_MEMBER", MemberVO.class);
//		query.registerStoredProcedureParameter(1, void.class, ParameterMode.REF_CURSOR);
//		query.registerStoredProcedureParameter(2, Long.class, ParameterMode.IN);
		
//		query.setParameter(2, 1L);
		
		List<MemberVO> result = query.getResultList();
		result.stream().forEach(System.out::println);
//		List<MemberVO> personComments = query.getResultList();
		return null;
	}
}
