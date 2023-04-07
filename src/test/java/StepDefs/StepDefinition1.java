package StepDefs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.ObjectCreation;
import PageObject.Page1locators;
import Utility.utilityclass;
import io.cucumber.java.en.*;

public class StepDefinition1{
	utilityclass utility;
	
	public StepDefinition1(utilityclass utility){
		this.utility=utility;
	}
	
	@Given("User is on Greencart landing page")
	public void landingPage() {
//	    System.setProperty("webDriver.chrome.driver", "D:/Ranu documents/Selenium/Applications/chromedriver.exe");
//	    utility.driver = new ChromeDriver();
//	    utility.driver.get("https://www.amazon.in/");
	}
	
	@And("^user searched with short name ([^\"]*) and extracted actual name of the product$")
	public void searchForproduct(String shortName) throws InterruptedException {
//		Page1locators loc1 = new Page1locators(utility.driver);
//		ObjectCreation obj = new ObjectCreation(utility.driver);
		
		Page1locators loc1 = utility.obj.Page1locatorsObjectcreation();
		loc1.enterText("searchTextbox", shortName);
		loc1.click("searchButton");
		Thread.sleep(3000);
		String productName = loc1.getText("product");
	
	    System.out.println("Product Name - " + productName);
	    loc1.click("product");	
		Thread.sleep(3000);
		
		utility.gu.switchWndowToChild();
		
//	    Set <String> windows = utility.driver.getWindowHandles();
//	    Iterator <String> itr = windows.iterator();
//	    utility.driver.switchTo().window(itr.next());
//	    utility.driver.switchTo().window(itr.next());
//	    System.out.println(utility.driver.getTitle());
	}
}
