package project;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MainProject {
	
	WebDriver driver;
	POMProject obj;    //Object Deceleration
	
	//-----------------------------Opening of Browser and Site----------------------------------------------------//
	
	@BeforeTest 
	public void beforeTesing() throws InterruptedException {
	driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	PropertyConfigurator.configure("log4j.properties");
	driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
	Thread.sleep(2000);
	}
	
	
	//-----------------------------Task 0 = Pre-requisite----------------------------------------------------//
	@Test (priority=0)
	public void task0() throws InterruptedException {
	
		obj = new POMProject(driver);
		obj.userLoginIn();
		
	}
	
	
	//-----------------------------All Tasks----------------------------------------------------//
	@Test (priority=1)
	public void task1() throws InterruptedException {
		obj = new POMProject(driver);
		obj.addPatient();
	}
	
	@Test(priority=2)
	public void task2() throws InterruptedException {
		obj = new POMProject(driver);
		obj.createCase();
	}
	
	@Test(priority=3)
	public void task3() throws InterruptedException {
		obj = new POMProject(driver);
		obj.createProviderNote();
	}
	
	
	@Test(priority=4)
	public void task4() throws InterruptedException {
		obj = new POMProject(driver);
		obj.addDiagnosis();
		}
	
	
	@Test(priority=5)
	public void task5() throws InterruptedException {
		obj = new POMProject(driver);
		obj.addProcedure();
		}
	
	
	@Test (priority=6)
	public void task6() throws InterruptedException {
	
		obj = new POMProject(driver);
		obj.createSuperBill();

	}
	
	//-----------------------------Closing of Browser after test----------------------------------------------------//
	
	 @AfterTest public void AfterTest() throws InterruptedException 
	 {
	 Thread.sleep(3000); 
	 driver.quit();
	 }
	 
}
