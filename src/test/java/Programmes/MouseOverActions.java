package Programmes;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOverActions {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void mouseOver() throws Exception    {
	  action = new Actions(driver);
	  WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	  WebElement els = driver.findElement(By.linkText("Video"));
	  
	//Action Command
		 action.moveToElement(ele).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Windows")).click();
		 Thread.sleep(2000);
		 /*action.moveToElement(els).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Youtube")).click();
		 Thread.sleep(2000);*/
	  
	  
  }
  
  
  @BeforeTest
  public void openurl() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  
	  
  }
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
