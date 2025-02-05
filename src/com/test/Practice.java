package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://cashkaro.com/");
		Thread.sleep(3000);
//		WebElement popup = driver.findElement(By.xpath("//div[@class=\\\"wzrk-alert wiz-show-animate\\\"]/child::div[@class=\\\"wzrk-button"
//				+ "-container\\\"]/child::button[@class=\\\"No thanks\\\"]"));
		WebElement a = driver.findElement(By.xpath("//button[@id='wzrk-confirm']"));
		a.click();
		
	}

}
