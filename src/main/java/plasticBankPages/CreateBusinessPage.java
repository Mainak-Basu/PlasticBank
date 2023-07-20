package plasticBankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Gen_UTIL.BaseClass;
import io.appium.java_client.android.AndroidDriver;
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
@AndroidFindBy(xpath= "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
public WebElement phoneNumberTextFeild;
@AndroidFindBy(xpath= "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText")
public WebElement passwordTextFeild;
@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
public WebElement loadedPage;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Create Business\")")
public WebElement createBusinessButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Recycling Business\")")
public WebElement recyclingBusinessPanel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collection Point\")")
public WebElement collectionPointPanel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CREATE BUISNESS\")")
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
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement businessNameTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement addressTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(0)")
public WebElement mondayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(1)")
public WebElement tuesdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(2)")
public WebElement weddayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(3)")
public WebElement thursdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(4)")
public WebElement firdayCheckBox;
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
@AndroidFindBy(id = "tab-t5-2")
public WebElement membersTab;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(0)")
public WebElement addmember;










}
