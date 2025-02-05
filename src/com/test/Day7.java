package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// (Inside Project)
//		File File = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\sample.png");
//		FileUtils.copyFile(File, desc);
		// In our PC Folder Location
//		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
//		System.out.println(screenshotAs);
//		File desc = new File ("C:\\Users\\ELCOT\\Downloads\\Naresh\\screenshot.png");
//		FileUtils.copyFile(screenshotAs, desc);

		// Website Task Day 7

		// Question 1

//		driver.get("http://www.greenstechnologys.com/");
//		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
//		System.out.println(screenshotAs);
//		File desc = new File ("C:\\Users\\ELCOT\\Downloads\\Naresh\\screenshot.png");
//		FileUtils.copyFile(screenshotAs, desc);

		// Question 2 & 3

//		driver.get("http://toolsqa.com/");
//		WebElement down = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		Thread.sleep(4000);
//		WebElement up = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
//		js.executeScript("arguments[0].scrollIntoView(false)", up);
//		String text = up.getText();
//		System.out.println(text);

		// Question 4

//		driver.get("http://www.greenstechnologys.com/");
//		WebElement down = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		File address = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\Address.png");
//		FileUtils.copyFile(address, desc);

		// Question 5

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement down = driver.findElement(By.xpath("//h2[@class=\"title mb-0 center\"]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		File job = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\job.png");
//		FileUtils.copyFile(job, desc);
//		Thread.sleep(3000);
//		WebElement up = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
//		js.executeScript("arguments[0].scrollIntoView(false)", up);

		// Question 6

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement down = driver.findElement(By.xpath("(//h3[@title=\"Top Selenium Trends In 2020\"])[1]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		File selenium = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\selenium.png");
//		FileUtils.copyFile(selenium, desc);

		// Question 7

//		driver.get("https://greenstech.in/selenium-course-content.html");
//		WebElement interview = driver.findElement(By.id("heading20"));
//		interview.click();
//		File ts = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\interviewQue.png");
//		FileUtils.copyFile(ts, desc);

		// Question 8

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement core = driver.findElement(By.id("heading302"));
//		core.click();
//		File ts = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\core.png");
//		FileUtils.copyFile(ts, desc);

		// Question 9

//		driver.get("https://www.flipkart.com/");
//		WebElement search = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
//		search.sendKeys("iphone");
//		WebElement icon = driver.findElement(By.xpath("//button[@aria-label=\"Search for Products, Brands and More\"]"));
//		icon.click();
//		File ts = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\iphone.png");
//		FileUtils.copyFile(ts, desc);
//		driver.quit();

		// Questiom 10

//		driver.get("https://www.amazon.in/");
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.sendKeys("Motorola");
//		WebElement icon = driver.findElement(By.id("nav-search-submit-button"));
//		icon.click();
//		File ts = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\Motorola.png");
//		FileUtils.copyFile(ts, desc);
//		driver.quit();

		// Question 11

//		driver.get("https://www.flipkart.com/");
//		WebElement fashion = driver.findElement(By.xpath("//span[text()=\"Fashion\"]"));
//		a.moveToElement(fashion).perform();
//		WebElement womens = driver.findElement(By.xpath("//a[text()=\"Women Ethnic\"]"));
//		a.moveToElement(womens).perform();
//		WebElement all = driver.findElement(By.xpath("//a[text()=\"All\"]"));
//		all.click();
//		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\filpkart.png");
//		FileUtils.copyFile(screenshotAs, desc);

		// Question 12

//		driver.get("https://www.flipkart.com/");
//		WebElement fashion = driver.findElement(By.xpath("//span[text()=\"Fashion\"]"));
//		a.moveToElement(fashion).perform();
//		WebElement kid = driver.findElement(By.xpath("//a[text()=\"Kids\"]"));
//		a.moveToElement(kid).perform();
//		WebElement all = driver.findElement(By.xpath("//a[text()=\"All\"]"));
//		all.click();
//		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\kids.png");
//		FileUtils.copyFile(screenshotAs, desc);

		// Question 13

		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("HP laptop");
		WebElement icon = driver.findElement(By.xpath("//button[@class=\"searchformButton col-xs-4 rippleGrey\"]"));
		icon.click();
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\ELCOT\\Downloads\\Naresh\\snapdeal.png");
		FileUtils.copyFile(screenshotAs, desc);
		driver.quit();

		driver.navigate().to("");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();

		a.contextClick(icon).perform();
		a.doubleClick(icon).perform();
		a.dragAndDrop(search, icon).perform();

	}

}
