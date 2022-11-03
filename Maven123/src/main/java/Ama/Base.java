package Ama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	WebDriver driver;
	public WebDriver openChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwini P\\Downloads\\Selenium Jars\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver openEdge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashwini P\\Downloads\\Selenium Jars\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		return driver;
	}


}
