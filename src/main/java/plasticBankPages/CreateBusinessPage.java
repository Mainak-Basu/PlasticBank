package plasticBankPages;

import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.lang3.RandomStringUtils;
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

public class CreateBusinessPage extends BaseClass{
public CreateBusinessPage(AndroidDriver android_driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(android_driver), this);
	}

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
public WebElement loginButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
public WebElement logoutButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Settings\")")
public WebElement settingsButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
public WebElement menuButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement phoneNumberTextFeild;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(1)")
public WebElement passwordTextFeild;
@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
public WebElement loadedPage;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Finish\")")
public WebElement finishButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Create Business\")")
public WebElement createBusinessButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Recycling Business\")")
public WebElement recyclingBusinessPanel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collection Point\")")
public WebElement collectionPointPanel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CREATE BUSINESS\")")
public WebElement createBUSINESSbutton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"camera\")")
public WebElement cameraButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Take a picture\")")
public WebElement takeA_PictureOption;
@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Shutter\"]")
public WebElement shutter;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"confirm\")")
public WebElement confirmButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(0)")
public WebElement crossButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement businessNameTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement addressTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(0)")
public WebElement mondayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(1)")
public WebElement tuesdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(2)")
public WebElement wednesdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(3)")
public WebElement thursdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(4)")
public WebElement fridayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(5)")
public WebElement saturdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(6)")
public WebElement sundayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
public WebElement saveButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
public WebElement OKButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement cashValuePerKgTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement currentInventoryTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add\")")
public WebElement addButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DONE\")")
public WebElement doneButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next\")")
public WebElement nextButton;
@AndroidFindBy(id = "tab-t5-2")
public WebElement membersTab;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(0)")
public WebElement addmember;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement branchMemberNameTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement branchMemberPhoneNumberTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gender\")")
public WebElement genderButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Male\")")
public WebElement maleOption;

public void createBranch() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(40));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
	menuButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(createBusinessButton)));
	createBusinessButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(recyclingBusinessPanel)));
	recyclingBusinessPanel.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(collectionPointPanel)));
	collectionPointPanel.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(createBUSINESSbutton)));
	createBUSINESSbutton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(cameraButton)));
	cameraButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takeA_PictureOption)));
	takeA_PictureOption.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
	allow.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
	shutter.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
	photoDone.click();
	Thread.sleep(2000);
	PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    Sequence scroll = new Sequence(finger, 1);
    scroll.addAction(finger.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 550, 2030));
    scroll.addAction(finger.createPointerDown(0));
    scroll.addAction(finger.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 550, 2030));
    scroll.addAction(finger.createPointerUp(0));
    android_driver.perform(Arrays.asList(scroll));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(businessNameTextField)));
	String randomBusinessName = RandomStringUtils.randomAlphabetic(5);
	businessNameTextField.sendKeys("Gayas "+randomBusinessName);
	Thread.sleep(2000);
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
    Sequence scrolla = new Sequence(finger1, 1);
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 170, 1870));
    scrolla.addAction(finger1.createPointerDown(0));
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(1000),
        PointerInput.Origin.viewport(), 170, 300));
    scrolla.addAction(finger1.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrolla));
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(mondayCheckBox)));
    mondayCheckBox.click();
    tuesdayCheckBox.click();
    wednesdayCheckBox.click();
    thursdayCheckBox.click();
    fridayCheckBox.click();
    saturdayCheckBox.click();
    sundayCheckBox.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(saveButton)));
    saveButton.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(OKButton)));
    OKButton.click();
    Thread.sleep(2000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(cashValuePerKgTextField)));
    cashValuePerKgTextField.click();
    cashValuePerKgTextField.sendKeys("10");
       
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addButton)));
    addButton.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doneButton)));
    doneButton.click();
 }

public void addMemberToCreatedBranch() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(40));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(membersTab)));
	membersTab.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addmember)));
	addmember.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addmember)));
	String randomMemberName = RandomStringUtils.randomAlphabetic(5);
	branchMemberNameTextField.sendKeys("Gayas "+randomMemberName);
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(branchMemberPhoneNumberTextField)));
	String randomMemberPhoneNumberName = RandomStringUtils.randomNumeric(8);
	branchMemberPhoneNumberTextField.sendKeys(randomMemberPhoneNumberName);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(nextButton)));
	nextButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(genderButton)));
	genderButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(maleOption)));
	maleOption.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(OKButton)));
	OKButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(nextButton)));
	nextButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(OKButton)));
	OKButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(nextButton)));
	nextButton.click();
	Thread.sleep(2000);
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
    Sequence scrolla = new Sequence(finger1, 1);
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 700, 900));
    scrolla.addAction(finger1.createPointerDown(0));
    scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 700, 900));
    scrolla.addAction(finger1.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrolla));
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takeA_PictureOption)));
	takeA_PictureOption.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
	shutter.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
	photoDone.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmButton)));
	confirmButton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(nextButton)));
	nextButton.click();
	Thread.sleep(2000);
	PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
    Sequence scrollb = new Sequence(finger2, 1);
    scrollb.addAction(finger2.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 320, 620));
    scrollb.addAction(finger2.createPointerDown(0));
    scrollb.addAction(finger2.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 320, 620));
    scrollb.addAction(finger2.createPointerUp(0));
    android_driver.pressKey(new KeyEvent(AndroidKey.P));
    android_driver.pressKey(new KeyEvent(AndroidKey.A));
    android_driver.pressKey(new KeyEvent(AndroidKey.S));
    android_driver.pressKey(new KeyEvent(AndroidKey.S));
    android_driver.pressKey(new KeyEvent(AndroidKey.W));
    android_driver.pressKey(new KeyEvent(AndroidKey.O));
    android_driver.pressKey(new KeyEvent(AndroidKey.R));
    android_driver.pressKey(new KeyEvent(AndroidKey.D));
    android_driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    Thread.sleep(2000);
    PointerInput finger3 = new PointerInput(PointerInput.Kind.TOUCH, "finger3");
    Sequence scrollc = new Sequence(finger3, 1);
    scrollc.addAction(finger3.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 320, 770));
    scrollc.addAction(finger3.createPointerDown(0));
    scrollc.addAction(finger3.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 320, 770));
    scrollc.addAction(finger3.createPointerUp(0));
    android_driver.pressKey(new KeyEvent(AndroidKey.P));
    android_driver.pressKey(new KeyEvent(AndroidKey.A));
    android_driver.pressKey(new KeyEvent(AndroidKey.S));
    android_driver.pressKey(new KeyEvent(AndroidKey.S));
    android_driver.pressKey(new KeyEvent(AndroidKey.W));
    android_driver.pressKey(new KeyEvent(AndroidKey.O));
    android_driver.pressKey(new KeyEvent(AndroidKey.R));
    android_driver.pressKey(new KeyEvent(AndroidKey.D));
    android_driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(finishButton)));
    finishButton.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(crossButton)));
    crossButton.click();
    
    
}












}
