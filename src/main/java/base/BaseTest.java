package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pages.LoginPage;
public class BaseTest {
	public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initializeDriver();
        driver.get("https://fixerszonixs.web.app/auth/login");
        LoginPage login = new LoginPage(driver);

        login.login("abc@gmail.com","sufyaN1@");
    }

    @AfterMethod
    public void tearDown() {

        
    }

}
