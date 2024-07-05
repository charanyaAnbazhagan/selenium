package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {

	@BeforeTest
	public void login()
	{
		System.out.println("Gmail login");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("Gmail log out");
	}
	@BeforeSuite
	public void launchApp()
	{
		System.out.println("launch the app");
	}
	@AfterSuite
	public void closeApp() {
		System.out.println("close the app");
		
	}
}
