package testngassignments;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment177 {
	@BeforeSuite
	public void as() {
		System.out.println("BeforeSuite");
	}

	@Test
	public void tc1() {
		System.out.println("Test1");
	}

	@Test
	public void tc2() {
		System.out.println("Test2");
	}

	@Test
	public void tc3() {
		System.out.println("Test3");
	}
}
