package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.Page1locators;
import PageObject.Page2locators;
import Utility.utilityclass;
import io.cucumber.java.en.*;

public class StepDefinition2 {
	utilityclass utility;
	
	public StepDefinition2(utilityclass utility){
		this.utility=utility;
	}

	@Then("^User is on product page and product title is displayed$")
	public void productPage () {
//		utility.driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).isDisplayed();
		Page2locators loc2 = utility.obj.Page2locatorsObjectcreation();
		loc2.isDisplayed("addToCardbutton");
	}
}
