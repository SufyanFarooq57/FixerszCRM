
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.Tasks;

public class TaskTest extends BaseTest{
	
	
	@Test
	private void task() {
		LoginPage login = new LoginPage(driver);
		login.login("abc@gmail.com","sufyaN1@");
		Tasks task = new Tasks(driver);
		task.clickTask();
       

	}

}
