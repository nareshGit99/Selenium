package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day1 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// 1.launch the Browser
		driver.get("http://omrbranch.com/");

		// 2.Maximize the Window
		driver.manage().window().maximize();
		
		//3.To locate and the pass the text in the uername txtbox
		WebElement txtusername = driver.findElement(By.name("email"));
		txtusername.sendKeys("naresh@gmail.com");
		
		//4.To locate and the pass the text in the password txtbox
		WebElement txtpswd = driver.findElement(By.name("pass"));
		txtpswd.sendKeys("12343456");
		
		//5.click the button
		
		WebElement button = driver.findElement(By.xpath("//button[@value='login']"));
		button.click();
				
		
		// 6.get the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// 7.get title
		String title = driver.getTitle();
		System.out.println(title);

		// 8.quit
		driver.quit();
//======================================================================================	
		driver.get("http://omrbranch.com/");
		WebElement name = driver.findElement(By.id("email"));
		boolean enabled = name.isEnabled();
		if(enabled) {
			name.sendKeys("naresh@123");
		}else {
			System.out.println(enabled);
		}
		
		String attribute = name.getAttribute("value");
		System.out.println(attribute);
		WebElement pswd = driver.findElement(By.id("pass"));
		boolean enabled2 = pswd.isEnabled();
		if(enabled2) {
			pswd.sendKeys("123456");
		}else {
			System.out.println(enabled2);
		}
		
		String attribute2 = pswd.getAttribute("value");
		System.out.println(attribute2);
		
		driver.quit();
//=============================================================================================

//		driver.get("https://greenstech.in/selenium-course-content.html");
		//WebElement clk = driver.findElement(By.xpath("//a[@id=\"overview-tab\"]"));
		//clk.click();
		//Thread.sleep(5000);
		//WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium training class will make you an expert in Selenium.')]"));
		//String text1 = text.getText();
		//System.out.println(text1);
		
//		driver.get("http://omrbranch.com/");
//		WebElement signin = driver.findElement(By.xpath("//a[@class=\"signupanchor showSignup\"]"));
//		signin.click();
//		Thread.sleep(5000);
//		WebElement fname = driver.findElement(By.name("first_name"));
//		boolean enabled = fname.isEnabled();
//		if(enabled) {
//			fname.sendKeys("NARESH");
//		}else {
//			System.out.println(enabled);
//		}
//		
//		String text = fname.getText();
//		System.out.println(text);
//		
//	====================================================================================
//			driver.get("http://omrbranch.com/apitestingtraininginchennaiomr");
//	WebElement skill = driver.findElement(By.id("skills"));
//	Select s = new Select(skill);
//	java.util.List<WebElement> options = s.getOptions();
//	for (int i = 0; i < 10; i++) {
//		s.selectByIndex(i);
//		}
//	java.util.List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//	for (WebElement options1 : allSelectedOptions) {
//		String attribute = options1.getAttribute("value");
//		System.out.println(attribute);
	}


}
