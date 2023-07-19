package plasticBankPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Gen_UTIL.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends BaseClass{
	public Login(AndroidDriver android_driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(android_driver), this);
	}
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
	    public WebElement login;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
	    public WebElement logout;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Settings\")")
	    public WebElement settings;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
	    public WebElement menu;
		@AndroidFindBy(xpath= "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
		public WebElement pnumber;
		@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
		public WebElement password;
		@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
		public WebElement loadedPage;
		
		
		
		public void login() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loadedPage)));
			try {
				WebDriverWait wait4 = new WebDriverWait(android_driver,Duration.ofSeconds(3));
				wait4.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(login)));
				login.click();
				} 
			
			catch(Exception e)
			{
				WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
				wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
				menu.click();
				WebDriverWait wait2 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
				wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
				logout.click();
				WebDriverWait wait3 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
				wait3.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(login)));
				login.click();
				
			}
			 
		}
		public void enterPhoneNumber() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pnumber)));
			pnumber.sendKeys(randomPhoneNumber);
			}
		public void enterPassword() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(password)));
			password.sendKeys("password1");
			password.click();
			
			android_driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		}
			
		public void menu() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
			menu.click();
			}
		public void settings() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
			settings.click();
			}
		
		
}
