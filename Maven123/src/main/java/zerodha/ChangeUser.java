package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeUser {
	@FindBy(xpath="//a[@href='#']")
	private WebElement ChgUser;
	
	public ChangeUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CU() {
		ChgUser.click();
	}
}
