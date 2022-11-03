package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement order123;
	
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement Uid;
	
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logout123;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void order1() {
		order123.click();
	}
	
	public void logo() {
		Uid.click();
	}
	
	public void logOut() {
		logout123.click();
	}

}
