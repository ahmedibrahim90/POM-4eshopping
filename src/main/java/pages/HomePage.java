package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By registerLink = By.linkText("Register");
	
	public void openRegisterPage()
	{
		driver.findElement(registerLink).click();
	}
	
//	//@FindBy(css="span.nav-line-2")
//	//WebElement registerSection;
//	private By registerSection = By.cssSelector("span.nav-line-2");
//	
//	//@FindBy(linkText ="تسجيل حساب صيدلية")
//	//WebElement registerLink;
//	private By registerLink = By.linkText("تسجيل حساب صيدلية");
//	
//	public void openRegistrationPge()
//	{
//		//Actions action = new Actions(driver);
//		//action.moveToElement(registerSection)
//	     //  .click(registerSection).perform();
//		//registerLink.click();
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(registerSection)).click(driver.findElement(registerSection)).perform();
//		driver.findElement(registerLink).click();
//	}

}
