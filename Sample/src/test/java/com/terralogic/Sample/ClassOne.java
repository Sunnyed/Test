package com.terralogic.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassOne {
	
	WebDriver driver;
	
  @BeforeMethod
  public void openBrowser(){
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation_Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	  
  }
  @AfterMethod
  public void closeBrowser(){
	  driver.quit();
	    
  }
  @Test
  
  public void fan() {
	  
	  String title= driver.getTitle();
	  System.out.println("Title is " +title);
	  System.out.print("\n'TestNGOne -> TestNGOnePack -> ClassOne -> testmethodone' has been executed successfully"); 
	  
  }
}
