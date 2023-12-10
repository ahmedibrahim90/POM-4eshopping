package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	
	// Create Constractor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
}
