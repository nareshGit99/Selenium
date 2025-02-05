package com.test;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day9 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
//		driver.get("http://omrbranch.com/apitestingtraininginchennaiomr");
//		WebElement skill = driver.findElement(By.id("skills"));
//		Select s =new Select(skill);
//		List<WebElement> options = s.getOptions();
//		for (WebElement txt : options) {
//		     String text = txt.getText();
//		     System.out.println(text);
//		}

		// Website task day9

		// Question 1

//		driver.get("http://demoqa.com/automation-practice-form/");
//		WebElement state = driver.findElement(By.id("state"));
//		js.executeScript("arguments[0].scrollIntoView(true)", state);
//		WebElement s = driver.findElement(By.xpath("(//div[@class=\" css-1wa3eu0-placeholder\"])[1]"));
//		s.click();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		WebElement text = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
//		Select ss = new Select(text);
//		List<WebElement> options = ss.getOptions();
//		for (int j = 0; j < options.size(); j++) {
//			if(j%2==0) {
//				WebElement txt = options.get(j);
//				String attribute2 = txt.getAttribute("value");
//				System.out.println(attribute2);			
//			}
//		}

		// Question 2

//				driver.get("http://demoqa.com/automation-practice-form/");
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//				WebElement state = driver.findElement(By.id("city"));
//				js.executeScript("arguments[0].scrollIntoView(true)", state);
//				WebElement s = driver.findElement(By.xpath("//div[text()='Select City']"));
//				s.click();	
//				r.keyPress(KeyEvent.VK_DOWN);
//				r.keyRelease(KeyEvent.VK_DOWN);
//				r.keyPress(KeyEvent.VK_DOWN);
//				r.keyRelease(KeyEvent.VK_DOWN);
//				r.keyPress(KeyEvent.VK_ENTER);
//				r.keyRelease(KeyEvent.VK_ENTER);
//				WebElement text = driver.findElement(By.xpath("//div[text()='Haryana']"));
//				Select ss = new Select(text);
//				List<WebElement> options = ss.getOptions();
//				for (int j = 0; j < options.size(); j++) {
//					if(j%2!=0) {
//						WebElement txt = options.get(j);
//						String attribute2 = txt.getAttribute("value");
//						System.out.println(attribute2);
//						
//					}
//				}

		// Question 3

//		driver.get("https://www.facebook.com/");
//		WebElement act = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		act.click();
//		Thread.sleep(4000);
//		WebElement year = driver.findElement(By.id("year"));
//		Select s = new Select(year);
//		List<WebElement> options = s.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			if(i%2==0) {
//				WebElement txt = options.get(i);
//				String attribute = txt.getAttribute("value");
//				System.out.println(attribute);
//			}
//		}

		// Question 4

//		driver.get("https://www.facebook.com/");
//		WebElement act = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		act.click();
//		Thread.sleep(4000);
//		WebElement month = driver.findElement(By.id("month"));
//		Select s= new Select(month);
//		List<WebElement> options = s.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			if(i%2!=0) {
//			WebElement txt = options.get(i);
//			String text = txt.getText();
//			System.out.println(text);
//		}
//		}

		// Question 5

//		driver.get("https://www.facebook.com/");
//		WebElement act = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		act.click();
//		Thread.sleep(4000);
//		WebElement days = driver.findElement(By.id("day"));
//		Select s= new Select(days);
//		List<WebElement> options = s.getOptions();
//		for (int i = 0; i <options.size(); i++) {
//			if(i%2==1) {
//			WebElement txt = options.get(i);
//			String text = txt.getText();
//			System.out.println(text);
//		}
//		}

		// Question 6

//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		WebElement country = driver.findElement(By.xpath("//select[@name=\"country\"]"));
//		Select s = new Select(country);
//		List<WebElement> options = s.getOptions();
//		for (WebElement opt : options) {
//			String text = opt.getText();
//			System.out.println(text);
//		}

		// Question 7

