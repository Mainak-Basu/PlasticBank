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
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"camera\")")
public WebElement takePhoto;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"checkmark\")")
public WebElement finalconfirmation;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(2)")
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
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;




//functions:-

public void clickSignUpButton() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
	signUpButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipvideoButton)));
	skipvideoButton.click();
	
}

public void chooseCollectorsPannel() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(collectorsPannel)));
	Thread.sleep(2000);
	collectorsPannel.click();
}

public void clickBecomeAColectorButton() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(becomeACollectorButton)));
	becomeACollectorButton.click();
}
public void uploadphoto() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePhoto)));
	takePhoto.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
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
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
    allow.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
	shutter.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
	photoDone.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(usePhoto)));
	usePhoto.click();
	
}

public void enterFirstName(String name) {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(firstNameTextField)));
	firstNameTextField.sendKeys(name);
}
public void enterLastName(String lastname) {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(lastNameTextField)));
	lastNameTextField.sendKeys(lastname);
	System.out.println(lastname);
}
public void random_enterLastName() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(lastNameTextField)));
	String randomLastName = RandomStringUtils.randomAlphabetic(5);
	lastNameTextField.sendKeys(randomLastName);
	System.out.println(randomLastName);
}

public void enterPhoneNumberRandom() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextField)));
	phoneNumberTextField.click();
	phoneNumberTextField.sendKeys(randomPhoneNumber);
    
}
public void enterPhoneNumber(String phoneNumber) {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextField)));
	phoneNumberTextField.click();
	phoneNumberTextField.sendKeys(phoneNumber);
    
}

public void chosenCountryCode() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneCountryCodedropdown)));
	phoneCountryCodedropdown.click();
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(countrylist)));
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
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dateOfBirthTextField)));
	dateOfBirthTextField.click();
	
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(years)));
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
    WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(genderField)));
	genderField.click();
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(genders)));
	male.click();
	oKButton.click();
}
public void enterpassword(String password) {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(passwordTextField)));
	passwordTextField.sendKeys(password);
	confirmPasswordTextField.sendKeys(password);
}
public void clicktermsandconditions() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(termsAndConditionsCheckBox)));
	termsAndConditionsCheckBox.click();
}
public void finalconfirm() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(finalconfirmation)));
	finalconfirmation.click();
	}

public void verifyAccount() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(editButton)));
	editButton.click();
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(verifyAccount)));
	verifyAccount.click();
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(enterSMS)));
	enterSMS.sendKeys("778899");
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
    oKButton.click();
   
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
    oKButton.click();
	
}

public void clickmenu() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
	menu.click();
}
public void clickbackarrow() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack)));
	arrowBack.click();
}
public void clicklogout() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
	logout.click();
}
public void skipForNow() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipButton)));
     skipButton.click();
}
public void fillDetailsRandom(String name,String password) throws InterruptedException {
	uploadphoto();
	enterFirstName(name);
	random_enterLastName();
	chosenCountryCode();
	enterPhoneNumberRandom();
	enterDOB();
	selectGender();
	enterpassword(password);
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}
public void fillDetails(String name,String lastname,String password,String phoneNumber) throws InterruptedException {
	uploadphoto();
	enterFirstName(name);
	enterLastName(lastname);
	chosenCountryCode();
	enterPhoneNumber(phoneNumber);
	enterDOB();
	selectGender();
	enterpassword(password);
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}


public void signUpRandom(String name,String password) throws InterruptedException {
	clickSignUpButton();
	chooseCollectorsPannel();
	clickBecomeAColectorButton();
	fillDetailsRandom(name,password);
	verifyAccount();
	clickmenu();
	clicklogout();
}
public void signUp(String name,String lastname,String password,String phoneNumber) throws InterruptedException {
	clickSignUpButton();
	chooseCollectorsPannel();
	clickBecomeAColectorButton();
	fillDetails(name,lastname,password,phoneNumber);
	verifyAccount();
	clickmenu();
	clicklogout();
}
}
