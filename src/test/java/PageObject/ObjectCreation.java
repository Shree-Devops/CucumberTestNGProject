package PageObject;

import org.openqa.selenium.WebDriver;

public class ObjectCreation {

	public WebDriver driver;
	public Page1locators loc1;
	public Page2locators loc2;
	
	public ObjectCreation(WebDriver driver) {
		this.driver=driver;
	}
	public Page1locators Page1locatorsObjectcreation() {
		loc1 = new Page1locators(driver);
		return loc1;
	}
	public Page2locators Page2locatorsObjectcreation() {
		loc2 = new Page2locators(driver);
		return loc2;
	}
}
