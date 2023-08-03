package Programmes;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BooleanOneway {
	public WebDriver driver;
	
	
	
	
  @Test
  public void options() throws Exception {
	  //switching to roundtrip
	  driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).click();
	  Thread.sleep(3000);
	  
	  //print condition True or False
	  boolean pricondition = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).isDisplayed();
	  System.out.println(pricondition);
	  
	  WebElement ele1 = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']"));
	   if (ele1.isDisplayed()) {
		   System.out.println("Round trip is passed");
	   } else {
		System.out.println("No not displayed");
	}
		
	}
	  
	  
 @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	  driver.get("https://savaari.com/");
	  driver.manage().window().maximize();
	  
	  
  }
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
