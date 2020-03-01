package TS;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import SR.Cal;

public class Jtes {
	/*@BeforeClass
	void setup() throws Exception {
		
	}
	
	@Test
	void tearDown() throws Exception
	{
		
	}*/
	@Test
	public void test() {
		Cal ob=new Cal();
		int act=ob.add(4,2);
		assertTrue(6==act);

	}

}

