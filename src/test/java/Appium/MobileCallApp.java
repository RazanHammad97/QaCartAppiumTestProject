package Appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileCallApp {
	
	@Test
	public void ActionsOnApp() throws IOException {
//		File app = new File("QAcart-To-Do.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "razan");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.gallery3d");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.gallery3d.app.GalleryActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AndroidElement button = driver.findElement(By.className("android.widget.ImageButton"));
				
		button.click();
		driver.lockDevice();
		System.out.println(driver.isDeviceLocked());
		driver.unlockDevice();
		System.out.println(driver.isDeviceLocked());
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		//actions 
		Actions action = new Actions(driver);
		//action.dragAndDrop(button, button)
		//action.clickAndHold(button).moveToElement(button).release().build().perform()
		
		// take snapshots
		
		File snapshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snapshot, new File("images/test.png"));
		
		
//		AndroidElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter your Email']");
//		email.sendKeys("razan@test.com");
//		AndroidElement pass = driver.findElementByXPath("(//android.widget.EditText)[2]");
//		pass.sendKeys("test123");
//		pass.clear();
//		pass.sendKeys("6hschkwk");
//		AndroidElement login = driver.findElementByXPath("//android.view.ViewGroup[@index='3']");
//		login.click();
//		String text = email.getText();
//		System.out.println(text);
//		
//		System.out.println(driver.findElementByXPath("//android.view.ViewGroup[@index='3']").getLocation());
		
	//	driver.quit(); // at the end of test case

		
}
}