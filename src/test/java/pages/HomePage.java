package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
	private By LoginButton = By.xpath("//ul[@id='menu-top-navigation']//li[@class='menu-item']//a");
	public By Home = By.xpath("//li[@id='nav-menu-item-10759']");


	
	public void clickLoginButton() {
		click(LoginButton);
	}

	public void  HomeBtn(){
		click(Home);
	}

}
