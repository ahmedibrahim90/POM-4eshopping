package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserRegostrationPage extends PageBase {

	public UserRegostrationPage(WebDriver driver) {
		super(driver);
	}

	private By maleSelect = By.id("gender-male");

	private By firstNametxt = By.id("FirstName");

	private By lastNametxt = By.id("LastName");

	private By birthDay = By.name("DateOfBirthDay");
	private By birthMonth = By.name("DateOfBirthMonth");
	private By birthYear = By.name("DateOfBirthYear");

	private By emailtxt = By.name("Email");

	private By companyNametxt = By.name("Company");

	private By passwordtxt = By.name("Password");

	private By confirmPasswordtxt = By.name("ConfirmPassword");

	private By registerBtn = By.name("register-button");

	private By expectedRegisterSuccessMsg = By.cssSelector("div.result");
	
	
	public void userRegister(String firstName, String lastName, String email, String companyName, String password, String confirmPasswrod)
	{

		driver.findElement(maleSelect).click();
		driver.findElement(firstNametxt).sendKeys(firstName);
		driver.findElement(lastNametxt).sendKeys(lastName);
		
		Select selectDay = new Select(driver.findElement(birthDay));
		selectDay.selectByValue("6");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(birthMonth));
		Select selectMonth = new Select(driver.findElement(birthMonth));
		selectMonth.selectByVisibleText("October");
		
		Select selectYear = new Select(driver.findElement(birthYear));
		selectYear.selectByVisibleText("1990");
		
		driver.findElement(emailtxt).sendKeys(email);
		driver.findElement(companyNametxt).sendKeys(companyName);
		driver.findElement(passwordtxt).sendKeys(password);
		driver.findElement(confirmPasswordtxt).sendKeys(confirmPasswrod);
		driver.findElement(registerBtn).click();
		driver.findElement(expectedRegisterSuccessMsg);
	}
	
	public String getRegisterSuccessMessage()
	{
		return driver.findElement(expectedRegisterSuccessMsg).getText();
		
	}

}
