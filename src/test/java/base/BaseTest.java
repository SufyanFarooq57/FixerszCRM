package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import driver.DriverFactory;
import pages.LoginPage;

public class BaseTest {
	public WebDriver driver;

    @BeforeMethod
    public void setup() {

    	 driver = DriverFactory.initializeDriver();
    	    driver.get("https://fixerszonixs.web.app/auth/login");
    	    
    	    

    	    System.out.println("URL: " + driver.getCurrentUrl());
    	    System.out.println("TITLE: " + driver.getTitle());

    	    try {
    	        Thread.sleep(10000);
    	    } catch (Exception e) {
    	    }

}
    }
