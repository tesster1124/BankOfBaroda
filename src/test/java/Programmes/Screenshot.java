package Programmes;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Screenshot {
	public WebDriver driver;
	
	
  @Test
  public void alertsscreen() throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
	  
	  Thread.sleep(3000);
	  
	  String str = driver.switchTo().alert().getText();
	  
	  System.out.println(str);
	  
	   
	  Thread.sleep(3000);
	  
	  driver.switchTo().alert().accept();
	  
	  
	  
	  
	  String ATM = "Badri";
	  
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\vinay\\OneDrive\\Desktop\\Badri Testing\\Screenshoots\\"+ATM+".png"));
	  
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception   {
	  WebDriverManager.chromedriver().setup();
	  driver  =  new ChromeDriver();
	  
	  driver.get("https://demoqa.com/alerts");
	  
	  String ATM = "Bunny";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\vinay\\OneDrive\\Desktop\\Badri Testing\\Screenshoots\\"+ATM+".png"));
	  
  }
	  
	
	 
	  
	  
	  
	  
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
