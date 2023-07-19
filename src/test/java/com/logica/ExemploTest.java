package com.logica;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExemploTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}
	
	@Test
	public void test02() {
		System.out.println("test02");
	}

	@Test
	public void test01() {
		System.out.println("test01");
	}
	
	

}
