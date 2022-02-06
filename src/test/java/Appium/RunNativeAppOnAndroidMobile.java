package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement; //ctrl space at the end of the non import statment
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunNativeAppOnAndroidMobile {
	
	@Test
	public void runQACartApp() throws MalformedURLException {
		File app = new File("QAcart-To-Do.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "razan");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.todoqacart");
//		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.todoqacart.MainActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
//		driver.get("http://www.google.com");
//		String title = driver.getTitle();
//		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By
//				.xpath("//android.widget.EditText[@text='Enter your Email']"))
//		.sendKeys("razan@test.com");
		
//		driver.findElement(By
//				.xpath("//android.widget.EditText[@text='Enter your Password']"))
//		.sendKeys("test123");
		
//		driver.findElement(By
//				.xpath("(//android.widget.EditText)[2]"))
//		.sendKeys("test123");
		
		
		
		//driver.findElement(By.xpath("//*[@index='3']")).click();
		
		List<AndroidElement> EditableTexts =  driver.findElementsByClassName("android.widget.EditText");
		EditableTexts.get(0).sendKeys("razan@test.com");
		EditableTexts.get(1).sendKeys("test123");
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']")).click();
	}
	
	
	
}
