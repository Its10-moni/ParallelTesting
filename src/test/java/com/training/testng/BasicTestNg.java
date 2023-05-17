package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTestNg {
static WebDriver driver;
	
		
	@Test
	public void Login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");

	driver.findElement(By.id("username")).sendKeys("moni10@tek.com");
	driver.findElement(By.id("password")).sendKeys("Mysales@1");

	WebElement login =driver.findElement(By.id("Login"));
	login.click();}

	
	
	@Test
	public void Login2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("#password_field"));
		password.sendKeys("admin123");

		WebElement login = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		login.click();
		}
	
	
}
	



