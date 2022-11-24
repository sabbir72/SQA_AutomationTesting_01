package webtests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class Logintest extends DriverSetup{
	HomePage WebHomePage = new HomePage();
	LoginPage WebLoginPage = new LoginPage();
	ProductPage WebProductPage= new ProductPage();



	@Test
	public void loginTest() {
		getDriver().get("https://www.printworksbd.com/");
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		WebHomePage.clickLoginButton();
		WebLoginPage.doLogIn("practiclearn@gmail.com", "Learn123");
//		assertEquals(WebLoginPage.getAlertText(), "Incorrect username or password.");
	    WebHomePage.HomeBtn();
            WebProductPage.MAINMANU();
		     WebProductPage.SUBMANU();
//		    js.executeScript("window.scrollBy(0,300)");
			WebProductPage.SelectBook();
			WebProductPage.addCard();
			WebProductPage.ViewCard();
			WebProductPage.CheckOut();
			WebProductPage.firstname("Sabbir");
			WebProductPage.lastname("Ahamed");
		    js.executeScript("window.scrollBy(0,300)");
		    WebProductPage.dropdown();
			WebProductPage.UserAddress(" Tongi , Gazipur 1710");
			WebProductPage.postcode("1710");
		js.executeScript("window.scrollBy(0,200)");
		   WebProductPage.TERMS();
//		   WebProductPage.ORDER();

	}

}
