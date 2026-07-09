import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends  BaseTest{
	@Test

    public void loginTest(){

        LoginPage login = new LoginPage(driver);

        login.login("abc@gmail.com","sufyaN1@");


    }

}
