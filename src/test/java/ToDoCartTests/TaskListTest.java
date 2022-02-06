package ToDoCartTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskListTest {
	@BeforeClass
	
	public void eforeAllTests() {
		System.out.println("Install app in the Mobile");
	}
	@BeforeMethod
	
	public void LoginToApp() {
		System.out.println("Login To App");
	}
	
	@AfterMethod
	public void QuiteApp() {
		System.out.println("Quite App");
	}
	@AfterClass
	
	public void afterAllTests() {
		System.out.println("UnInstall app in the Mobile");
	}
	
	@Test
	public void Verify_LogOut() {
		System.out.println("Verify LogOut");
	}
	
	@Test
	public void TC_001_Verify_Existing_Of_Task_List() {
		System.out.println("Verify_Existing_Of_Task_List");
	}
	
	@Test
	public void TC_002_Verify_Completing_Of_Task() {
		System.out.println("Verify_Completing_Of_Task");
	}
	
	public void TC_003_Verify_Deleting_Of_Task() {
		System.out.println("Verify_Deleting_Of_Task");
		}
}
