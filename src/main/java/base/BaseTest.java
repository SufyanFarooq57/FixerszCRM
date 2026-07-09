package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
public class BaseTest {
	public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initializeDriver();
        driver.get("https://fixerszonixs.web.app/auth/login");
    }

    @AfterMethod
    public void tearDown() {

        
    }

}
