package Ama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon123 {
	
	WebDriver driver;
	Actions x;
	
	@FindBy (xpath="(//a[@class='nav-a  '])[1]")
	private WebElement Best12;
	
	@FindBy (xpath="(//a[@class='nav-a  '])[2]")
	private WebElement Td;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[3]")
	private WebElement mb;
	
	public Amazon123(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void best() {
		x = new Actions(driver);
		x.moveToElement(Best12).click().perform();
		}
	
	public void topdeal() {
		x = new Actions(driver);
		x.moveToElement(Td).click().perform();
	}
	
	public void mobile() {
		x = new Actions(driver);
		x.moveToElement(mb).click().perform();
	}

}
