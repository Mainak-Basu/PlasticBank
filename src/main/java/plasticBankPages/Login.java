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
		@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").text(\"Log in\")")
	    public WebElement loginButton;
		@AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.Button\").instance(1)")
		public WebElement finalLogin;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
	    public WebElement logoutButton;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Settings\")")
	    public WebElement settingsButton;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
	    public WebElement menuButton;
		@AndroidFindBy(xpath= "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
		public WebElement phoneNumberTextFeild;
		@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
		public WebElement passwordTextFeild;
		@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
		public WebElement loadedPage;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
		public WebElement permission;
		@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
		public WebElement editablePhone;
		@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
		public WebElement editableFullName;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
		public WebElement oKButton;
		@AndroidFindBy(uiAutomator = "new UiSelector().text(\"MEMBER\")")
		public WebElement suspendedMember;
		
		
		public void clickSuspendedMemebr() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(suspendedMember)));
			suspendedMember.click();
		}
		
		public void oK() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
			oKButton.click();
		}
		
		
		public void enterRandomPhoneNumber(String randomNumber) {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextFeild)));
			phoneNumberTextFeild.clear();
			phoneNumberTextFeild.sendKeys(randomNumber);
			}
		
		public void enterPhoneNumber(String phoneNumber) {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextFeild)));
			phoneNumberTextFeild.sendKeys(phoneNumber);
			}
		
		public void enterPassword(String password) {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(passwordTextFeild)));
			passwordTextFeild.clear();
			passwordTextFeild.sendKeys(password);
					
		}
			
		public void menu() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
			menuButton.click();
			}
		public void logout() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logoutButton)));
			logoutButton.click();
			}
		public void settings() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
			settingsButton.click();
			}
		public void clickloginButton() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loginButton)));
			loginButton.click();
		}
		public void clickloginButtonfinal() {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(finalLogin)));
			finalLogin.click();
		}
		public void loginRandom(String randomNumber,String password) {
			try{
				clickloginButton();
			}catch(Exception e) {
				clickloginButtonfinal();
			}
			enterRandomPhoneNumber(randomNumber);
			enterPassword(password);
			clickloginButtonfinal();
		}
		public void login(String phoneNumber, String password) {
			WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
			permission.click();
			clickloginButton();
			enterPhoneNumber(phoneNumber);
			enterPassword(password);
			clickloginButtonfinal();

		}
}
