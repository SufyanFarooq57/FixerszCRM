

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends  BaseTest{
	
	@Test
    public void login(){

        LoginPage login = new LoginPage(driver);

        login.login("abc@gmail.com","sufyaN1@");


    }

}
