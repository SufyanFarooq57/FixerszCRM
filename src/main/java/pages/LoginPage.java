package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
	 WebDriver driver;

	    public LoginPage(WebDriver driver){

	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(id="email")
	    WebElement txtUsername;

	    @FindBy(id="password")
	    WebElement txtPassword;

	    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div/form/div[3]/button")
	    WebElement btnLogin;
	    
	    

	    public void enterUsername(String username){

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("email"))
	        );

	        txtUsername.sendKeys(username);
	    }
	    public void enterPassword(String password){

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("password"))
	        );

	        txtPassword.sendKeys(password);
	    }

	    public void clickLogin(){

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        wait.until(
	            ExpectedConditions.elementToBeClickable(btnLogin)
	        );

	        btnLogin.click();
	    }
	    

	    public void login(String username,String password){

	        enterUsername(username);
	        enterPassword(password);
	        clickLogin();
	    }

}
