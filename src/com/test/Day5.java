package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		Actions a = new Actions(driver);

//		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
//	    driver.manage().window().maximize();
//	    WebElement right = driver.findElement(By.xpath("//button[text()=\"Right click to enter past date\"]"));
//	    a.contextClick(right).perform();

//	    driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
//	    WebElement String = driver.findElement(By.id("credit2"));
//	    WebElement cls = driver.findElement(By.id("java-class"));
//	    a.dragAndDrop(String, cls).perform();
//	    
//	    WebElement list = driver.findElement(By.id("fourth"));
//	    WebElement inter = driver.findElement(By.id("java-interface"));
//	    a.dragAndDrop(list, inter).perform();
//	    
//	    WebElement Class = driver.findElement(By.id("fifth"));
//	    WebElement Act = driver.findElement(By.id("selenium-class"));
//	    a.dragAndDrop(Class, Act).perform();
//	    
//	    WebElement drive  = driver.findElement(By.id("credit1"));
//	    WebElement inte = driver.findElement(By.id("selenium-interface"));
//	    a.dragAndDrop(drive, inte).perform();
//	    
//	    WebElement text = driver.findElement(By.xpath("//a[text()=\"Succesfully Matched!\"]"));
//	    String text2 = text.getText();
//	    System.out.println(text2);

		// Day 5 Website Task

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();

		// Question 1

//		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		WebElement bank = driver.findElement(By.id("credit2"));
//		WebElement Act = driver.findElement(By.id("bank"));
//		a.dragAndDrop(bank, Act).perform();
//		
//		WebElement Amt = driver.findElement(By.id("fourth"));
//		WebElement debit = driver.findElement(By.id("amt7"));
//		a.dragAndDrop(Amt, debit).perform();
//		
//		WebElement sale = driver.findElement(By.id("credit1"));
//		WebElement Act1 = driver.findElement(By.id("loan"));
//		a.dragAndDrop(sale, Act1).perform();
//		
//		WebElement Amt1 = driver.findElement(By.id("fourth"));
//		WebElement credit = driver.findElement(By.id("amt8"));
//		a.dragAndDrop(Amt1,credit ).perform();
//		driver.quit();

		// Question 2

//		driver.get(" http://www.amazon.in");
//		WebElement prime = driver.findElement(By.xpath("//a[@id=\"nav-link-amazonprime\"]"));
//		a.moveToElement(prime).perform();
//		WebElement clk = driver.findElement(By.xpath("//img[@id=\"multiasins-img-link\"]"));
//		clk.click();
//		driver.quit();

		// Question 3

//		driver.get("http://www.flipkart.com");
//		WebElement home = driver.findElement(By.xpath("//span[text()=\"Home & Furniture\"]"));
//		a.moveToElement(home).perform();
//		WebElement bath = driver.findElement(By.xpath("//a[text()=\"Cleaning & Bath\"]"));
//		a.moveToElement(bath).perform();
//		WebElement Accessories = driver.findElement(By.xpath("//a[text()=\"Bathroom Accesorries\"]"));
//		Accessories.click();
//		Thread.sleep(3000);
//		WebElement h = driver.findElement(By.xpath("(//span[@class=\"TSD49J\"])[6]"));
//		a.moveToElement(h).perform();
//		WebElement towels = driver.findElement(By.xpath("//a[text()=\"Bath Towels\"]"));
//		towels.click();
//		Thread.sleep(3000);
//		WebElement name = driver.findElement(By.xpath("//a[@title=\"Ayus Cotton 420 GSM Hand, Bath Towel Set\"]"));
//		name.click();
//		String text = name.getText();
//		System.out.println(text);

		// Question 4 Not Execute
//		
//		driver.get("https://www.shopclues.com/wholesale.html");
//		WebElement mobiles = driver.findElement(By.xpath("//li[@id=\"nav_44\"]"));
//		a.moveToElement(mobiles).perform();
//		WebElement smart = driver.findElement(By.xpath("//a[text()=\"Samsung\"]"));
//		smart.click();

		// Question 5

