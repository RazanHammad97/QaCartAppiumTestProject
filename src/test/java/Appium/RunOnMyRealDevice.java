package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunOnMyRealDevice {
	
	
	@Test
	public void setUp() throws MalformedURLException {
		File app = new File("QAcart-To-Do.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Razan");
		caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath() );
		caps.setCapability("uiautomator2ServerInstallTimeout", 90000);
//		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "");
//		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "");
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps) ;
		
		
	}

}
