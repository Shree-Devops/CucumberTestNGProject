package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page2locators {
	public WebDriver driver;
	
	public Page2locators(WebDriver driver) {
		this.driver = driver;
		}

	By addToCardbutton = By.xpath("//input[@id='add-to-cart-button']");
	
	public void isDisplayed(String field) {
		driver.findElement(addToCardbutton).isDisplayed();
	}
}
