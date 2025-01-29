package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.grotech.assignment.amazon.pages.Profilepage;
import org.testng.annotations.Test;

//Check if a user can successfully edit their profile information.
public class Testcase04_Check_useris_successful_edit_profile_information extends Testcase_LaunchandQuitBrowser {

	@Test(dataProvider = "login data")
	public void editProfileInformation(String username, String password) throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();
		LoginPage login = new LoginPage(driver);
		login.setusername(username);
		login.continue_button();
		login.setpwd(password);
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

//		profile.clickheightandweight();
//		profile.clickheightandweightaddbutton();
//		profile.enterheight(160);
//		profile.enterweight(60);
//		profile.clicksavebutton();
//		
//		profile.clickagegroup();
//		profile.clickheightandweightaddbutton();
//		profile.selectagegroupbutton();
		profile.clickoninterests();

		// profile.editprofile();
		// profile.editname();
		// profile.clickcontinuebtn();

	}

}
