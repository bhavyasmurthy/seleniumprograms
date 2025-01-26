package systemscenariosendtoend.Amazon_Project_1;

import org.testng.Assert;
import org.testng.annotations.Test;

//Test if a new user can successfully register.
public class Testcase01_NewUser_Register extends Testcase_LaunchandQuitBrowser {
	@Test
	public void register_new_user() {
		HomePage homepage = new HomePage(driver);
		homepage.hoveroverToAccountAndList();
		homepage.clickresgister();

		Registration_Page register = new Registration_Page(driver);
		// String s1 = register.getcreateaccountpageheader();
		// Assert.assertEquals(s1, "Create Account");
		// Assert.assertEquals(true, s1);
		Assert.assertTrue(register.isPageDisplayed());
		register.setUsername();
		Assert.assertTrue(register.isUsernameDisplayed());
		register.setPhoneno();
		Assert.assertTrue(register.isPasswordDisplayed());
		register.setPassword();
		register.verifymobileno();
	}

}
