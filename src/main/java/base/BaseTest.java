package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
public static WebDriver driver;
public ExtentSparkReporter sparkReporter;
public ExtentReport extent;
public ExtentTest logger;
	
	@BeforeTest
	public void beforeTestMethod() {
		sparkReporter = new ExtentSparkRepoter(System.getProperty("user.dir") + File.separator+"reports"+File.separator+"SDETADDAExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setTheme(Theme.DARK);
		extent.setSystemInfo("HostName", "RHEL8");
		extent.setSystemInfo("UserName", "root");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Automation Tests Results by SDET ADD");
	}
	@BeforeMethod
	@AfterMethod
	@AfterTest
	

}
