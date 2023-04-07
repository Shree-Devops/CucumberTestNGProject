package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialization {

	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\Resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser_properties = prop.getProperty("browser");
		
		String browser_maven = System.getProperty("browser");// it will check maven commands (provided in cmd) if there property with name browser
		//result = testcondition? value1 : value2
		
		String browser = browser_maven != null ? browser_maven : browser_properties;
		// write below code in cmd
		// mvn test Dcucumber.filter.tags="tag1" Dbrowser=firefox
		
		if(driver==null)
		{
			if (browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webDriver.chrome.driver", "D:\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webDriver.gecko.driver", "D:\\Ranu documents\\Selenium\\Applications\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		    driver.get(prop.getProperty("url"));
		}
		return driver;
	}
}

