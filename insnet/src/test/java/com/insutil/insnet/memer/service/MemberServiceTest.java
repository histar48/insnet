package com.insutil.insnet.memer.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.insutil.insnet.common.exceptions.DataNotFoundedException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceTest {

	@Autowired
	MemberService memberService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws DataNotFoundedException {
		String data = memberService.getMemberListFormedJson();
		System.out.println(data);
	}

}
