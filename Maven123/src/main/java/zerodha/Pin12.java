package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin12 {

		@FindBy(xpath="//input[@type='password']")
		private WebElement pin1;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement Clickto;
		
		
		public Pin12(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void pin123() {
			pin1.sendKeys("234567");
			
		}
		
		public void Clickto() {
			Clickto.click();
		}

}
