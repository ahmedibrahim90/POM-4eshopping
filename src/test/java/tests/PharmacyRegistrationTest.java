package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegostrationPage;

public class PharmacyRegistrationTest extends TestBase {

	HomePage homeObject;
	UserRegostrationPage RegistrationObject;
	String ActualsuccessMsg = "Your registration completed";
	
	@Test
	public void userCanRegisrerSuccessfully()
	
	{
		homeObject = new HomePage(driver);
		homeObject.openRegisterPage();
		RegistrationObject = new UserRegostrationPage(driver);
		RegistrationObject.userRegister("Ahmed", "Saba", "email3@gmail.com", "companyName", "123456", "123456");
		//Assert.assertEquals(ActualsuccessMsg, RegistrationObject.getRegisterSuccessMessage());
		Assert.assertTrue(RegistrationObject.getRegisterSuccessMessage().contains(ActualsuccessMsg));
	}
	
}
