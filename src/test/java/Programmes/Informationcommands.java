package Programmes;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Informationcommands {
	
	public WebDriver driver;
	
  @Test(priority = 1)
    public void gmail() {
		  String str1 = driver.findElement(By.linkText("Gmail")).getText();
		  System.out.println(str1);
  }
  @Test(priority = 2)
  public void google_image() {
	  String str2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
	  System.out.println(str2);
	  //driver.findElement(By.xpath("/html/body")).click();
	  driver.findElement(By.linkText("తెలుగు")).click();
	  
	  
	  
  }
  
  
  @BeforeTest
  public void openurl() {
	 WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  
	  
	  
	  
  }
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
