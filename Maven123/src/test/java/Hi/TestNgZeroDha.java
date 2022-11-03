package Hi;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zerodha.ChangeUser;
import zerodha.Homepage;
import zerodha.Login;
import zerodha.Pin12;

	public class TestNgZeroDha {
		WebDriver driver;
		Login x;
		Pin12 y;
		Homepage z;
		ChangeUser za;

		@BeforeClass
		public void page() {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ashwini P\\\\Downloads\\\\Selenium Jars\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			}
		
		@BeforeMethod
		public void beformethod() throws InterruptedException  {
			System.out.println("before method");
			driver.navigate().to("https://kite.zerodha.com/");
			x = new Login(driver);

			x.EnterUN();
			x.EnPass();
			x.ClickLog();
			
			y=new Pin12(driver);
			Thread.sleep(2000);
			y.pin123();
			y.Clickto();
			
			z= new Homepage(driver);
			za=new ChangeUser(driver);
			
		
		}
			
			@Test
			public void Home() {
			z.order1();
			
			String AAA = driver.getCurrentUrl();
			
			if(AAA.equals("https://kite.zerodha.com/orders")){
				System.out.println("TestCase Passed");
			}
			else {
				System.out.println("testcase Failed");
			}
			z.logo();
			z.logOut();
			}
			
			@AfterMethod
			public void LogO() {
				za.CU();
				}
			
			@AfterClass
			public void Close() {
				driver.close();
			}
			
			
	}

