package Ama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon456 {
	WebDriver driver;
	Actions y;
	
	@FindBy (xpath="(//a[@class='nav-a  '])[4]")
	private WebElement Best12;
	
	@FindBy (xpath="(//a[@class='nav-a  '])[5]")
	private WebElement Td;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[6]")
	private WebElement mb;
	
	public Amazon456(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void best() {
		y = new Actions(driver);
		y.moveToElement(Best12).click().perform();
		}
	
	public void topdeal() {
		y = new Actions(driver);
		y.moveToElement(Td).click().perform();
	}
	
	public void mobile() {
		y = new Actions(driver);
		y.moveToElement(mb).click().perform();
	}

}



