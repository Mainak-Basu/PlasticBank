package plasticBankPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Gen_UTIL.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Transaction extends BaseClass{
public Transaction(AndroidDriver android_driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(android_driver), this);
	}

@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement search;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(31)")
public WebElement searchResult;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"checkmark\")")
public WebElement checkmark;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Sibak\")")
public WebElement sibak;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"search outline\")")
public WebElement searchOutline;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement requiredQuantity;

WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
public void getSibakFrom(String number) throws InterruptedException {
	Thread.sleep(5000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(search)));
	search.sendKeys(number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark)));
    checkmark.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(sibak)));
	sibak.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("1000");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark)));
    checkmark.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark)));
    checkmark.click();
    
    
	/*
	 * wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	 * checkmark))); checkmark.click();
	 */
    
}


}
