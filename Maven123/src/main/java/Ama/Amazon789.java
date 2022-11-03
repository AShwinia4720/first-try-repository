package Ama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon789 {
	WebDriver driver;
	Actions z;
	
	@FindBy (xpath="(//a[@class='nav-a  '])[7]")
	private WebElement Best12;
	
	@FindBy (xpath="(//a[@class='nav-a  '])[8]")
	private WebElement Td;
	
	
	public Amazon789(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void best() {
		z = new Actions(driver);
		z.moveToElement(Best12).click().perform();
		}
	
	public void topdeal() {
		z = new Actions(driver);
		z.moveToElement(Td).click().perform();
	}

}