//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		WebElement first = driver.findElement(By.name("firstName"));
//		boolean d = first.isDisplayed();
//		boolean e = first.isEnabled();
//		if(d&&e) {
//			first.sendKeys("Bala");
//		}
//		WebElement last = driver.findElement(By.name("lastName"));
//		boolean di = last.isDisplayed();
//		boolean en = last.isEnabled();
//		if(di&&en) {
//			last.sendKeys("B");
//		}
//		WebElement phone = driver.findElement(By.name("phone"));
//		boolean dis = phone.isDisplayed();
//		boolean ena = phone.isEnabled();
//		if(dis&&ena) {
//			phone.sendKeys("9876576776");
//		}
//		WebElement email = driver.findElement(By.name("userName"));
//		boolean disp = email.isDisplayed();
//		boolean enab = email.isEnabled();
//		if(disp&&enab) {
//			email.sendKeys("naresh@123");
//		}
//		WebElement add = driver.findElement(By.name("address1"));
//		boolean displ = add.isDisplayed();
//		boolean enabl = add.isEnabled();
//		if(displ&&enabl) {
//			add.sendKeys("parrys");
//		}
//		WebElement city = driver.findElement(By.name("city"));
//		boolean displa = city.isDisplayed();
//		boolean enable = city.isEnabled();
//		if(displa&&enable) {
//			city.sendKeys("Chennai");
//		}
//		WebElement state = driver.findElement(By.name("state"));
//		boolean display = state.isDisplayed();
//		boolean enabled = state.isEnabled();
//		if(display&&enabled) {
//			state.sendKeys("TN");
//		}
//		WebElement pin = driver.findElement(By.name("postalCode"));
//		boolean displaye = pin.isDisplayed();
//		boolean enabled1 = pin.isEnabled();
//		if(displaye&&enabled) {
//			pin.sendKeys("600445");
//		}
//		WebElement country = driver.findElement(By.name("country"));
//		Select s= new Select(country);
//		s.selectByIndex(2);
//		List<WebElement> options = s.getOptions();
//		for (WebElement opt : options) {
//			String attribute = opt.getAttribute("value");
//			System.out.println(attribute);
//		}
//		WebElement user = driver.findElement(By.name("email"));
//		boolean displayed = user.isDisplayed();
//		boolean enabled2 = user.isEnabled();
//		if(displayed&&enabled2) {
//			user.sendKeys("naresh");
//		}
//		WebElement pass = driver.findElement(By.name("password"));
//		boolean displayed1 = pass.isDisplayed();
//		boolean enabled3 = pass.isEnabled();
//		if(displayed1&&enabled3) {
//			pass.sendKeys("naresh123");
//		}
//		WebElement Cnfpass = driver.findElement(By.name("confirmPassword"));
//		boolean displayed2 = Cnfpass.isDisplayed();
//		boolean enabled4 = Cnfpass.isEnabled();
//		if(displayed2&&enabled4) {
//			Cnfpass.sendKeys("naresh123");
//		}
//		WebElement submit = driver.findElement(By.name("submit"));
//		boolean displayed3 = submit.isDisplayed();
//		boolean enabled5 = submit.isEnabled();
//		if(displayed3&&enabled5) {
//			submit.click();
//		}

		// Question 8

