package com.insutil.insnet.memer.repository;

import java.util.List;
import java.util.Optional;

import com.insutil.insnet.memer.model.Member;

public interface MemberRepository {
	public Optional<List<Member>> findAll();
}
