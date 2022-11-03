package Amazontestng123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ama.Amazon456;

public class NewTest {
	public WebDriver driver;
	Amazon456 am123;
//	Actions x = new Actions(driver);
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
		am123 = new Amazon456(driver);

	}
	
	@Test (priority=-1, invocationCount=2)
	public void a3() {
		System.out.println("test1");
		am123.best();
		}
	
	
	@Test (priority=0, dependsOnMethods= {"a5"})
	public void a4() {
		System.out.println("test2");
		am123.mobile();
	}
	
	@Test 
	public void a5() {
		System.out.println("test3");
		am123.topdeal();
	}
	
	@AfterMethod
	public void y1() {
		System.out.println("after mehod");
		driver.navigate().back();
	}
	
	@AfterClass
	public void y2() {
		System.out.println("after class");
		driver.close();
	}
}
