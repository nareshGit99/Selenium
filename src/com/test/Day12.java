package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Website Task Day 12

		// Question 1

//			driver.get("http://www.greenstechnologys.com/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			WebElement down = driver.findElement(By.xpath("(//span[@class=\"red_text\"])[4]"));
//			js.executeScript("arguments[0].scrollIntoView(true)", down );
//			WebElement address = driver.findElement(By.xpath("(//div[@class=\"trainer-info\"])[5]"));
//			System.out.println(address.getText());

		// Question 2

//			driver.get("https://toolsqa.com/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			WebElement go  = driver.findElement(By.xpath("//div[@class=\"youtube__link\"]"));
//			js.executeScript("arguments[0].scrollIntoView(true)", go);
//			Thread.sleep(3000);
//			WebElement up = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
//				js.executeScript("arguments[0].scrollIntoView(false)", up);

		// Question 3

//			driver.get("https://greenstech.in/selenium-course-content.html");
//			WebElement down = driver.findElement(By.xpath("//div[@id=\"heading304\"]"));
//			js.executeScript("arguments[0].scrollIntoView(true)", down);

		// Question 4

//			driver.get("https://www.facebook.com/");
//			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
//			WebElement usertxt = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//			js.executeScript("arguments[0].setAttribute('value','Naresh124')", usertxt);
//			WebElement pswd = driver.findElement(By.id("pass"));
//			WebElement until = w.until(ExpectedConditions.visibilityOf(pswd));
//			until.sendKeys("12345");
//			WebElement button = driver.findElement(By.name("login"));	
//			WebElement until2 = w.until(ExpectedConditions.elementToBeClickable(button));
//			js.executeScript("arguments[0].click()", until2);

		// Question 5

//			driver.get("http://adactinhotelapp.com/");
//			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
//			WebElement usertxt = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//			js.executeScript("arguments[0].setAttribute('value','Naresh124')", usertxt);
//			WebElement pswd = driver.findElement(By.id("password"));
//			WebElement until = w.until(ExpectedConditions.visibilityOf(pswd));
//			until.sendKeys("12345");
//			WebElement button = driver.findElement(By.id("login"));	
//			WebElement until2 = w.until(ExpectedConditions.elementToBeClickable(button));
//			js.executeScript("arguments[0].click()", until2);

		// Question 6

		driver.get("https://www.flipkart.com/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		WebElement until = w.until(ExpectedConditions.elementToBeClickable(login));
		js.executeScript("arguments[0].click()", until);

		WebElement txt = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
		WebElement until2 = w.until(ExpectedConditions.visibilityOf(txt));
		js.executeScript("arguments[0].setAttribute('value','Naresh124')", until2);
		String text = until2.getAttribute("value");
		System.out.println(text);

	}
}
