package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HoPage;
import org.grotech.assignment.amazon.pages.Regpage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test1 extends LandQ {
	@Test
	public void register_signin() throws InterruptedException {
		HoPage home = new HoPage(driver);
		Thread.sleep(2000);
		home.selectcookies();
		home.signinclick();
		home.signupclick();

		Regpage reg = new Regpage(driver);
		reg.choosetitle();
		reg.chooseoptionstitle();
		reg.enterfname("Bhavya");
		reg.enterlname("S Murthy");
		reg.isdateofbirthdisplayed();
		// reg.choosecalendar();
		// reg.choosemonth("Apr");
		reg.enteremail("bhavyasmurthy@gmail.com");
		reg.cofirmmailid(Keys.CONTROL + "V");
		reg.contactnumber("9611700318");
		reg.contactnumber(Keys.CONTROL + "A");
		Thread.sleep(1000);
		reg.contactnumber(Keys.CONTROL + "C");
		Thread.sleep(1000);

		reg.cofirmcontactdetails(Keys.CONTROL + "V");
		// reg.cofirmcontactdetails("9611700318");
		Thread.sleep(2000);
		reg.selectCheckbox();

	}

}
