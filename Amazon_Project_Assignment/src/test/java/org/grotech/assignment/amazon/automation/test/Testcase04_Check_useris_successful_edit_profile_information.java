package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.grotech.assignment.amazon.pages.Profilepage;
import org.testng.annotations.Test;

//Check if a user can successfully edit their profile information.
public class Testcase04_Check_useris_successful_edit_profile_information extends Testcase_LaunchandQuitBrowser {

	@Test(dataProvider = "login data")
	public void editProfileInformation(String username, String password) {
		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();
		LoginPage login = new LoginPage(driver);
		login.setusername(username);
		login.continue_button();
		login.setpwd(password);
		login.signin();
		// to click on manage profiles link
		home.hoveroverToAccountAndList();
		home.clickonprofiles();
		// to select adult profile
		Profilepage profile = new Profilepage(driver);
		profile.clickviewlink();

		// selecting department type
		profile.clickpreferrerddepartment();
		profile.clickpreferreddepartmentaddbutton();
		profile.changedepartmenttype();
		profile.savedepartmenttypebtn();

		// setting height and weight
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
