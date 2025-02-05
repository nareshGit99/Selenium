package com.test;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();

		// Website Task Day8

		// Question 1 & 2 & 3

//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		WebElement btn = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
//		a.click(btn).perform();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//			
//		WebElement btn1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//		a.click(btn1).perform();
//		WebElement cnf = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
//		a.click(cnf).perform();
//		Alert alert2 = driver.switchTo().alert();
//		alert2.dismiss();
//		
//		WebElement btn2 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
//		a.click(btn2).perform();
//		WebElement prompt = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
//		a.click(prompt).perform();
//		Alert alert3 = driver.switchTo().alert();
//		alert3.sendKeys("Naresh");
//		alert3.accept();

		// Question 4

//		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 1st method
//		List<WebElement> aa = driver.findElements(By.tagName("frame"));
//		int size = aa.size();
//		System.out.println(size);
//		driver.switchTo().frame(0);

		// 2nd method
//		driver.switchTo().frame("login_page");

		// 3rd method
//		WebElement f = driver.findElement(By.xpath("//frame[@name=\"login_page\"]"));
//		driver.switchTo().frame(f);
//		WebElement login = driver.findElement(By.xpath("//a[@onclick=\"return fLogon();\"]"));
//		
//		a.click(login).perform();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);

		// Question 5

//		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		// Question 6

//		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
//		WebElement login = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
//		a.click(login).perform();
//		WebElement c = driver.findElement(By.xpath("//input[@id=\"Button2\"]"));
//		a.click(c).perform();
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		// Question 7

//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		List<WebElement> aa = driver.findElements(By.tagName("frame"));
//		driver.switchTo().frame(0);
//		WebElement userId = driver.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]"));
//		userId.sendKeys("8756478");
//		WebElement ctnu = driver.findElement(By.xpath("//a[@onclick=\"return fLogon();\"]"));
//		a.click(ctnu).perform();
//		WebElement pswd = driver.findElement(By.xpath("//input[@id=\"keyboard\"]"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','1234')", pswd);
//		r.keyPress(KeyEvent.VK_1);
//		r.keyRelease(KeyEvent.VK_1);
//		r.keyPress(KeyEvent.VK_1);
//		r.keyRelease(KeyEvent.VK_1);
//		r.keyPress(KeyEvent.VK_1);
//		r.keyRelease(KeyEvent.VK_1);

		// Question 8

		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement icon = driver.findElement(By.xpath(
				"//img[@src=\"L001/consumer/images/../icici-login-update/img/goahead.png?mtime=1568465547000\"]"));
		icon.click();
		WebElement user = driver.findElement(By.xpath("//input[@title=\"Login using User ID and password\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','1234')", user);

	}
}
