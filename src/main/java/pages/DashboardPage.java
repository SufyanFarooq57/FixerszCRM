package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	 WebDriver driver;
	 
	    public DashboardPage(WebDriver driver){

	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(xpath="//h6[text()='Dashboard']")
	    WebElement dashboardText;
	    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/aside/nav/a[2]")
	    WebElement btnTask;
	    
	    
	    public boolean verifyDashboard(){

	        return dashboardText.isDisplayed();
	    }
	    public void clickTask(){

	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	    wait.until(ExpectedConditions.elementToBeClickable(btnTask));

	    	    btnTask.click();
	    }

}
