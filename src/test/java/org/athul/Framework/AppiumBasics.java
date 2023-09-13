package org.athul.Framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AppiumBasics extends BaseTest{

	@Test
	public void AppiumTest()
	{
		FillForm fillform=new  FillForm(driver);
		fillform.setPreference();
		fillform.setDept();
		fillform.setCheckbox();
		fillform.setLayOut();
		fillform.EnterText("athulwifi");
		fillform.ClickOkBtn();


	}

}


