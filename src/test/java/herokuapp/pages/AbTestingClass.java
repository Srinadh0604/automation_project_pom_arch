package herokuapp.pages;



import org.openqa.selenium.WebDriver;

public class AbTestingClass{

    private WebDriver driver;

    public AbTestingClass(WebDriver driver) {
        this.driver = driver;
    }

    public void openABTestingPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }
    
    public String getPageSourceText() {
        return driver.getPageSource();   
    }
}



//    private static final Logger log =
//            Logger.getLogger(LoginPage.class);
//
//    private WebDriver driver;
//
//    public void LoginPage(WebDriver driver) {
//    	Reporter.log("LoginPage contructor start to initialise Driver",true);
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }

