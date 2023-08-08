package plasticBankPages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
public List<WebElement> checkmark;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Hisotry\")")
public WebElement history;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"menu\")")
public WebElement menu;
@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"rocessor\")")
public WebElement processor;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Delayed bonus until approval\")")
public List<WebElement> transactions;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Delayed bonus until approval\")")
public WebElement transaction;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"PET-Raw-Transparent\")")
public WebElement pet;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"0 (0)\")")
public WebElement noBonus;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"HDPE-Clean-Clear\")")
public WebElement hdpe;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"search outline\")")
public WebElement searchOutline;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Add Picture\")")
public WebElement addPicture;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take a picture\")")
public WebElement takePicture;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"OK\")")
public WebElement ok;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"View History\")")
public WebElement viewHistory;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement requiredQuantity;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Exchange History\")")
public WebElement exchangeHistory;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\")")
public List<WebElement>rewards;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"arrow back\")")
public WebElement arrowBack;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"All time\")")
public WebElement allTime;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"₱\")")
public List<WebElement> prices;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"133\")")
public WebElement approvedMemberBonus;
//member to b1
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"133 Bonus\")")
public WebElement bonusToMember;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"19 KG\")")
public WebElement kgMemberToBranch1;
//b1 to b2
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"30 Bonus\")")
public WebElement bonusToBranch1fromBranch2;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"15 KG\")")
public WebElement kgBranch1ToBranch2;
//b1 to b3
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"8 Bonus\")")
public WebElement bonusToBranch1fromBranch3;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"11 KG\")")
public WebElement kgBranch1toBranch3;
//b2 to p
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"14 Bonus\")")
public WebElement bonusTobranch2fromProcessor;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\7 KG\")")
public WebElement kgbranch2toProcessor;
//b3 to p
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"4 Bonus\")")
public WebElement bonusTobranch3fromProcessor;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"2 KG\")")
public WebElement kgbranch3toProcessor;



WebDriverWait wait = new WebDriverWait(android_driver,Duration.ofSeconds(10));
public void doTransaction(String number, String load1, String load2) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
	pet.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load1);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
    hdpe.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load2);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
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
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
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
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}


public void verifyMemberBonusAfterReceipt() {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
	assertTrue(approvedMemberBonus.isDisplayed());
}




public void verifyProcessorExchangeHistory() throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
    menu.click(); 
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(processor))); 
    processor.click(); 
    Thread.sleep(4000);
	PointerInput fingerglobe = new PointerInput(PointerInput.Kind.TOUCH, "fingerglobe");
    Sequence scrollglobe = new Sequence(fingerglobe, 1);
    scrollglobe.addAction(fingerglobe.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 545, 2060));
    scrollglobe.addAction(fingerglobe.createPointerDown(0));
    scrollglobe.addAction(fingerglobe.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 545, 2060));
    scrollglobe.addAction(fingerglobe.createPointerUp(0));
    android_driver.perform(Arrays.asList(scrollglobe));
    
    
    Thread.sleep(4000);
   	PointerInput fingerscroll = new PointerInput(PointerInput.Kind.TOUCH, "fingerscroll");
       Sequence scrollscroll = new Sequence(fingerscroll, 1);
       scrollscroll.addAction(fingerscroll.createPointerMove(Duration.ofMillis(0),
           PointerInput.Origin.viewport(), 545, 1900));
       scrollscroll.addAction(fingerscroll.createPointerDown(0));
       scrollscroll.addAction(fingerscroll.createPointerMove(Duration.ofMillis(100),
           PointerInput.Origin.viewport(), 545, 200));
       scrollscroll.addAction(fingerscroll.createPointerUp(0));
       android_driver.perform(Arrays.asList(scrollscroll));
       
       
       wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(viewHistory))); 
       viewHistory.click(); 
       
       wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allTime))); 
    String firstPrice = prices.get(0).getText();
       String secondPrice = prices.get(1).getText();
    Assert.assertEquals(firstPrice, "   ");
    Assert.assertEquals(secondPrice, "   ");
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack))); 
    arrowBack.click(); 
  
}


public void m1toB1(String m1number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(m1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("10");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("9");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    assertTrue(bonusToMember.isDisplayed());
    assertTrue(kgMemberToBranch1.isDisplayed());
   
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
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
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
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
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
       }
    
    assertTrue(bonusToMember.isDisplayed());
    assertTrue(kgMemberToBranch1.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
				
				Thread.sleep(4000);
	            PointerInput fingerMemberTab = new PointerInput(PointerInput.Kind.TOUCH, "fingerMemberTab");
	            Sequence scrollMemberTab = new Sequence(fingerMemberTab, 1);
	            scrollMemberTab.addAction(fingerMemberTab.createPointerMove(Duration.ofMillis(0),
	                PointerInput.Origin.viewport(), 400, 2060));
	            scrollMemberTab.addAction(fingerMemberTab.createPointerDown(0));
	            scrollMemberTab.addAction(fingerMemberTab.createPointerMove(Duration.ofMillis(100),
	                PointerInput.Origin.viewport(), 400, 2060));
	            scrollMemberTab.addAction(fingerMemberTab.createPointerUp(0));	
	            
	            
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(history)));
	            history.click();
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transaction)));
	            assertTrue(transaction.isDisplayed());
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack)));
	            arrowBack.click();
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(noBonus)));
	            assertTrue(noBonus.isDisplayed());
				
}


public void b1toB2(String b1number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("8");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("7");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    assertTrue(bonusToBranch1fromBranch2.isDisplayed());
    assertTrue(kgBranch1ToBranch2.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
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
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
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
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    assertTrue(bonusToBranch1fromBranch2.isDisplayed());
    assertTrue(kgBranch1ToBranch2.isDisplayed());
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}

public void b1toB3(String b1number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("6");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("5");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    assertTrue(bonusToBranch1fromBranch3.isDisplayed());
    assertTrue(kgBranch1toBranch3.isDisplayed());
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
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
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
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
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    assertTrue(bonusToBranch1fromBranch3.isDisplayed());
    assertTrue(kgBranch1toBranch3.isDisplayed());
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}

public void b3ToP(String b3number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b3number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("1");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("1");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    assertTrue(bonusTobranch3fromProcessor.isDisplayed());
    assertTrue(kgbranch3toProcessor.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
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
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
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
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    assertTrue(bonusTobranch3fromProcessor.isDisplayed());
    assertTrue(kgbranch3toProcessor.isDisplayed());
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}

public void b2ToP(String b2number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b2number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("4");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
    pet.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys("3");
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    assertTrue(bonusTobranch2fromProcessor.isDisplayed());
    assertTrue(kgbranch2toProcessor.isDisplayed());
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
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
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
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
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
        				checkmark.get(0)))); checkmark.get(0).click();
        	
        	
        }
    assertTrue(bonusTobranch2fromProcessor.isDisplayed());
    assertTrue(kgbranch2toProcessor.isDisplayed());
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}
}

