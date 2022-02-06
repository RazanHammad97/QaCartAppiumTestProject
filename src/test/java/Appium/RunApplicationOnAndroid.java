package Appium;

import java.net.MalformedURLException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileCapabilityType;


public class RunApplicationOnAndroid {


		@Test
		public void openWebApplication() throws MalformedURLException {
			// tell the appium server some details about phone device
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "razan");
////			caps.setCapability("browserName", "Chrome");
			//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			//WebDriverManager.chromedriver().setup();
			//caps.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getBrowserPath());
//			
//			AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps) ;			
//			driver.get("www.google.com");
			
			
			// there is a problem that there is no chrome existence
			
			
		}
	

}