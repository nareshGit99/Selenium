package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Website Task Day 6

		// Question 1

//			driver.get("https://www.facebook.com/");
//			WebElement email = driver.findElement(By.id("email"));
//			js.executeScript("arguments[0].setAttribute('value','naresh')", email);
//			a.doubleClick(email).perform();
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_X);
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_X);
		//
//			r.keyPress(KeyEvent.VK_TAB);
//			r.keyPress(KeyEvent.VK_TAB);
		//
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_V);
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_V);
//			driver.quit();

		// Question 2

//			driver.get("https://www.google.co.in/webhp");
//			WebElement search = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
//			search.sendKeys("velmurugan");
////			js.executeScript("arguments[0].setAttribute('value','velmurugan')", search);
//			a.doubleClick(search).perform();
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_X);
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_X);

		// Question 3

//			driver.get("http://greenstech.in/selenium-course-content.html");
//			WebElement down = driver.findElement(By.xpath("(//i[@class=\"fas fa-plus\"])[4]"));
//			js.executeScript("arguments[0].scrollIntoView(true)", down);
//			WebElement interview = driver.findElement(By.xpath("//h2[@class=\"title mb-0 center\"]"));
//			a.click(interview).perform();
//			Thread.sleep(4000);
//			WebElement tcs = driver.findElement(By.xpath("(//a[text()='TCS Interview Question '])[1]"));
//			a.contextClick(tcs).perform();
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);

		// Question 4

//			driver.get("http://greenstech.in/selenium-course-content.html");
//			WebElement frame = driver.findElement(By.xpath("//div[@id=\"heading304\"]"));	
//			a.contextClick(frame).perform();
//			r.keyPress(KeyEvent.VK_PAGE_UP);
//			r.keyRelease(KeyEvent.VK_PAGE_UP);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);

		// Question 5
		//
//			driver.get("https://greenstech.in/selenium-course-content.html");
//			WebElement model = driver.findElement(By.xpath("//div[@id=\"heading201\"]"));
//			a.click(model).perform();
//			WebElement resume = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
//			a.contextClick(resume).perform();
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);

		// Question 6

//			driver.get("https://greenstech.in/selenium-course-content.html");
//			WebElement rpa = driver.findElement(By.xpath("//a[@title=\"RPA Training in chennai\"]"));
//			a.contextClick(rpa).perform();
//			r.keyPress(KeyEvent.VK_PAGE_UP);
//			r.keyRelease(KeyEvent.VK_PAGE_UP);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);

		// Question 7

//			driver.get("https://greenstech.in/selenium-course-content.html");
//			WebElement selenium = driver.findElement(By.xpath("//div[@id=\"heading303\"]"));
//			a.click(selenium).perform();
//			WebElement day = driver.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/August-2019/Selenium Day6.txt\"]"));
//			Thread.sleep(3000);
//			a.contextClick(day).perform();
//			r.keyPress(KeyEvent.VK_PAGE_UP);
//			r.keyRelease(KeyEvent.VK_PAGE_UP);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);

		// Question 8

//			driver.get(" https://www.flipkart.com/");
//			WebElement login = driver.findElement(By.xpath("//img[@class=\"-dOa_b L_FVxe\"]"));
//			js.executeScript("arguments[0].click()", login);
//			WebElement email = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
//			js.executeScript("arguments[0].setAttribute('value','Naresh')", email);
//			a.doubleClick(email).perform();
//			Thread.sleep(5000);
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_X);
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_X);
//			r.keyPress(KeyEvent.VK_1);
//			r.keyRelease(KeyEvent.VK_1);
//			r.keyPress(KeyEvent.VK_2);
//			r.keyRelease(KeyEvent.VK_2);
//			r.keyPress(KeyEvent.VK_3);
//			r.keyRelease(KeyEvent.VK_3);
//			r.keyPress(KeyEvent.VK_4);
//			r.keyRelease(KeyEvent.VK_4);

		// Question 9

		driver.get("https://www.amazon.in/");
		WebElement login = driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		login.click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

		// Question 10

//			driver.get("https://www.snapdeal.com/");
//			WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
//			a.moveToElement(mens).perform();
//			WebElement shoe = driver.findElement(By.xpath("(//span[text()=\"Sports Shoes\"])[1]"));
//			a.contextClick(shoe).perform();
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);

		// Question 11

		driver.get("https://www.flipkart.com/");
		WebElement home = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		a.moveToElement(home).perform();
		WebElement all = driver.findElement(By.xpath("//a[text()='All']"));
		a.contextClick(all).perform();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
