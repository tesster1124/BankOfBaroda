package Programmes;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
 
	
    public class Registration {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("firstName")).sendKeys("Tester");
	  driver.findElement(By.id("lastName")).sendKeys("T");
	  driver.findElement(By.id("userEmail")).sendKeys("tesster1124@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	  driver.findElement(By.id("userNumber")).sendKeys("9988776655");
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("November");
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1997");
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]")).click();
	  driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Chemistry");
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	  driver.findElement(By.id("uploadPicture")).click();
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\vinay\\OneDrive\\Desktop\\OSK.jpeg");
	  driver.findElement(By.id("currentAddress")).sendKeys("hyderabad,nijampet");
	  driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[1]")).click();
	  driver.findElement(By.xpath("//div[@id='react-select-3-option-1']")).click();
	  driver.findElement(By.xpath("//div[@id='react-select-4-option-1']")).click();
	  driver.findElement(By.id("submit")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/automation-practice-form");
		 driver.manage().window().maximize();
		 
  }

  @AfterTest
  public void afterTest() {
  }

}