//		driver.get("http://adactinhotelapp.com/");
//		WebElement user = driver.findElement(By.id("username"));
//		boolean displayed = user.isDisplayed();
//		boolean enabled = user.isEnabled();
//		if(displayed&&enabled) {
//			user.sendKeys("naresh8399");
//		}
//		WebElement pass = driver.findElement(By.id("password"));
//		boolean displayed1 = pass.isDisplayed();
//		boolean enabled1 = pass.isEnabled();
//		if(displayed1&&enabled1) {
//			pass.sendKeys("Y19E52");
//		}
//		WebElement login = driver.findElement(By.id("login"));
//		boolean displayed2 = login.isDisplayed();
//		boolean enabled2 = login.isEnabled();
//		if(displayed2&&enabled2) {
//			login.click();
//		}
//		WebElement location = driver.findElement(By.id("location"));
//		Select s= new Select(location);
//		s.selectByIndex(3);
//		WebElement hotel = driver.findElement(By.id("hotels"));
//		Select s1= new Select(hotel);
//		s1.selectByIndex(3);
//		WebElement roomtype = driver.findElement(By.id("room_type"));
//		Select s2= new Select(roomtype);
//		s2.selectByValue("Double");
//		WebElement count = driver.findElement(By.id("room_nos"));
//		Select s3= new Select(count);
//		s3.selectByVisibleText("4 - Four");
//		WebElement checkin = driver.findElement(By.id("datepick_in"));
//		checkin.click();
//		WebElement checkout = driver.findElement(By.id("datepick_out"));
//		checkout.click();
//		WebElement adult = driver.findElement(By.id("adult_room"));
//		Select s4= new Select(adult);
//		s4.selectByIndex(3);
//		WebElement child = driver.findElement(By.id("child_room"));
//		Select s5= new Select(child);
//		s5.selectByIndex(0);
//		WebElement sumbit = driver.findElement(By.id("Submit"));
//		sumbit.click();
//		WebElement icon = driver.findElement(By.id("radiobutton_0"));
//		icon.click();
//		Thread.sleep(3000);
//		WebElement ctnu = driver.findElement(By.id("continue"));
//		ctnu.click();
//		WebElement first = driver.findElement(By.id("first_name"));
//		first.sendKeys("Naresh");
//		WebElement last = driver.findElement(By.id("last_name"));
//		last.sendKeys("*");
//		WebElement add = driver.findElement(By.id("address"));
//		add.sendKeys("chennai");
//		WebElement cardno = driver.findElement(By.id("cc_num"));
//		cardno.sendKeys("5234567898761234");
//		WebElement type = driver.findElement(By.id("cc_type"));
//		Select s6 = new Select(type);
//		s6.selectByIndex(2);
//		WebElement month = driver.findElement(By.id("cc_exp_month"));
//		Select s7 = new Select(month);
//		s7.selectByValue("1");
//		WebElement year = driver.findElement(By.id("cc_exp_year"));
//		Select s8 = new Select(year);
//		s8.selectByIndex(2);
//		WebElement ccv = driver.findElement(By.id("cc_cvv"));
//		ccv.sendKeys("1234");
//		WebElement book = driver.findElement(By.id("book_now"));
//		book.click();
//		Thread.sleep(5000);
//		WebElement bill = driver.findElement(By.xpath("//input[@name=\"order_no\"]"));
//		String attribute = bill.getAttribute("value");
//		System.out.println(attribute);

		// Question 9 & 10 & 11

//		driver.get("http://adactinhotelapp.com/");
//		WebElement user = driver.findElement(By.id("username"));
//		boolean displayed = user.isDisplayed();
//		boolean enabled = user.isEnabled();
//		if(displayed&&enabled) {
//			user.sendKeys("naresh8399");
//		}
//		WebElement pass = driver.findElement(By.id("password"));
//		boolean displayed1 = pass.isDisplayed();
//		boolean enabled1 = pass.isEnabled();
//		if(displayed1&&enabled1) {
//			pass.sendKeys("Y19E52");
//		}
//		WebElement login = driver.findElement(By.id("login"));
//		boolean displayed2 = login.isDisplayed();
//		boolean enabled2 = login.isEnabled();
//		if(displayed2&&enabled2) {
//			login.click();
//		}
//		WebElement roomtype = driver.findElement(By.id("room_type"));
//		Select s= new Select(roomtype);
//		List<WebElement> options = s.getOptions();
//		for (WebElement opt : options) {
//			String text1 = opt.getText();
//			System.out.println(text1);
//		}
//		
//		WebElement location = driver.findElement(By.id("location"));
//		Select s1 = new Select(location);
//		List<WebElement> options2 = s1.getOptions();
//		for (WebElement locations : options2) {
//			String text = locations.getText();
//			System.out.println(text);
//		}
//		WebElement no = driver.findElement(By.id("adult_room"));
//		Select s2 = new Select(no);
//		List<WebElement> options3 = s2.getOptions();
//		for (int i = 0; i < options3.size(); i++) {
//			System.out.println(i);

	}

}
