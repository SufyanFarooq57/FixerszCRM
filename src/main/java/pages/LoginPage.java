package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
public class LoginPage {
	 WebDriver driver;

	    public LoginPage(WebDriver driver){

	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(xpath="//*[@id=\"email\"]")
	    WebElement txtUsername;

	    @FindBy(xpath="//*[@id=\"password\"]")
	    WebElement txtPassword;

	    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[3]/div[2]/form/div[3]/button")
	    WebElement btnLogin;

	    public void enterUsername(String username){

	        txtUsername.sendKeys(username);
	    }

	    public void enterPassword(String password){

	        txtPassword.sendKeys(password);
	    }

	    public void clickLogin(){

	        btnLogin.click();
	    }

	    public void login(String username,String password){

	        enterUsername(username);
	        enterPassword(password);
	        clickLogin();
	    }

}
