package Programmes;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Frame;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Frames {
	public WebDriver driver;
	
	public Actions action;
	
	
	
  @Test
  public void Clickable() throws InterruptedException {
	  
	  
	  // iframe concept
	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	     
	  // Element which needs to drag.
	    
	    WebElement Dragfrom = driver.findElement(By.id("draggable"));
	    
	    //Element which needed to drop.
	    
	    WebElement DropTo = driver.findElement(By.id("droppable"));
	    
	    //Using Actions class for drag and drop.
	    
	    action = new Actions(driver);
	    
	    //Dragged and Dropped.
	    
	    action.dragAndDrop(Dragfrom, DropTo).build().perform();
	    
	    //Back to out of the frame
	    driver.switchTo().parentFrame();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Demos"));
	    
	    
	    
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  
	  
	  
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
