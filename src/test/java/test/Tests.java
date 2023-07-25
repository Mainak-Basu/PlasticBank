package test;

import org.testng.annotations.Test;
import Gen_UTIL.BaseClass;
import alchemypages.AlchemyLoginPage;
import alchemypages.Alchemy_Branches_Tab;
import alchemypages.Alchemy_Members_Tab;
import plasticBankPages.CreateBusinessPage;
import plasticBankPages.Login;
import plasticBankPages.SignUpPage;

public class Tests extends BaseClass{
	
	@Test(priority=0)
	public void signUp()throws InterruptedException {
		
		  SignUpPage signup= new SignUpPage(android_driver);
		  signup.signUpRandom(name,password);
		 signup.clickmenu();
		 signup.clicklogout();
				
		  Login login = new Login(android_driver);
		  login.loginRandom(randomNumberDuringSignUp,password);
		  login.menu(); 
		  login.logout();
		 
		  AlchemyLoginPage alp = new AlchemyLoginPage(chrome_driver);
			alp.alc_adminlogin("+919560071590", "123456a");
			Alchemy_Members_Tab amt = new Alchemy_Members_Tab(chrome_driver);
			amt.members_TAB.click();
			amt.waitforloader();
			amt.phone.clear();
			amt.phone.sendKeys(randomNumberDuringSignUp);
			amt.memberAdded.click();
			assert amt.memberAdded.getText().contains("Gayas");
	}
@Test(priority=1)
public void createBanchAndMember() throws InterruptedException {
	Login l=new Login(android_driver);
	l.loginRandom(randomNumberDuringSignUp, password);
	CreateBusinessPage cpb = new CreateBusinessPage(android_driver);
	cpb.createBranch();
	cpb.addMemberToCreatedBranch(randomPhoneNumberMemberToBranch);
	Alchemy_Members_Tab amt = new Alchemy_Members_Tab(chrome_driver);
	amt.members_TAB.click();
	amt.waitforloader();
	amt.phone.click();
	amt.phone.clear();
	amt.phone.sendKeys(randomNumberMemberToBranch);
	amt.waitforloader();
	
	amt.memberAdded.click();
	assert amt.memberAdded.getText().contains("Gayas");
	amt.editMemberDetails();
	l.menu();
	  l.logout();
	  l.loginRandom(randomNumberMemberToBranch, password);
	  l.menu();
	  l.logout();
	amt.suspendMember(); 
	  l.loginRandom(randomNumberMemberToBranch, password);
	  l.oK();
	  l.enterRandomPhoneNumber(randomNumberDuringSignUp);
	  l.enterPassword(password);
	  l.clickloginButtonfinal();
	  l.clickSuspendedMemebr();
	  l.oK();
	  Alchemy_Branches_Tab abt= new Alchemy_Branches_Tab(chrome_driver);
	  abt.editBranchInAlchemy();
	  l.menu();
	  l.logout();
	  l.loginRandom(randomNumberDuringSignUp, password);
	  l.menu();
	  Thread.sleep(4000);
	  l.logout();
	  

	  
		  
	 
}
}
