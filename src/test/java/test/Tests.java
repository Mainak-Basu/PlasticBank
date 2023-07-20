package test;

import org.testng.annotations.Test;

import Gen_UTIL.BaseClass;
import plasticBankPages.Login;
import plasticBankPages.SignUpPage;

public class Tests extends BaseClass{
	public String name= "Gayas";
	public String password= "password1";
	
	
	
	
	@Test(enabled=false)
	public void login(String password) throws InterruptedException {
		Login login = new Login(android_driver);
		login.loginRandom(this.password);
		
	}
	
	@Test(priority=0)
	public void signUp()throws InterruptedException {
		SignUpPage signup= new SignUpPage(android_driver);
		signup.signUpRandom(this.name,this.password);
		Login login = new Login(android_driver);
		login.loginRandom(this.password);
		Thread.sleep(5000);
		
	}

}
