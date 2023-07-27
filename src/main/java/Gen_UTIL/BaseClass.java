package Gen_UTIL;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
public static WebDriver chrome_driver;
public static AndroidDriver android_driver;
protected static String randomPhoneNumberSignUp;
protected static String randomPhoneNumberMemberToBranch;
protected static String randomPhoneNumberProcessor;

protected static String randomLastName;
public String name;
public String password;
public String phoneNumber;
public String randomNumberDuringSignUp;
public String randomNumberMemberToBranch;
public String randomLName;
public String randomProcessorNumber;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		
		name= "Gayas";
		password= "password1";
		 phoneNumber = "+63789654";
		 randomNumberDuringSignUp="+63"+randomPhoneNumberSignUp;
	     randomLName= randomLastName;
	     randomNumberMemberToBranch="+63"+randomPhoneNumberMemberToBranch;
	     randomProcessorNumber="+63"+randomPhoneNumberProcessor;
	     
	     
	  WebDriverManager.chromedriver().setup(); chrome_driver=new ChromeDriver();
	  chrome_driver.manage().window().maximize();
	  chrome_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  chrome_driver.get("https://qa-admin.cognitionfoundry.io/#/login");
	  
	  DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z585R8TSRWQKSGQO");
		dc.setCapability("appPackage", "org.plasticbank.app");
		dc.setCapability("appActivity", "org.plasticbank.app.MainActivity");
		//dc.setCapability("noReset", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	   android_driver = new AndroidDriver(url,dc);
	 
    
   }
	
	
	
	@AfterClass
	public void teardown() {
		android_driver.quit();
		chrome_driver.quit();
	}
	 @BeforeSuite
	 public void generateRandomNumber1() {
		 randomPhoneNumberSignUp = RandomStringUtils.randomNumeric(8);
	        System.out.println(randomPhoneNumberSignUp);
	    }

	    protected String getRandomPhoneNumber1() {
	        return randomPhoneNumberSignUp;
	    }
	    @BeforeSuite
		 public void generateRandomLastName() {
		        randomLastName = RandomStringUtils.randomAlphabetic(5);
		        System.out.println(randomLastName);
		    }

		    protected String getRandomLastName() {
		        return randomLastName;
		    }
		    @BeforeSuite
			 public void generateRandomNumber2() {
		    	randomPhoneNumberMemberToBranch = RandomStringUtils.randomNumeric(8);
			        System.out.println(randomPhoneNumberMemberToBranch);
			    }

			    protected String getRandomPhoneNumber2() {
			        return randomPhoneNumberMemberToBranch;
			    } 
			    @BeforeSuite
				 public void generateRandomNumberProcessor() {
			    	randomPhoneNumberProcessor = RandomStringUtils.randomNumeric(8);
				        System.out.println(randomPhoneNumberProcessor);
				    }

				    protected String getRandomNumberProcessor() {
				        return randomPhoneNumberProcessor;
				    } 
		    
	
}
