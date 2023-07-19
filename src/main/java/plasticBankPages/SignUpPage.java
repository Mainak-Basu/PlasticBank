package plasticBankPages;

import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Gen_UTIL.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpPage extends BaseClass{
	
public SignUpPage(AndroidDriver android_driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(android_driver), this);
	}
//elements:-
@AndroidFindBy(xpath= "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
public WebElement loginPagePhoneNumberTextField;
@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
public WebElement loginPagePasswordTextField;
@AndroidFindBy(xpath= "//android.view.View[12]/android.view.View/android.widget.CheckBox/android.widget.TextView")
public WebElement termsAndConditionsCheckBox;
@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View[9]/android.view.View/android.widget.EditText")
public WebElement passwordTextField;
@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View[11]/android.view.View/android.widget.EditText")
public WebElement confirmPasswordTextField;
@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Shutter\"]")
public WebElement shutter;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View[8]/android.view.View/android.widget.EditText")
public WebElement phoneNumberTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
public WebElement signUpButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Use Photo\")")
public WebElement usePhoto;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Skip for now\")")
public WebElement skipButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gender\")")
public WebElement genderField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"skip_video\")")
public WebElement skipvideoButton;
@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
public WebElement loadedPage;
@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
public WebElement menu;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
public WebElement logout;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Male\")")
public WebElement male;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collectors\")")
public WebElement collectorsPannel;
@AndroidFindBy(xpath = "//android.view.View[3]/android.view.View/android.view.View/android.widget.Button")
public WebElement becomeACollectorButton;
@AndroidFindBy(xpath= "//android.view.View[3]/android.view.View/android.widget.EditText")
public WebElement firstNameTextField;
@AndroidFindBy(xpath= "//android.view.View[5]/android.view.View/android.widget.EditText")
public WebElement lastNameTextField;
@AndroidFindBy(xpath= "//android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView")
public WebElement phoneCountryCodedropdown;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Philippines (+63)\")")
public WebElement selectPhilipines;
@AndroidFindBy(xpath= "//android.app.Dialog/android.view.View")
public WebElement countrylist;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
public WebElement oKButton;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"DD/MM/YYYY\")")
public WebElement dateOfBirthTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"Verify Phone\")")
public WebElement  verifyPhoneText;
@AndroidFindBy(xpath= "//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[3]")
public WebElement years;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Qatar (+974)\")")
public WebElement selectdummycountry;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DONE\")")
public WebElement doneButton;
@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()")
public WebElement scrollablePhilipines;
@AndroidFindBy(xpath= "//android.view.View/android.view.View/android.app.Dialog/android.view.View")
public WebElement genders;
@AndroidFindBy(xpath= "//android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View")
public WebElement takePhoto;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"checkmark\")")
public WebElement finalconfirmation;
@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.Button")
public WebElement camera;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.widget.EditText")
public WebElement verify1;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement verify2;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[3]/android.widget.EditText")
public WebElement verify3;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[4]/android.widget.EditText")
public WebElement verify4;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[5]/android.widget.EditText")
public WebElement verify5;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[6]/android.widget.EditText")
public WebElement verify6;
@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button")
public WebElement editButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your account is not verified. Click here to verify.\")")
public WebElement verifyAccount;
@AndroidFindBy(xpath ="//android.app.Dialog/android.view.View/android.view.View/android.widget.EditText")
public WebElement enterSMS;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"arrow back\")")
public WebElement arrowBack;






//functions:-
public void uploadphoto() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePhoto)));
	takePhoto.click();
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
	Thread.sleep(2000);
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
    Sequence scrolla = new Sequence(finger1, 1);
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), camera.getLocation().getX() + 400, camera.getLocation().getY() + 50));
    scrolla.addAction(finger1.createPointerDown(0));
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), camera.getLocation().getX() + 400, camera.getLocation().getY() + 50));
    scrolla.addAction(finger1.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrolla));
	WebDriverWait wait2 = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
	shutter.click();
	WebDriverWait wait3 = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait3.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
	photoDone.click();
	WebDriverWait wait4 = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait4.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(usePhoto)));
	usePhoto.click();
	
}
public void clickSignUpButton() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loadedPage)));
	try {
		WebDriverWait wait4 = new WebDriverWait(android_driver,Duration.ofSeconds(3));
		wait4.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
		signUpButton.click();
		WebDriverWait wait5 = new WebDriverWait(android_driver,Duration.ofSeconds(3));
		wait5.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipvideoButton)));
		skipvideoButton.click();
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
		wait3.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
		signUpButton.click();
		WebDriverWait wait5 = new WebDriverWait(android_driver,Duration.ofSeconds(3));
		wait5.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipvideoButton)));
		skipvideoButton.click();
		
	}
	 
}

