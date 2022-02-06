package ToDoCartTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddNewTaskTest {
	
	@Test
	public void Verify_Adding_New_Task() {
		System.out.println("verify adding new task");
	}
	
	public void Verify_Canceling_New_Task() {
		System.out.println("verify canceling new task");

	}
	
	@BeforeTest
	
	public void TurnOnMobile() {
		System.out.println("Turn On Mobile");
	}
	
	@AfterTest
	
	public void TurnOffMobile() {
		System.out.println("Turn Off Mobile");
	}

}
