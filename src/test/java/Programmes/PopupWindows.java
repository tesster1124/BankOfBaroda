package Programmes;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PopupWindows {
	public WebDriver driver;
	
  @Test
  public void windowpopup() throws Exception {
	  // click on separte windows
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(5000);
	  
	  //click button
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	  Thread.sleep(5000);
	  
	  //comeback to parent window handle
	  String backtoparentwindow = driver.getWindowHandle();
	  
	  //handling child window
	  for(String childwindowhandle: driver.getWindowHandles()) {
		  
		  //switch to child window
		  driver.switchTo().window(childwindowhandle);
	  }
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  
		  //clicks on Blog button
		  
		  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[7]/a/span")).click();
		  Thread.sleep(5000);
		  
		  //child window closed
		  
		  driver.close();
		  Thread.sleep(5000);
		  
		  //Again switches focus back to parent window
		  
		  driver.switchTo().window(backtoparentwindow);
		  Thread.sleep(4000);
		  
		  //clicks on home button
		  
		  driver.findElement(By.linkText("Home")).click();
		  Thread.sleep(4000);
	  
	  
	  
  }
  
  
  
  @BeforeTest
  public void openurl() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  
	  
  }
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
