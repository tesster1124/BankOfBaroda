package Programmes;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assert {
	public WebDriver driver;

	@Test
	public void fun() {

		String Actualvalue = "$3";
		String Expectedvalue = driver.findElement(By.xpath("//b[contains(text(),'$398')]")).getText();
		System.out.println(Expectedvalue);
		
	
		  try{
				
			  // 1st statement
				System.out.println("Assertion starts here...");
				
				
				//22222222
				//Assert.assertEquals(Actualvalue, Expectedvalue);
				assertEquals(Actualvalue, Expectedvalue);
				
				
				
				
		}
		  
		  catch (Throwable t){	
			  
			  
			// 3rd statement
				System.out.println("Apple");

				// 4t statement
				System.out.println("A blog for Software Testers"); 
				 
				
		  
		  }
		  
		

		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
	}

}
