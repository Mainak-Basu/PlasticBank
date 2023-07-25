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

public class Alchemy_Branches_Tab extends BaseClass{
public Alchemy_Branches_Tab(WebDriver chrome_driver) {
		
		PageFactory.initElements(chrome_driver, this);
		}

@FindBy(xpath ="//div[@class ='loader circle-loader']")
public WebElement circleLoader;
@FindBy(xpath="//div[@class='sidebar p-4']/div[contains(text(),'Branches')]")
public WebElement branches_TAB;
@FindBy(xpath="//div[contains(text(),'Gayas')]")
public WebElement branchAdded;
@FindBy(xpath ="//input[@placeholder='Phone']")
public WebElement phoneSearch;
@FindBy(xpath ="//input[@name='name']")
public WebElement editNameField;
@FindBy(xpath="//span[text()='Edit']") @CacheLookup public WebElement edit;
@FindBy(xpath="//div[contains(text(),'Save')]")
public WebElement save;
@FindBy(xpath="//div[text()=' Suspend Account ']/input") @CacheLookup public WebElement suspendAccount;
@FindBy(xpath="//button[normalize-space()='OK']") @CacheLookup public WebElement ok;


public void waitforloader() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(circleLoader)));
}



public void editBranchInAlchemy() {
	branches_TAB.click();
	waitforloader();
	phoneSearch.clear();
	System.out.println("+63"+randomPhoneNumberSignUp);
	phoneSearch.sendKeys("+63"+randomPhoneNumberSignUp);
	
	waitforloader();
	branchAdded.click();
	edit.click();
	editNameField.clear();
	editNameField.sendKeys("Gayas Branch"+randomLastName);
	save.click();
}
public void suspendMember() {
	suspendAccount.click();
	ok.click();
}


}
