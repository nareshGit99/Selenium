package com.test;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Website Task Day 10

		// Question 1

//			driver.get("https://www.amazon.com/");
//			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//			search.sendKeys("iphone x",Keys.ENTER);
//			WebElement link = driver.findElement(By.xpath("//span[text()='Apple iPhone XS, US Version, 64GB, Space Gray for Verizon (Renewed)']"));
//			a.contextClick(link).perform();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//			String parentId = driver.getWindowHandle();
//			Set<String> allWindowsId= driver.getWindowHandles();
//			for (String eachWindowsId : allWindowsId) {
//				if(!parentId.equals(eachWindowsId)) {
//				driver.switchTo().window(eachWindowsId);
//			}
//			
//			}
//			WebElement price = driver.findElement(By.xpath("(//span[text()='$269.00'])[1]"));
//			String text = price.getText();
//			System.out.println(text);

		// Question 2

		/*
		 * driver.get("https://www.snapdeal.com/"); WebElement search =
		 * driver.findElement(By.id("inputValEnter")); boolean displayed =
		 * search.isDisplayed(); boolean enabled = search.isEnabled();
		 * if(displayed&&enabled) { search.sendKeys("iphones 7", Keys.ENTER); }
		 * WebElement link = driver.findElement(By.
		 * xpath("//p[text()='Spectacular Ace - Black Plain Cases Compatible For iPhone 7 ( Pack of 1 )']"
		 * )); js.executeScript("arguments[0].click()", link); String parentId =
		 * driver.getWindowHandle(); Set<String> allWindowId =
		 * driver.getWindowHandles(); for (String eachIds : allWindowId) {
		 * if(!parentId.equals(eachIds)) { driver.switchTo().window(eachIds); } }
		 * WebElement cart =
		 * driver.findElement(By.xpath("//div[@id=\"add-cart-button-id\"]"));
		 * cart.click(); WebElement payment =
		 * driver.findElement(By.xpath("//div[@class=\"you-pay\"]")); String text =
		 * payment.getText(); System.out.println(text); driver.close();
		 */

		// Question 3
//			
//			driver.get("https://www.homedepot.com/");
//			WebElement search = driver.findElement(By.xpath("//input[@id=\"typeahead-search-field-input\"]"));
//			boolean displayed = search.isDisplayed();
//			boolean enabled = search.isEnabled();
//			if(displayed&&enabled) {
//				search.sendKeys("celling fan", Keys.ENTER);
//			}
//			
//			WebElement fan = driver.findElement(By.xpath("(//a[@href=\"/p/Parrot-Uncle-48-in-Wooden-5-Blade-Flush-Mount-"
//					+ "Matte-Black-Ceiling-Fan-with-Remote-Control-and-Light-Kit-F6233110V/313776511\"])[2]"));
//			js.executeScript("arguments[0].click()", fan);

		// Question 4

//			driver.get("http://www.greenstechnologys.com/python-training.html");
//			WebElement selenium = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
//			js.executeScript("arguments[0].click()", selenium);
//			WebElement day = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
//			js.executeScript("arguments[0].click()", day);
//			WebElement days = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
//			js.executeScript("arguments[0].click()", days);
//			String parentId = driver.getWindowHandle();
//			Set<String> allWindowsId = driver.getWindowHandles();
//			java.util.List<String>li = new ArrayList<String>(allWindowsId);
//			String x = li.get(1);
//			driver.switchTo().window(x);
//			WebElement txt = driver.findElement(By.xpath("//pre[@style=\"word-wrap: break-word; white-space: pre-wrap;\"]"));
//			String text = txt.getText();
//			System.out.println(text);

		// Question 5

//			driver.get("http://www.greenstechnologys.com/");
//			WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
//			a.moveToElement(course).perform();
//			WebElement phython = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
//			js.executeScript("arguments[0].click()", phython);
//			WebElement extra = driver.findElement(By.xpath("(//a[@href=\"#Curriculum\"])[2]"));	
//			a.contextClick(extra).perform();
//			Thread.sleep(5000);
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);

		// Question 6

//			driver.get("http://greenstech.in/selenium-course-content.html");
//			WebElement frame = driver.findElement(By.xpath("//div[@id=\"heading304\"]"));
//			a.click(frame).perform();
//			WebElement junit = driver.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/JUNIT.txt\"]"));
//			a.click(junit).perform();
//			String parenId = driver.getWindowHandle();
//			Set<String> allWindow = driver.getWindowHandles();
//			for (String eachwindow : allWindow) {
//				if(!parenId.equals(eachwindow)) {
//					driver.switchTo().window(eachwindow);
//				}
//				
//			}
//			Thread.sleep(3000);
//			WebElement txt = driver.findElement(By.xpath("//pre[@style=\"word-wrap: break-word; white-space: pre-wrap;\"]"));
//			String text = txt.getText();
//			System.out.println(text);

//			//Question 7
//			
//			driver.get("http://greenstech.in/selenium-course-content.html");
//			WebElement core = driver.findElement(By.xpath("//div[@id=\"heading302\"]"));
//			a.click(core).perform();
//			WebElement control = driver.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/Day4_ControlStatements.txt\"]"));
//			a.click(control).perform();
//			String parent = driver.getWindowHandle();
//			Set<String> allWindow = driver.getWindowHandles();
//			java.util.List<String>li = new ArrayList<String>();
//			li.addAll(allWindow);
//			String x = li.get(1);
//			driver.switchTo().window(x);
//			WebElement txt = driver.findElement(By.xpath("//pre[@style=\"word-wrap: break-word; white-space: pre-wrap;\"]"));
//			String text = txt.getText();
//			System.out.println(text);

		// Question 8

