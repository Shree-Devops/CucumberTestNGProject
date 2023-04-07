package Package1;

//import org.testng.annotations.DataProvider; commented coz showing error
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features="@target/failed_scenarios.txt", 
			glue="StepDefs",
		    monochrome =true, //to remove unreadable characters in the console output during execution e.g. [32mGiven [0m[32mI am on the homepage[0m
		    plugin={"html:target/htmlReport.html", "json:target/jsonReport.json", 
		    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} // to specify formatting options for the output reports in the mentioned location
		    //format = {"html:format"} // pretty - will show pass in green and fail steps in red
			)
	public class FailureTestRunner extends AbstractTestNGCucumberTests{

		@Override
		//@DataProvider(parallel=true) commented coz showing error
		public Object[][] scenarios()
		{
			return super.scenarios();
		}	
	}
