package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1locators {
	public WebDriver driver;
	
	public Page1locators(WebDriver driver) {
		this.driver = driver;
	}

	By searchTextbox = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
	By product = By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[contains(text(),'Shirt')][1]/i");
	
	public void enterText(String field, String value) {
		driver.findElement(searchTextbox).sendKeys(value);
	}
	public void click(String field) {
		driver.findElement(searchButton).click();;
	}
	public String getText(String field) {
		return driver.findElement(product).getText();
	}
}
