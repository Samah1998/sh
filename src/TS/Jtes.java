package TS;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import SR.Cal;

public class Jtes {
	
	static Cal Obj1;
	
	@Before
	public void  setup() throws Exception {
	 Obj1 = new Cal();
	}
	
	@Test
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void test1() {
		int act=Obj1.add(4,2);
		assertTrue(6==act);
	}
	
	@Test
	public void test2() {
		int act=Obj1.add(-4,2);
		assertTrue(-2==act);
	}
	
	@Test
	public void test3() {
		int act=Obj1.add(4,-2);
		assertTrue(2==act);
	}
	
	@Test
	public void test4() {
		int act=Obj1.add(-4,-2);
		assertTrue(-6==act);
	}
	
	@Test
	public void test5() {
		int act=Obj1.add(7,-2);
		assertTrue(5==act);
	}

}

