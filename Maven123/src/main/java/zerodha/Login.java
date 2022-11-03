package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
//	Variable declaration
	@FindBy(xpath=("//input[@id='userid']")) private WebElement username1;
	
	@FindBy(xpath=("//input[@type='password']")) private WebElement Pass1;
	
	@FindBy(xpath=("//button[@type='submit']")) private WebElement LogButt;
//	Constructor creation or variable initialization
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	Wrapping private variable into method
	
	public void EnterUN() {
		username1.sendKeys("OKP335");
	}
	
	public void EnPass(){
		Pass1.sendKeys("ZAQ1234567");
	}
	
	public void ClickLog() {
		LogButt.click();
	}

}
