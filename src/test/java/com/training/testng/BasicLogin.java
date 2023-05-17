package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicLogin {
	static WebDriver driver;

	
	  @BeforeMethod 
	  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup(); 
	  driver=new ChromeDriver();
	  driver.get("https://login.salesforce.com/");
	  //driver.manage().window().maximize(); 
	  }
	@Test
	public void Login() throws InterruptedException {

	driver.findElement(By.id("username")).sendKeys("moni10@tek.com");
	driver.findElement(By.id("password")).sendKeys("Mysales@1");
	
	WebElement login =driver.findElement(By.id("Login"));
	login.click();}
	

  @AfterMethod 
  public void teardown() { 
	  driver.close(); }
 
 

}
