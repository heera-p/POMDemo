package testScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class ContactTest extends TestBase
{	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		TestBase.initialize();
	}
	
	//login
	//verify homepage
	//create contact
	
	@Test
	public void newContactTest()
	{
		loginPage = new LoginPage();
		//login
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		//HomePage verify
		homePage= new HomePage();
		boolean validUser= homePage.isValidUser();
		Assert.assertTrue(validUser);
		//homePage.createNewContact();
		
		
	}

}
