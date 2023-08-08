package plasticBankPages;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
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
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement loginPagePhoneNumberTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
public WebElement firstcountryinlist;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement loginPagePasswordTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.CheckBox\").instance(0)")
public WebElement termsAndConditionsCheckBox;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
public WebElement passwordTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(3)")
public WebElement confirmPasswordTextField;
@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Shutter\"]")
public WebElement shutter;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
public WebElement phoneNumberTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
public WebElement signUpButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CANCEL\")")
public WebElement cancel;
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
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
public WebElement menuButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
public WebElement logout;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Male\")")
public WebElement male;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collectors\")")
public WebElement collectorsPannel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collection Business\")")
public WebElement collectionBusinessPannel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collection Point\")")
public WebElement collectionPoint;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(1)")
public WebElement registerBusiness;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(1)")
public WebElement becomeACollectorButton;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement firstNameTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement lastNameTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.Spinner\").instance(0)")
public WebElement phoneCountryCodedropdown;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Philippines (+63)\")")
public WebElement selectPhilipines;
@AndroidFindBy(uiAutomator= "new UiScrollable(new UiSelector().className(\"android.view.View\").instance(52))")
public WebElement countrylist;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
public WebElement oKButton;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"DD/MM/YYYY\")")
public WebElement dateOfBirthTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"Verify Phone\")")
public WebElement  verifyPhoneText;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.view.View\").instance(60)")
public WebElement years;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Réunion (+262)\")")
public WebElement selectdummycountry;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DONE\")")
public WebElement doneButton;
@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.view.View\").instance(52)).scrollForward()")
public WebElement scrollable;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"Gender\")")
public WebElement genders;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"camera\")")
public WebElement takePhoto;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"checkmark\")")
public WebElement finalconfirmation;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(2)")
public WebElement camera;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Edit\")")
public WebElement editButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your account is not verified. Click here to verify.\")")
public WebElement verifyAccount;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
public WebElement enterSMS;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"arrow back\")")
public WebElement arrowBack;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Afghanistan (+93)\")")
public WebElement afghan;

public static String randomNumberSignUp;
public static ArrayList<String> randomNumberSignUpList = new ArrayList<>();

//functions:-

public void clickSignUpButton() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(30));
	try {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
	signUpButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipvideoButton)));
	skipvideoButton.click();
	}catch(Exception e) {
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
		signUpButton.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipvideoButton)));
		skipvideoButton.click();
	}
}

public void chooseCollectorsPannel() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(collectorsPannel)));
	Thread.sleep(2000);
	collectorsPannel.click();
}
public void chooseCollectionBusinessPannel() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(collectionBusinessPannel)));
	Thread.sleep(2000);
	collectionBusinessPannel.click();
}
public void clickCollectionPoint() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(collectionPoint)));
	Thread.sleep(2000);
	collectionPoint.click();
}

public void clickBecomeAColectorButton() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(becomeACollectorButton)));
	becomeACollectorButton.click();
}
public void clickRegisterBusiness() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(registerBusiness)));
	Thread.sleep(2000);
	registerBusiness.click();
}
public void uploadphoto() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePhoto)));
	Thread.sleep(1000);
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
    
    try {
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
    allow.click();
    Thread.sleep(5000);
    PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
    Sequence scrollShutter = new Sequence(fingerShutter, 1);
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 545, 1930));
    scrollShutter.addAction(fingerShutter.createPointerDown(0));
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 545, 1930));
    scrollShutter.addAction(fingerShutter.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrollShutter));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
	photoDone.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(usePhoto)));
	usePhoto.click();
    }catch(Exception e) {
    	Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        android_driver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(usePhoto)));
    	usePhoto.click();
    }
	
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
	randomNumberSignUp = RandomStringUtils.randomNumeric(8);
	randomNumberSignUpList.add("+63"+randomNumberSignUp);
	phoneNumberTextField.sendKeys(randomNumberSignUp);
	android_driver.pressKey(new KeyEvent(AndroidKey.BACK));
    
}


public void enterPhoneNumber(String phoneNumber) {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextField)));
	phoneNumberTextField.click();
	phoneNumberTextField.sendKeys(phoneNumber);
    
}
public void chosePhilipines() {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneCountryCodedropdown)));
	phoneCountryCodedropdown.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(countrylist)));
	afghan.click();
	for (int i = 0; i < 178; i++) {
		android_driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	}
	selectPhilipines.click();  
	oKButton.click();
}


public void enterDOB() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dateOfBirthTextField)));
	dateOfBirthTextField.click();
	
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(cancel)));
	PointerInput fingerYears = new PointerInput(PointerInput.Kind.TOUCH, "fingerYears");
    Sequence scrollYears = new Sequence(fingerYears, 1);
    scrollYears.addAction(fingerYears.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), cancel.getLocation().getX()+100, cancel.getLocation().getY() + 500));
    scrollYears.addAction(fingerYears.createPointerDown(0));
    scrollYears.addAction(fingerYears.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), cancel.getLocation().getX()+100, cancel.getLocation().getY() + 100));
    scrollYears.addAction(fingerYears.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrollYears));
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

public void clickmenu() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
	menuButton.click();
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
public void fillDetailsRandom(String name, String password) throws InterruptedException{
    uploadphoto();
	enterFirstName(name);
	random_enterLastName();
	chosePhilipines();
	enterPhoneNumberRandom();
	enterDOB();
	selectGender();
	enterpassword(password);
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}
public void fillDetails(String name,String lastname,String password,String phoneNumber) throws InterruptedException, AWTException {
	uploadphoto();
	enterFirstName(name);
	enterLastName(lastname);
	chosePhilipines();
	enterPhoneNumber(phoneNumber);
	enterDOB();
	selectGender();
	enterpassword(password);
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}


public void signUpRandom(String name,String password) throws InterruptedException{
	clickSignUpButton();
	chooseCollectionBusinessPannel();
	clickCollectionPoint();
	clickRegisterBusiness();
	fillDetailsRandom(name,password);
	verifyAccount();
	
}
public void signUp(String name,String lastname,String password,String phoneNumber) throws InterruptedException, AWTException {
	clickSignUpButton();
	chooseCollectionBusinessPannel();
	clickCollectionPoint();
	clickRegisterBusiness();
	fillDetails(name,lastname,password,phoneNumber);
	verifyAccount();
	
}
}
