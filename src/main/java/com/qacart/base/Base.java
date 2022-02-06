package com.qacart.base;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {
	protected static AndroidDriver<AndroidElement> driver;
	protected FileInputStream inputStream;
	protected Properties prop;
	
	@Test
	@Parameters({"platformName", "platformVersion","deviceName"})
	public void beforeClass(String platformName , String platformVersion, String  deviceName) throws Exception{
		
		File propFile = new File("src\\main\\resources\\config\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		
		File app = new File(prop.getProperty("androidAppPath"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
//		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "androidAutomationName");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		try {
			 driver = new AndroidDriver<AndroidElement>(new URL(prop.getProperty("appiumServerLink")),caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
}
