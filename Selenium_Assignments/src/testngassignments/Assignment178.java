package testngassignments;

import org.testng.annotations.Test;

/* "Assignment 178
Create a class with 3 @atest annotation which contains 3 method 
Set priory to individual methods
1:Registration as priority 1
2:login as priority 2
3:logout as priority 3"
 * 
 */
public class Assignment178 {
	@Test(priority = 1)
	public void regitration() {
		System.out.println("register");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 3)
	public void logout() {
		System.out.println("logout");

	}

}
