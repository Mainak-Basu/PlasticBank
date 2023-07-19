package test;

import org.testng.annotations.Test;

import Gen_UTIL.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import plasticBankPages.Login;
import plasticBankPages.SignUpPage;

public class Tests extends BaseClass{
	@Test(enabled=false)
	public void login() throws InterruptedException {
		Login login = new Login(android_driver);
		login.login();
		login.enterPhoneNumber();
		login.enterPassword();
		login.menu();
		login.settings();
		chrome_driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.10.0");
	}
	
	@Test(priority=0)
	public void signUp() throws InterruptedException {
		SignUpPage s= new SignUpPage(android_driver);
		Login login = new Login(android_driver);
		s.clickSignUpButton();
		s.chooseCollectorsPannel();
		s.clickBecomeAColectorButton();
		s.fillDetails();
		s.verifyAccount();
		s.clickmenu();
		s.clicklogout();
		login.login();
		login.enterPhoneNumber();
		login.enterPassword();
		Thread.sleep(5000);
		
	}

}
