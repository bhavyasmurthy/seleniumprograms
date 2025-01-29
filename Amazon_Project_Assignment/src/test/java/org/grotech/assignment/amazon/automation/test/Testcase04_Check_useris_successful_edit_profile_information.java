package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.grotech.assignment.amazon.pages.Profilepage;
import org.testng.annotations.Test;

//Check if a user can successfully edit their profile information.
public class Testcase04_Check_useris_successful_edit_profile_information extends Testcase_LaunchandQuitBrowser {
	@Test
	public void editProfileInformation() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();
		LoginPage login = new LoginPage(driver);
		login.setusername();
		login.continue_button();
		login.setpwd();
		login.signin();
		// to click on manageprofiles link
		home.hoveroverToAccountAndList();
		home.clickonprofiles();

		// to select adult profile
		Profilepage profile = new Profilepage(driver);
		profile.clickviewlink();

//		profile.clickpreferrerddepartment();
//		profile.clickpreferreddepartmentaddbutton();
//		profile.clickdepartmenttype();
//		profile.savedepartmenttypebtn();

		profile.clickheightandweight();
		profile.clickheightandweightaddbutton();
		profile.enterheight(160);
		profile.enterweight(6);
		Thread.sleep(2000);

		// profile.savedepartmenttypebtn();
		profile.clicksavebutton();

		profile.clickagegroup();
		profile.clickheightandweightaddbutton();
		Thread.sleep(2000);
		profile.selectagegroupbutton();
		Thread.sleep(2000);
		profile.clicksavebutton();

		profile.clickoninterests();
		Thread.sleep(2000);
		profile.clicksavebutton();

		// profile.editprofile();
		// profile.editname();
		// profile.clickcontinuebtn();

	}

}