public void chooseCollectorsPannel() throws InterruptedException {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(30));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(collectorsPannel)));
	Thread.sleep(2000);
	collectorsPannel.click();
}
public void enterPhoneNumber() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(30));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextField)));
	phoneNumberTextField.click();
	phoneNumberTextField.sendKeys(randomPhoneNumber);
    
}
public void enterLoginScreenPhoneNumber() {
	
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(30));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loginPagePhoneNumberTextField)));
	loginPagePhoneNumberTextField.sendKeys("+63"+randomPhoneNumber);
}
public void enterLoginScreenPassword() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(30));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loginPagePasswordTextField)));
	loginPagePasswordTextField.sendKeys("password1");
}

public void clickBecomeAColectorButton() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(becomeACollectorButton)));
	becomeACollectorButton.click();
}

public void enterFirstName() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(firstNameTextField)));
	firstNameTextField.sendKeys("Gayas");
}
public void enterLastName() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(lastNameTextField)));
	String randomLastName = RandomStringUtils.randomAlphabetic(5);
	lastNameTextField.sendKeys(randomLastName);
	System.out.println(randomLastName);
}
public void clickcountrycodedropdown() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneCountryCodedropdown)));
	phoneCountryCodedropdown.click();
	
}

public void chosenCountryCode() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneCountryCodedropdown)));
	phoneCountryCodedropdown.click();
	WebDriverWait wait2 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(countrylist)));
    do {
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence scrolla = new Sequence(finger1, 1);
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), countrylist.getLocation().getX() + 600, countrylist.getLocation().getY() + 700));
        scrolla.addAction(finger1.createPointerDown(0));
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(400),
            PointerInput.Origin.viewport(), countrylist.getLocation().getX() + 600, countrylist.getLocation().getY() + 200));
        scrolla.addAction(finger1.createPointerUp(0));
        android_driver.perform(Arrays.asList(scrolla));
    } while (!isElementDisplayed(selectdummycountry));

    selectPhilipines.click();  
	oKButton.click();
}

private boolean isElementDisplayed(WebElement element) {
    try {
        return element.isDisplayed();
    } catch (NoSuchElementException | StaleElementReferenceException e) {
        return false;
    }
   
}

public void enterDOB() throws InterruptedException {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dateOfBirthTextField)));
	dateOfBirthTextField.click();
	
	WebDriverWait wait2 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(years)));
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
    Sequence scrolla = new Sequence(finger1, 1);
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), years.getLocation().getX() + 300, years.getLocation().getY() + 300));
    scrolla.addAction(finger1.createPointerDown(0));
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), years.getLocation().getX() + 300, years.getLocation().getY() + 10));
    scrolla.addAction(finger1.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrolla));
Thread.sleep(1000);
    doneButton.click();
	}
public void selectGender() throws InterruptedException {
	Thread.sleep(1000);
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
    Sequence scrolla = new Sequence(finger1, 1);
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 1000, 1700));
    scrolla.addAction(finger1.createPointerDown(0));
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(1000),
        PointerInput.Origin.viewport(), 1000, 200));
    scrolla.addAction(finger1.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrolla));
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(genderField)));
	genderField.click();
	WebDriverWait wait2 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(genders)));
	male.click();
	oKButton.click();
}
public void enterpassword() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(passwordTextField)));
	passwordTextField.sendKeys("password1");
	confirmPasswordTextField.sendKeys("password1");
}
public void clicktermsandconditions() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(termsAndConditionsCheckBox)));
	termsAndConditionsCheckBox.click();
}
public void finalconfirm() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(finalconfirmation)));
	finalconfirmation.click();
	}

public void verifyAccount() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(editButton)));
	editButton.click();
	WebDriverWait wait2 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(verifyAccount)));
	verifyAccount.click();
	WebDriverWait wait3 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait3.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(enterSMS)));
	enterSMS.sendKeys("778899");
	WebDriverWait wait4 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait4.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
    oKButton.click();
    WebDriverWait wait5 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait5.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
    oKButton.click();
	
}

public void clickmenu() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
	menu.click();
}
public void clickbackarrow() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack)));
	arrowBack.click();
}
public void clicklogout() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
	logout.click();
}
public void skipForNow() {
	WebDriverWait wait1 = new WebDriverWait(android_driver,Duration.ofSeconds(300));
	wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipButton)));
     skipButton.click();
}
public void fillDetails() throws InterruptedException {
	uploadphoto();
	enterFirstName();
	enterLastName();
	chosenCountryCode();
	enterPhoneNumber();
	enterDOB();
	selectGender();
	enterpassword();
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}


}
