package test;

import org.testng.annotations.Test;
import Gen_UTIL.BaseClass;
import alchemypages.AlchemyLoginPage;
import alchemypages.Alchemy_Branches_Tab;
import alchemypages.Alchemy_Members_Tab;
import alchemypages.Alchemy_Processors_Tab;
import plasticBankPages.CreateBusinessPage;
import plasticBankPages.Login;
import plasticBankPages.SignUpPage;
import plasticBankPages.Transaction;

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
	Login l1=new Login(android_driver);
	l1.menu();
	  l1.logout();
	  l1.loginRandom(randomNumberMemberToBranch, password);
	  l1.menu();
	  l1.logout();
	  Alchemy_Members_Tab amt1 = new Alchemy_Members_Tab(chrome_driver);
	  amt1.suspendMember(); 
	  Login l3=new Login(android_driver);
	  l3.loginRandom(randomNumberMemberToBranch, password);
	  l3.oK();
	  l3.enterRandomPhoneNumber(randomNumberDuringSignUp);
	  l3.enterPassword(password);
	  l3.clickloginButtonfinal();
	  l3.clickSuspendedMemebr();
	  l3.oK();
	  Alchemy_Branches_Tab abt= new Alchemy_Branches_Tab(chrome_driver);
	  abt.editBranchInAlchemy(randomNumberDuringSignUp);
	  Login l2=new Login(android_driver);
	  l2.menu();
	  l2.logout();
	  l2.loginRandom(randomNumberDuringSignUp, password);
	  l2.menu();
	  Thread.sleep(4000);
	  l2.logout();
}


@Test(priority=2)  
public void myTest() throws InterruptedException {
	Login l=new Login(android_driver);
	l.loginRandom(randomNumberDuringSignUp,password);
	CreateBusinessPage cbp =new CreateBusinessPage(android_driver);
    cbp.createProcessor();
     Alchemy_Processors_Tab apt = new Alchemy_Processors_Tab(chrome_driver);
    apt.SearchAndEditProcessorInAlchemy(randomNumberDuringSignUp);
    Thread.sleep(2000);
    Login l1=new Login(android_driver);
    l1.menu();
    Thread.sleep(2000);
    l1.logout();
	l1.loginRandom(randomNumberDuringSignUp, password);
	l1.menu();
	Thread.sleep(2000);
	l1.logout();
}

@Test
public void transaction() throws InterruptedException {
	
	Login l=new Login(android_driver);
	l.login("+63789654", password);
	Transaction t= new Transaction(android_driver);
	t.getSibakFrom("+63123456789987654321");
}

}
