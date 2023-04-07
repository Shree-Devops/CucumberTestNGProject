package Utility;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class genericUtils {
	
	public WebDriver driver; 
	public genericUtils(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void switchWndowToChild() {
		
		Set <String> windows = driver.getWindowHandles();
	    Iterator <String> itr = windows.iterator();
	    driver.switchTo().window(itr.next());
	    driver.switchTo().window(itr.next());
	    System.out.println(driver.getTitle());
	}

}
