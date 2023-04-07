package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.ObjectCreation;

public class utilityclass {

	public WebDriver driver;
	public ObjectCreation obj;
	public DriverInitialization di;
	public genericUtils gu;
	
	public utilityclass() throws IOException {
		try {
			di = new DriverInitialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			obj= new ObjectCreation(di.initializeDriver());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gu = new genericUtils(di.initializeDriver());
	}
}
