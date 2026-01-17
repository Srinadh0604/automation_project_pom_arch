package basetest;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigReader;
import utility.ExtentReportManager;
import utility.ScreenshotUtil;


public class BaseTest {

	protected WebDriver driver;
    protected static ExtentReports extent;
    protected ExtentTest test;


    @BeforeSuite
    public void startReport() {
        extent = ExtentReportManager.getExtentReport();
    }
    
    
    @BeforeMethod
    public void setUp(Method method) {

        test = extent.createTest(method.getName());

        String browser = ConfigReader.get("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        test.info("Browser launched: " + browser);
    }
    
//	   @Parameters("browser")
//	    @BeforeMethod
//	    public void setUp(@Optional("chrome") String browser) {
//		   
//	        switch (browser.toLowerCase()) {
//
//	            case "chrome":
//	                WebDriverManager.chromedriver().setup();
//	                driver = new ChromeDriver();
//	                break;
//
//	            case "edge":
//	                WebDriverManager.edgedriver().setup();
//	                driver = new EdgeDriver();
//	                break;
//
//	            case "firefox":
//	                WebDriverManager.firefoxdriver().setup();
//	                driver = new FirefoxDriver();
//	                break;
//
//	            default:
//	                throw new IllegalArgumentException(
//	                        "Invalid browser name: " + browser);
//	        }
//
//	        driver.manage().window().maximize();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    }

    
    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            String path =
                ScreenshotUtil.captureScreenshot(driver, result.getName());
            test.fail(result.getThrowable());
            test.addScreenCaptureFromPath(path);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test passed successfully");
        }

        driver.quit();
    }
    
//	@AfterMethod
//	public void tearDown(ITestResult result) {
//		
//		 if (ITestResult.FAILURE == result.getStatus()) {
//	            ScreenshotUtil.captureScreenshot(driver, result.getName());
//	            System.out.println("Screenshot captured for failed test: "
//	                    + result.getName());
//	        }
//		 
//		driver.quit();
//	}
    
    @AfterSuite
    public void flushReport() throws IOException {
        extent.flush();
    	Desktop.getDesktop().browse(new File("reports/ExtentReport.html").toURI());
    }
}


