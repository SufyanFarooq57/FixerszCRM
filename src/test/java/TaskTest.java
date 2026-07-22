import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import pages.Tasks;

public class TaskTest extends BaseTest{
	
	
	@Test
	private void task() {
		Tasks task = new Tasks(driver);
		task.clickTask();
       

	}

}
