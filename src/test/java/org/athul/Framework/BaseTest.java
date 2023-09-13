package org.athul.Framework;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {
    public AndroidDriver driver;
//    public AppiumDriverLocalService service;

    @BeforeTest
    public void AppiumConfig() throws MalformedURLException {


//        AppiumDriverLocalService  service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\athul.e\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 3a XL API 28");
        //options.setDeviceName("Android Device");// real device
        options.setApp("C:\\Users\\athul.e\\Downloads\\Framework\\src\\test\\java\\resources\\ApiDemos-debug.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);

    }



    @AfterTest
    public void teardown()
    {
        driver.quit();
//		     service.close();
    }
}
