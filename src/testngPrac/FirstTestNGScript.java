package testngPrac;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FirstTestNGScript {
	
	@Test(priority=1,description="This test case will verify login functionality of the application")
	public void loginApp()
	{
		
		System.out.println("login successfull");
		Reporter.log("successfull login");
	}
	
	@Test(priority=2,description="This test case will verify open functionality of the application")
	public void openApp()
	{
		
		System.out.println("open successfull");
	}
	
	@AfterClass
	//(priority=3,description="This test case will verify close functionality of the application")
	public void closeApp()
	{
		
		System.out.println("closed successfull");
	}
	
	@BeforeMethod
	public void addEmp()
	{
		
		System.out.println("Emp added successfully");
	}
	
	@AfterMethod
	public void delEmp()
	{
		
		System.out.println("Emp deleted successfully");
	}
	
	
}
