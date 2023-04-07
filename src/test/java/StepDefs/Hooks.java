package StepDefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.utilityclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public utilityclass utility;
	
	public Hooks(utilityclass utility) {
		this.utility=utility;
	}

	@After
	public void closeBrowser() throws IOException {
		utility.di.initializeDriver().quit();
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException{
		WebDriver driver = utility.di.initializeDriver();
		if(scenario.isFailed()) {
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
}

