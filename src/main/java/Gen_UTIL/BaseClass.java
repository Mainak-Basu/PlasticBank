package Gen_UTIL;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
public static WebDriver chrome_driver;
public static AndroidDriver android_driver;
protected static String randomPhoneNumber;
		
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() throws IOException, InterruptedException{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z585R8TSRWQKSGQO");
	dc.setCapability("appPackage", "org.plasticbank.app");
	dc.setCapability("appActivity", "org.plasticbank.app.MainActivity");
	dc.setCapability("noReset", true);
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
   android_driver = new AndroidDriver(url,dc);
   
  
  /* WebDriverManager.chromedriver().setup();
	chrome_driver=new ChromeDriver();
	chrome_driver.manage().window().maximize();
	chrome_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	chrome_driver.get("https://www.google.com/");
   */
   }
	 @BeforeSuite
	    public void generateRandomNumber() {
	        randomPhoneNumber = RandomStringUtils.randomNumeric(8);
	        System.out.println(randomPhoneNumber);
	    }

	    protected String getRandomPhoneNumber() {
	        return randomPhoneNumber;
	    }
	
	
}