//		driver.get("https://www.shopclues.com/wholesale.html");
//		WebElement sports = driver.findElement(By.xpath("//a[text()=\"Sports & More\"]"));
//		a.moveToElement(sports).perform();
//		WebElement weight = driver.findElement(By.xpath("//a[text()=\"Weight Gainers\"]"));
//		weight.click();
//		driver.quit();

		// Question 6

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement course = driver.findElement(By.xpath("//div[text()=\"Courses \"]"));
//		a.moveToElement(course).perform();
//		WebElement software = driver.findElement(By.xpath("//span[text()=\"Software Testing (12)\"]"));
//		a.moveToElement(software).perform();
//		WebElement selenium = driver.findElement(By.xpath("//span[text()=\"Selenium Certification Training\"]"));
//		selenium.click();

		// Question 7

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement course = driver.findElement(By.xpath("//div[text()=\"Courses \"]"));
//		a.moveToElement(course).perform();
//		WebElement oracle = driver.findElement(By.xpath("//span[text()=\"Oracle (48)\"]"));
//		a.moveToElement(oracle).perform();
//		WebElement sql = driver.findElement(By.xpath("//span[text()=\"Oracle SQL and PLSQL Placement Certification Training\"]"));
//		sql.click();

		// Question 8

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement course1 = driver.findElement(By.xpath("//div[text()=\"Courses \"]"));
//		a.moveToElement(course1).perform();
//		WebElement data = driver.findElement(By.xpath("//span[text()=\"Data Warehousing (5)\"]"));
//		a.moveToElement(data).perform();
//		WebElement micro = driver.findElement(By.xpath("//span[text()=\"DB2 DBA Certification Training\"]"));
//		micro.click();
//		
		// Question 9

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement course2 = driver.findElement(By.xpath("//div[text()=\"Courses \"]"));
//		a.moveToElement(course2).perform();
//		WebElement rpa = driver.findElement(By.xpath("//span[text()=\"RPA (6)\"]"));
//		a.moveToElement(rpa).perform();
//		WebElement blue = driver.findElement(By.xpath("//span[text()=\"Blue Prism Certification Training\"]"));
//		blue.click();
//		
		// Question 10

//		driver.get("http://greenstech.in/selenium-course-content.html");
//		WebElement course1 = driver.findElement(By.xpath("//div[text()=\"Courses \"]"));
//		a.moveToElement(course1).perform();
//		WebElement data = driver.findElement(By.xpath("//span[text()=\"Data Warehousing (5)\"]"));
//		a.moveToElement(data).perform();

		// Question 11

//		driver.get("https://www.homedepot.com/");
//		WebElement shopAll = driver.findElement(By.xpath("//p[text()=\"Shop All\"]"));
//		Thread.sleep(3000);
//		shopAll.click();
//		WebElement dept = driver.findElement(By.xpath("//span[text()=\"Shop By Department\"]"));
//		dept.click();
//		WebElement heat = driver.findElement(By.xpath("//span[text()=\"Heating, Cooling, & Air Quality\"]"));
//		heat.click();
//		WebElement Air = driver.findElement(By.xpath("(//span[text()=\"Air Conditioners\"])[2]"));
//		Air.click();
//		WebElement Ac = driver.findElement(By.xpath("//span[text()=\"Portable Air Conditioners\"]"));
//		Ac.click();

		// Question 12

//		driver.get("https://www.homedepot.com/");
//		WebElement shopAll = driver.findElement(By.xpath("//p[text()=\"Shop All\"]"));
//		shopAll.click();
//		Thread.sleep(3000);
//		WebElement dept = driver.findElement(By.xpath("//span[text()=\"Shop By Department\"]"));
//		dept.click();
//		WebElement paint = driver.findElement(By.xpath("//span[text()=\"Paint\"]"));
//		paint.click();
//		WebElement ex = driver.findElement(By.xpath("//span[text()=\"Interior Paint\"]"));
//		ex.click();
//		WebElement celing = driver.findElement(By.xpath("//span[text()=\"Ceiling Paint\"]"));
//		celing.click();

		// Question 13
