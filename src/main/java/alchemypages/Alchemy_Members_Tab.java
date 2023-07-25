package alchemypages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Gen_UTIL.BaseClass;

public class Alchemy_Members_Tab extends BaseClass{
	
public Alchemy_Members_Tab(WebDriver chrome_driver) {
		
		PageFactory.initElements(chrome_driver, this);
		}
@FindBy(xpath ="//div[@class='partner-info name']")
public WebElement membertobeverified;
@FindBy(xpath="//div[@class='sidebar p-4']/div[contains(text(),'Members')]")
public WebElement members_TAB;
@FindBy(xpath ="//div[@class ='loader circle-loader']")
public WebElement circleLoader;
@FindBy(xpath="//label[text()='INCLUDE TAGS']/parent::div/div/div/input")
public WebElement includeATag;
@FindBy(xpath="//label[text()='EXCLUDE TAGS']/parent::div/div/div/input")
public WebElement excludeATag;
@FindBy(xpath="//i[@class='export-icon']")
public WebElement export;
@FindBy(xpath="//input[@placeholder='Name']")
public WebElement name;
@FindBy(xpath="//span[@class='pr-2']")
public WebElement memberType;
@FindBy(xpath="//input[@placeholder='Level']") 
public WebElement level;
@FindBy(xpath="//input[@placeholder='Gender']")
public WebElement gender;
@FindBy(xpath="//input[@placeholder='Age']") 
public WebElement age;
@FindBy(xpath="//input[@placeholder='Country']") 
public WebElement country;
@FindBy(xpath="//input[@placeholder='Phone']") 
public WebElement phone;
@FindBy(xpath="//input[@placeholder='Registered By']")
public WebElement registeredBy;
@FindBy(xpath="//input[@placeholder='Email']")
public WebElement email;
@FindBy(xpath="//input[@placeholder='Register Date']")
public WebElement registerDate;
@FindBy(xpath="//input[@placeholder='Tokens in Wallet']") 
public WebElement tokensInWallet;
@FindBy(xpath="//input[@placeholder='Total KG Recycled']") 
public WebElement totalKGRecycled;
@FindBy(xpath="//input[@placeholder='Monthly KG']")
public WebElement monthlyKG;
@FindBy(xpath="//input[@placeholder='Monthly Earnings']")
public WebElement monthlyEarnings;
@FindBy(xpath="//input[@placeholder='Last Active']") 
public WebElement lastActive;
@FindBy(xpath="//div[contains(@class,'pb-add-button')]")
public WebElement addIcon;
@FindBy(xpath="//div[contains(text(),'Gayas')]")
public WebElement memberAdded;
@FindBy(xpath="//input [@id='name']")
public WebElement editName;
@FindBy(xpath="//div[contains(text(),'Save')]")
public WebElement save;


//Locaters of WebElements After selecting  Member

@FindBy(xpath="//a[@id='ngb-nav-6']")
@CacheLookup public WebElement detailsTab;
@FindBy(xpath="//input[@id='phone']")
@CacheLookup public WebElement edit_phone;
@FindBy(xpath="//select[@id='country']")
@CacheLookup public WebElement edit_country;
@FindBy(xpath="//input[@id='name']") 
@CacheLookup public WebElement edit_name;
@FindBy(xpath="//input[@id='city']")
@CacheLookup public WebElement edit_city;
@FindBy(xpath="//input[@id='email']") @CacheLookup public WebElement edit_email;
@FindBy(xpath="//input[@id='birthDate']") @CacheLookup public WebElement edit_birthDate;
@FindBy(xpath="//input[@id='regDate']") @CacheLookup public WebElement edit_registrationDate;
@FindBy(xpath="//select[@id='gender']") @CacheLookup public WebElement edit_gender;
@FindBy(xpath="//input[@id='reqPin']") @CacheLookup public WebElement requirePinForSpendingToken;
@FindBy(xpath="//input[@id='bonusEligible']") @CacheLookup public WebElement bonusEligible;
@FindBy(xpath="//span[text()='Change password']") @CacheLookup public WebElement changePassword;
@FindBy(xpath="//span[normalize-space()='Direct token transfer']") @CacheLookup public WebElement directTokenTransfer;
@FindBy(xpath="//span[normalize-space()='Reclaim Tokens']") @CacheLookup public WebElement reclaimTokens;
@FindBy(xpath="//span[normalize-space()='Delete Account']") @CacheLookup public WebElement deleteAccount;
@FindBy(xpath="//span[text()='Edit']") @CacheLookup public WebElement edit;
@FindBy(xpath="//div[text()=' Suspend Account ']/input") @CacheLookup public WebElement suspendAccount;

@FindBy(xpath="//div[@class='pb-button green']") @CacheLookup public WebElement saveButton;
@FindBy(xpath="//div[@class='pb-button grey']") @CacheLookup public WebElement cancelButton;
@FindBy(xpath="//a[@id='ngb-nav-7']") @CacheLookup public WebElement exchangeHistory;
@FindBy(xpath="//a[@id='ngb-nav-8']") @CacheLookup public WebElement tags;
//span[contains(text(),'Edit')]

@FindBy(xpath="//button[normalize-space()='OK']") @CacheLookup public WebElement ok;
@FindBy(xpath="//button[normalize-space()='Cancel']") @CacheLookup public WebElement cancel;


public void waitforloader() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(circleLoader)));
}


public void verifyMember(String name) {
	members_TAB.click();
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone));
	phone.click();
	phone.sendKeys("63"+randomNumberDuringSignUp);
	wait.until(ExpectedConditions.elementToBeClickable(memberAdded));
	String verifyName= memberAdded.getText();
	
	if (verifyName.equals(name)) {
	    System.out.println("Name is verified");
	    
	} else {
	    System.out.println("Name verification failed");
		}
	}
public void editMemberDetails() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(edit));
	edit.click();
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.elementToBeClickable(editName));
	editName.clear();
	editName.sendKeys("Gayas Khan");
	WebDriverWait wait2 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait2.until(ExpectedConditions.elementToBeClickable(save));
	save.click();
	
}
public void suspendMember() {
	suspendAccount.click();
	ok.click();
}
public void refresh() {
	members_TAB.click();
}


}
