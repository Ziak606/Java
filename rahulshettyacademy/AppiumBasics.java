package rahulshettyacademy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest{
		
		@SuppressWarnings("deprecation")
		@Test
		public void WifiSettingsName() throws InterruptedException {
			
		
			
	//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
			driver.findElement(By.xpath("//*[contains(@text,'Preference dependencies')]")).click();
			driver.findElement(By.id("android:id/checkbox")).click();
			driver.findElement(By.xpath("//*[contains(@text,'WiFi settings')]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("android:id/edit")).sendKeys("12345");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			
//			
			
		}
		

	}


