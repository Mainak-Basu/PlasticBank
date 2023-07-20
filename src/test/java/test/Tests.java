package test;

import org.testng.annotations.Test;

import Gen_UTIL.BaseClass;
import plasticBankPages.CreateBusinessPage;
import plasticBankPages.Login;
import plasticBankPages.SignUpPage;

public class Tests extends BaseClass{
	public String name= "Gayas";
	public String password= "password1";
	public String phoneNumber = "+63789654";
	
	
	
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
@Test(priority=1)
public void createBanchAndMember() throws InterruptedException {
	Login login=new Login(android_driver);
	login.login(this.phoneNumber, this.password);
	CreateBusinessPage cpb = new CreateBusinessPage(android_driver);
	cpb.createBranch();
	cpb.addMemberToCreatedBranch();
}
}
