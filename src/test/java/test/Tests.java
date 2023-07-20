package test;

import org.testng.annotations.Test;

import Gen_UTIL.BaseClass;
import plasticBankPages.Login;
import plasticBankPages.SignUpPage;

public class Tests extends BaseClass{
	public String name= "Gayas";
	public String password= "password1";
	
	SignUpPage signup= new SignUpPage(android_driver);
	Login login = new Login(android_driver);
	
	@Test(enabled=false)
	public void login(String password) throws InterruptedException {
		login.loginRandom(this.password);
		
	}
	
	@Test(priority=0)
	public void signUp(String name,String password)throws InterruptedException {
		
		signup.signUpRandom(this.name,this.password);
		login.loginRandom(this.password);
		Thread.sleep(5000);
		
	}

}
