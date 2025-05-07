package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest  {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
//		DesiredCapabilities cap = new DesiredCapabilities();
		
			/*	 service = new	AppiumServiceBuilder()
						.withAppiumJS(new File("//Users//H3AJTR4//.nvm//versions//node//v22.9.0//bin//appium"))
						.usingDriverExecutable(new File("//Users//H3AJTR4//.nvm//versions//node//v22.9.0//bin//node"))
						.withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();
			*/	

				
				
				System.out.println("Action Starts!................");
				
				UiAutomator2Options options = new UiAutomator2Options();
			
				options.setDeviceName("Pixel 7");
				options.setUdid("2A251FDH200GWC");
				options.setApp("//Users//H3AJTR4//eclipse-workspace//rahulshettyacademy//src//test//java//resources//ApiDemos-debug.apk");		
			
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			//	AndroidDriver driver = new AndroidDriver(new URI("127.0.0.1:4723").toURL(), options);
				
				/*
				 * For Java version above 20 use the following method to invoke the appium server
				 * AndroidDriver driver = new AndroidDriver(new URI("127.0.0.1:4723").toURL(), options);
				 */
				
		}
	
	public void longPressAction(WebElement ele) {
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration", 2000));
	}
	
	
	// Java:- Reference https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md
	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
		    canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 1.0
		    		));
		}while(canScrollMore);
	}

	@AfterClass
	public void tearDown() {
	
		driver.quit();
	//	service.stop();
	}
}
