package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	private By USERNAME = By.xpath("//input[@id='username']");
	private By PASSWORD = By.xpath("//input[@id='password']");
	private By LOGIN = By.xpath("//input[@value='Login']");
	
	
	public void enterUsername(String username) {
		writeText(USERNAME, username);
	}
	
	public void enterPassword(String password) {
		writeText(PASSWORD, password);
	}
	
	public void clickButton() {
		click(LOGIN);
	}
	
	public void doLogIn(String username, String password) {
		writeText(USERNAME, username);
		writeText(PASSWORD, password);
		click(LOGIN);
	}


	
}