//			driver.get("https://www.snapdeal.com/");
//			WebElement search = driver.findElement(By.id("inputValEnter"));
//			search.sendKeys("Hand sanitizer", Keys.ENTER);
//			WebElement sanitizer = driver.findElement(By.xpath("//p[@title=\"Mirah Belle - Tea Tree Hand Rub Sanitizer 500 mL (Pack of 2)\"]"));
//			a.click(sanitizer).perform();
//			String parentId = driver.getWindowHandle();
//			Set<String> allWindow = driver.getWindowHandles();
//			for (String x : allWindow) {
//				if(!parentId.equals(x)) {
//					driver.switchTo().window(x);
//				}
//			}
//			WebElement cart = driver.findElement(By.xpath("(//span[@class=\"intialtext\"])[1]"));
//			a.click(cart).perform();

//			//Question 9
//			
//			driver.get("https://www.flipkart.com/");
//			WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
//			search.sendKeys("Redmi Phones", Keys.ENTER);
//			WebElement phones = driver.findElement(By.xpath("//div[text()='REDMI 12 5G (Jade Black, 128 GB)']"));
//			a.click(phones).perform();
//			String parentId = driver.getWindowHandle();
//			Set<String> allWindow = driver.getWindowHandles();
//			for (String x : allWindow) {
//				if(!parentId.equals(x)) {
//					driver.switchTo().window(x);
//				}
//			}
//			WebElement cart = driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]"));
//			cart.click();
//			Thread.sleep(4000);
//			WebElement txt = driver.findElement(By.xpath("//div[@class=\"jmf23e\"]"));
//			String text = txt.getText();
//			System.out.println(text);

		// Question 10 & 11 & 12

//			driver.get("https://www.flipkart.com/");
//			WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
//			search.sendKeys("mask", Keys.ENTER);
//			WebElement mask = driver.findElement(By.xpath("//a[text()='Vaghani 100Pcs Black Polluation Mask Meltblown Mask Wit...']"));
//			a.click(mask).perform();
//			String parentId = driver.getWindowHandle();
//			Set<String> allWindow = driver.getWindowHandles();
//			for (String x : allWindow) {
//				if(!parentId.equals(x)) {
//					driver.switchTo().window(x);
//				}
//			}
//			WebElement pin = driver.findElement(By.id("pincodeInputId"));
//			pin.sendKeys("600116");
//			driver.close();
//			driver.switchTo().window(parentId);
//			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
//			a.doubleClick(search1).perform();
//			r.keyPress(KeyEvent.VK_DELETE);
//			r.keyRelease(KeyEvent.VK_DELETE);
//			search1.sendKeys("hplaptop", Keys.ENTER);
//			Thread.sleep(5000);
//			WebElement lap = driver.findElement(By.xpath("//div[text()='HP AMD Ryzen 5 Hexa Core 5500U - (16 GB/512 GB SSD/Windows 11 Home) 15s- eq2182AU Thin and Light Lapto...']"));
//			a.click(lap).perform();
//			String parent = driver.getWindowHandle();
//			Set<String> allWindow1 = driver.getWindowHandles();
//			java.util.List<String>li = new ArrayList<String>();
//			li.addAll(allWindow1);
//			String x = li.get(1);
//			driver.switchTo().window(x);
//			WebElement price = driver.findElement(By.xpath("//div[@class=\"x+7QT1\"]"));
//			String text = price.getText();
//			System.out.println(text);
//			
//			driver.navigate().to("http://greenstech.in/selenium-course-content.html");
//			WebElement selenium = driver.findElement(By.xpath("//div[@id=\"heading303\"]"));
//			a.click(selenium).perform();
//			WebElement day = driver.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/August-2019/Selenium Day10.txt\"]"));
//			a.click(day).perform();
//			String parent1 = driver.getWindowHandle();
//			Set<String> allWindow2 = driver.getWindowHandles();
//			java.util.List<String>lii = new ArrayList<String>(allWindow2);
//			String y = lii.get(2);
//			driver.switchTo().window(y);
//			WebElement txt = driver.findElement(By.xpath("//pre[@style=\"word-wrap: break-word; white-space: pre-wrap;\"]"));
//			String text2 = txt.getText();
//			System.out.println(text2);

		// Question 13

//			driver.get("http://greenstech.in/selenium-course-content.html");
//			WebElement frame = driver.findElement(By.xpath("//div[@id=\"heading304\"]"));
//			a.click(frame).perform();
//			WebElement test = driver.findElement(By.xpath("//a[text()=' TESTNG']"));
//			a.click(test).perform();
//			String parent= driver.getWindowHandle();
//			Set<String> allWindow = driver.getWindowHandles();
//			java.util.List<String>li = new ArrayList<String>(allWindow);
//			String y = li.get(1);
//			driver.switchTo().window(y);
//			WebElement txt = driver.findElement(By.xpath("//pre[@style=\"word-wrap: break-word; white-space: pre-wrap;\"]"));
//			String text = txt.getText();
//			System.out.println(text);

	}

}
