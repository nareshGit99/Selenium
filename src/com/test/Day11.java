package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day11 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		// Website Task Day 11

		// Question 1

//		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement table = driver.findElement(By.xpath("//table[@border=\"l\"]"));
//		List<WebElement> rows = table.findElements(By.tagName("td"));
//		for (int i = 0; i < rows.size(); i++) {
//			System.out.println(rows.get(i).getText());
//			
//		}
//		
//		//Question 2
//		
//		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement table1 = driver.findElement(By.xpath("//table[@border=\"l\"]"));
//		List<WebElement> rows1 = table1.findElements(By.tagName("td"));
//		for (int i = 0; i < 2; i++) {
//			System.out.println(rows1.get(i).getText());
//			}

//		Question 3

//		System.out.println();
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		int size = row.size();
//		System.out.print(size);
//		
//		//Question 4
//		
//		List<WebElement> row1 = table.findElements(By.tagName("td"));
//			for (int i = 3; i <row1.size(); i++) {
//				System.out.println(row1.get(3).getText());
//				
//			}
//		
//		//Question 5
//		
//		List<WebElement> row2 = table.findElements(By.tagName("td"));
//		for (int i = 2; i <row2.size(); i++) {
//			System.out.println(row2.get(i).getText());
//			
//		}
	}
}