//		
//		driver.get("https://www.snapdeal.com/");
//		WebElement mobiles = driver.findElement(By.xpath("//span[text()=\"Mobile & Accessories\"]"));
//		a.moveToElement(mobiles).perform();
//		WebElement covers = driver.findElement(By.xpath("//span[text()=\"Printed Back Covers\"]"));
//		covers.click();

		// Question 14

//		driver.get("https://www.snapdeal.com/");
//		WebElement womens = driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
//		a.moveToElement(womens).perform();
//		WebElement footwear = driver.findElement(By.xpath("(//a[@href=\"https://www.snapdeal.com/products/womens-footwear\"])[1]"));
//		footwear.click();
//		WebElement heels = driver.findElement(By.xpath("//div[text()=\"Heels for Women\"]"));
//		heels.click();
//		driver.quit();

		// Question 15

//		driver.get("https://www.amazon.in/");
//		WebElement sign = driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"));
//		a.moveToElement(sign).perform();
//		WebElement in = driver.findElement(By.xpath("(//span[text()=\"Sign in\"])[1]"));
//		in.click();
//		WebElement email = driver.findElement(By.name("email"));
//		email.sendKeys("9876545679");
//		WebElement btn = driver.findElement(By.id("continue"));
//		btn.click();
//		driver.quit();

		// Question 16

//		driver.get("https://www.amazon.in/");
//		WebElement sign = driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"));
//		a.moveToElement(sign).perform();
//		WebElement sd = driver.findElement(By.xpath("//span[text()=\"Your Wish List\"]"));
//		sd.click();
//		driver.quit();

		// Question 17

//		driver.get("https://www.flipkart.com/");
//		WebElement fashion = driver.findElement(By.xpath("//span[text()=\"Fashion\"]"));
//		a.moveToElement(fashion).perform();
//		WebElement womens = driver.findElement(By.xpath("//a[text()=\"Women Footwear\"]"));
//		a.moveToElement(womens).perform();
//		WebElement heels = driver.findElement(By.xpath("//a[text()=\"Women Flats\"]"));
//		heels.click();
//		driver.quit();

		// Question 18

//		driver.get("https://www.flipkart.com/");
//		WebElement fashion = driver.findElement(By.xpath("//span[text()=\"Beauty, Toys & More\"]"));
//		a.moveToElement(fashion).perform();
//		WebElement kids = driver.findElement(By.xpath("//a[text()=\"Toys & School Supplies\"]"));
//		a.moveToElement(kids).perform();
//		WebElement car = driver.findElement(By.xpath("//a[text()=\"Remote Control Toys\"]"));
//		car.click();
//		driver.quit();

		// Question 19

//		driver.get("https://www.flipkart.com/");
//		WebElement mobile = driver.findElement(By.xpath("//span[text()=\"Mobiles\"]"));
//		mobile.click();
//		WebElement realme = driver.findElement(By.xpath("//div[text()=\"realme\"]"));
//		realme.click();
//		Thread.sleep(3000);
//		WebElement phone = driver.findElement(By.xpath("//div[text()=\"realme 12x 5G (Twilight Purple, 128 GB)\"]"));
//		phone.click();
//		driver.quit();

		// Question 20

		driver.get("https://www.flipkart.com/");
		WebElement application = driver.findElement(By.xpath("//span[text()=\"Appliances\"]"));
		application.click();
		WebElement tv = driver.findElement(By.xpath("//span[text()=\"TVs & Appliances\"]"));
		a.moveToElement(tv).perform();
		Thread.sleep(3000);
		WebElement brand = driver.findElement(By.xpath("//a[text()=\"Mi\"]"));
		brand.click();
		Thread.sleep(3000);
		WebElement mi = driver
				.findElement(By.xpath("(//div[contains(text(),\"Mi X Series 138 cm (55 inch) Ultra HD (4K)\")])[1]"));
		mi.click();
		driver.quit();

	}
}
