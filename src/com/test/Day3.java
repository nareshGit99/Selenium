package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Website Task Day3
		// Question 1

//			driver.get("https://www.amazon.in/");
//			WebElement product = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
//			product.sendKeys("iphone");
//			WebElement icon = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
//			icon.click();
//			driver.quit();

		// Question 2

//			driver.get("https://www.facebook.com/");
//			WebElement user = driver.findElement(By.id("email"));
//			boolean enabled = user.isEnabled();
//			if(enabled) {
//				user.sendKeys("naresh@123");
//			}else {
//				System.out.println(enabled);
//			}
//			WebElement pswd = driver.findElement(By.id("pass"));
//			boolean enabled2 = pswd.isEnabled();
//			if(enabled2) {
//				pswd.sendKeys("1123454");
//			}else {
//				System.out.println(enabled2);
//			}
//			WebElement login = driver.findElement(By.name("login"));
//			login.click();
//			driver.quit();

		// Question 3

//			driver.get("https://demo.automationtesting.in/Register.html");
//			WebElement fname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
//			fname.sendKeys("naresh");
//			WebElement lname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//			lname.sendKeys("B");
//			WebElement address = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
//			address.sendKeys("Chennai");
//			WebElement email = driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
//			email.sendKeys("naresh123@yahoo.com");
//			WebElement mobile = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
//			mobile.sendKeys("9876542346");
//			WebElement gender = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
//			gender.click();
//			WebElement hobbies = driver.findElement(By.xpath("//input[@value=\"Cricket\"]"));
//			hobbies.click();
//			WebElement pswd = driver.findElement(By.id("firstpassword"));
//			pswd.sendKeys("123456789");
//			WebElement cnf = driver.findElement(By.id("secondpassword"));
//			cnf.sendKeys("123456789");
//			driver.quit();

		// Question 4

//			driver.get("https://toolsqa.com/automation-practice-form/");
//			WebElement link = driver.findElement(By.xpath("//a[@href=\"/selenium-training?q=headers\"]"));
//			link.click();
//			WebElement reg = driver.findElement(By.xpath("(//a[@href=\"#enroll-form\"])[1]"));
//			reg.click();
//			WebElement fname = driver.findElement(By.id("first-name"));
//			fname.sendKeys("Naresh");
//			WebElement lname = driver.findElement(By.id("last-name"));
//			lname.sendKeys("B");
//			WebElement email = driver.findElement(By.id("email"));
//			email.sendKeys("naresh@123");
//			WebElement mobile = driver.findElement(By.id("mobile"));
//			mobile.sendKeys("9845334354");
//			WebElement city = driver.findElement(By.id("city"));
//			city.sendKeys("Chennai");
//			WebElement msg = driver.findElement(By.id("message"));
//			msg.sendKeys("i am interested");
//			driver.quit();

		// Question 5

//			driver.get("https://greenstech.in/selenium-course-content.html");
//			WebElement interview = driver.findElement(By.xpath("//div[@id=\"heading20\"]"));
//			interview.click();
//			WebElement cts = driver.findElement(By.xpath("//a[text()=\"BNP Paribas Interview Question \"]"));
//			cts.click();
//			driver.quit();

		// Question 6 Not Execute
		//
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement act = driver.findElement(By.xpath("(//div[@class=\"rb_main_secondary_item  link\"])[2]"));
		act.click();
		WebElement login = driver.findElement(By.xpath("//span[text()=\"Login/ Sign Up\"]"));
		login.click();
		Thread.sleep(5000);
		WebElement mobile = driver.findElement(By.xpath("(//input[@placeholder=\"Enter your mobile number\"])[1]"));
		mobile.sendKeys("75576656565");

		// Question 7

//			driver.get("https://www.cleartrip.com/trains");
//			WebElement from = driver.findElement(By.xpath("//input[@title=\"From station\"]"));
//			boolean enabled = from.isEnabled();
//			if(enabled) {
//				from.sendKeys("Chennai");
//			}else {
//				System.out.println(enabled);
//			}
//			WebElement to = driver.findElement(By.xpath("//input[@title=\"To station\"]"));
//			boolean enabled1 = to.isEnabled();
//			if(enabled1) {
//				to.sendKeys("Delhi");
//			}else {
//				System.out.println(enabled1);
		//
//			}
//			WebElement icon = driver.findElement(By.xpath("//button[@id=\"trainFormButton\"]"));
//			icon.click();
//			driver.quit();

		// Question 8

//			driver.get("http://greenstech.in/selenium-course-content.html");
//			WebElement model = driver.findElement(By.xpath("//div[@title=\"Model Resumes\"]"));
//			model.click();
//			Thread.sleep(2000);
//		    WebElement resume = driver.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/Fresher_Selenium_Resume.pdf\"]"));
//			resume.click();
//			driver.quit();

		// Question 9

//			driver.get("https://www.flipkart.com/");
//			WebElement login = driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
//			login.click();
//			WebElement Mob = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
//			Mob.sendKeys("9796363535");
//			WebElement otp = driver.findElement(By.xpath("//button[@class=\"QqFHMw twnTnD _7Pd1Fp\"]"));
//			otp.click();

		// Question 10

//			driver.get("https://www.amazon.in/");
//			WebElement product = driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_4\"]"));
//			product.click();
//			WebElement mobile = driver.findElement(By.xpath("//span[text()=\"Mobile Accessories\"]"));
//			mobile.click();
//			driver.quit();

		// Question 11

//			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
//			WebElement first = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
//			boolean enabled = first.isEnabled();
//			if(enabled) {
//				first.sendKeys("Naresh");
//			}else {
//				System.out.println(enabled);
//			}
//			WebElement last = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
//			last.sendKeys("B");
//			WebElement next = driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"]"));
//			next.click();
//			driver.quit();

		// Question 12 not Execute

//			driver.get("https://www.snapdeal.com/");
//			driver.manage().window().maximize();
//			WebElement signin = driver.findElement(By.xpath("//div[@class=\"accountInner\"]"));
//			signin.click();
//			Thread.sleep(2000);
//			WebElement register = driver.findElement(By.xpath("//span[@class=\"newUserRegister\"]"));
//			register.click();
//			WebElement mob = driver.findElement(By.xpath("//input[@class=\"col-xs-24\"]"));
//			mob.click();
//			WebElement icon = driver.findElement(By.id("id=\"checkUser\""));
//			icon.click();

		// Question 13

//			driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
//			WebElement mob = driver.findElement(By.xpath("//input[@class=\"form-control mobileNumberInput\"]"));
//			mob.sendKeys("9366325391");
//			WebElement login = driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]"));
//			login.click();

		// Question 14

//			driver.get("https://www.swiggy.com/");
//			driver.manage().window().maximize();
//			WebElement sign = driver.findElement(By.xpath("//span[text()=\"Sign In\"]"));
//			sign.click();
//			WebElement mobile = driver.findElement(By.id("mobile"));
//			mobile.sendKeys("9797966555");
//			Thread.sleep(2000);
//			WebElement icon = driver.findElement(By.xpath("//a[@class=\"a-ayg\"]"));
//			icon.click();
//			Thread.sleep(2000);
//			WebElement name = driver.findElement(By.id("name"));
//			name.sendKeys("xyz");
//			WebElement email = driver.findElement(By.id("email"));
//			email.sendKeys("xyz@gmail.com");

	}
}
