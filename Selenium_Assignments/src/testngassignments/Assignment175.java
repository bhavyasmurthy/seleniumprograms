package testngassignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//"Assignment 175
/*
Create a class with 5 annotations
@BeforeMethod
@Test
@Test
@Test
@AfterMethod"
*/
public class Assignment175 {
	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod");
	}

	@Test

	public void testcase1() {
		System.out.println("Test 1");
	}

	@Test

	public void testcase2() {
		System.out.println("Test 2");
	}

	@Test
	public void testcase3() {
		System.out.println("Test 3");
	}

	@AfterMethod
	public void am() {
		System.out.println("AfterMethod");
	}

}
