package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.DriverSetup.getDriver;

public class BasePage {
	
	public WebElement getElement(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void click(By locator) {
		getElement(locator).click();
	}
	
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);
		
	}
	
	public String getAlertText() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert.getText();
	}

	public void HoverA(By locator){
		WebElement element=getElement(locator);
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).perform();
	}
	public void HoverB(By locator){
		WebElement element=getElement(locator);
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).perform();
		actions.click().build().perform();
	}
	public void Dropdown(By locator, String text){
		Select dropdown=new Select(getElement(locator));
		 dropdown.selectByVisibleText(text);
	}
}
