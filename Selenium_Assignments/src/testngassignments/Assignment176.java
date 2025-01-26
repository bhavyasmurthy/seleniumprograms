package testngassignments;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
"Assignment 176
Create a class with 4 annotations
@BeforeMethod
@Test
@Test
@Test
*/
public class Assignment176 {
	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod");
	}

	@Test
	public void tc1() {
		System.out.println("testcase1");
	}

	@Test
	public void tc2() {
		System.out.println("testcase2");
	}

	@Test
	public void tc3() {
		System.out.println("testcase3");
	}

}
