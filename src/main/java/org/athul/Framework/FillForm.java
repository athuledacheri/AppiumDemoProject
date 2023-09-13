package org.athul.Framework;

import org.athul.Utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FillForm extends AndroidActions {
	
	AndroidDriver driver;
	
	public FillForm(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
			
	}
	
//	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Preference\"]")
	private WebElement prefernce;
	
//	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='3. Preference dependencies']")
	private WebElement dept;
	
//	driver.findElement(By.id("android:id/checkbox")).click();
	
	@AndroidFindBy(id="android:id/checkbox")
	private WebElement checkbox;
	
//	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[1]")).click();
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	private WebElement layout;

//	driver.findElement(By.id("android:id/edit")).sendKeys("athul");

	@AndroidFindBy(id="android:id/edit")
	private WebElement TextBox;

//		driver.findElement(By.id("android:id/button1")).click();

	@AndroidFindBy(id="android:id/button1")
	private WebElement oKBtn;


	
	public void setPreference()
	{
		prefernce.click();
	}
	
	public void setDept()
	{
		dept.click();
	}
	
	public void setCheckbox()
	{
		checkbox.click();
	}
	
	public void setLayOut()
	{
		layout.click();
	}

	public void EnterText(String name)
	{
		TextBox.sendKeys(name);
		driver.hideKeyboard();
	}

	public void ClickOkBtn()
	{
		oKBtn.click();
	}
	
	
	
	
	

}
