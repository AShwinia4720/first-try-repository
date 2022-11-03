package Amazontestng123;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import Util.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ama.Amazon789;

public class NewTest12 {
	public WebDriver driver;
	Amazon789 am123;
	Utility x;

	@BeforeClass
	public void a1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ashwini P\\\\Downloads\\\\Selenium Jars\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
	
	@BeforeMethod
	public void a2() throws InterruptedException {
		System.out.println("Before method");
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		am123 = new Amazon789(driver);
		x = new Utility();

	}
	
	@Test (priority=-1, invocationCount=1)
	public void a3() {
		System.out.println("test1");
		am123.best();
		}
	
	@Test 
	public void a5() {
		System.out.println("test3");
		am123.topdeal();
		String url = ("https://www.amazon.in/events/greatindianfestival?ref_=nav_cs_gb");
		Assert.assertEquals(url, "https://www.amazon.in/events/greatindianfestival?ref_=nav_cs_gb1");
	}
	
	@AfterMethod
	public void y1(ITestResult result) throws IOException {
		System.out.println("after mehod");
		driver.navigate().back();
		if(ITestResult.FAILURE==result.getStatus()) {
			
			x.takescreenshot(driver);
		}
	}
	
	@AfterClass
	public void y2() {
		System.out.println("after class");
		driver.close();
	}
}
