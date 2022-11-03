package Amazontestng123;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Ama.Amazon123;
import Ama.Base;
import Util.Utility;


public class NewTestamazon1234 extends Base {
	public WebDriver driver;
	Amazon123 am;
	Utility x;
	
	@Parameters("browser")
	
	@BeforeTest
	
	public void openbrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = openChrome();
			}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = openEdge();
		}
		
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	@BeforeClass
	public void a1() {

		am = new Amazon123(driver);
			}
	
	@BeforeMethod
	public void a2() throws InterruptedException {
		System.out.println("Before method");
		driver.navigate().refresh();

		

	}
	
	@Test 
	public void a3() {
		System.out.println("test1");
		am.best();
		
		String url = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
		Assert.assertEquals(url, "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		}
	
	
	@Test 
	public void a4() {
		System.out.println("test2");
		am.mobile();
	}
	
	@Test 
	public void a5() {
		System.out.println("test3");
		am.topdeal();
	}
	
	@AfterMethod
	public void y1(ITestResult result) throws IOException {
		System.out.println("after mehod");
		driver.navigate().back();

	}
	
	@AfterClass
	public void y2() {
		System.out.println("after class");
		am= null;
		
		
	}
	
	@AfterTest
	public void y3() {
		driver.close();
		System.gc();
		
	}

}
