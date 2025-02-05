package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public void createCellAndSetCellData(String sheetName, int rownum, int cellnum, String data) throws IOException {
		File file = new File("D:\\Naresh\\BaseClass\\Excel\\DataBase.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);

	}

	public void updateCellData(String sheetName, int rownum, int cellnum, String oldData, String newData)
			throws IOException {
		File file = new File("D:\\Naresh\\BaseClass\\Excel\\DataBase.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);

	}

	public String getCellData(String sheetName, int rownum, int cellnum) throws IOException {
		String value = null;

		File file = new File("D:\\Naresh\\BaseClass\\Excel\\DataBase.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();

		switch (type) {
		case STRING:
			value = cell.getStringCellValue();

			break;
		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
				value = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (numericCellValue == round) {
					value = String.valueOf(round);
				} else {
					value = String.valueOf(numericCellValue);

				}
			}

			break;

		default:
			break;
		}
		return value;

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void DismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void switchToChildWindow() {
		String pWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			if (!pWindow.equals(eachWindow)) {
				driver.switchTo().window(eachWindow);
			}
		}

	}

	public void switchToFrameByIdOrName(String id) {
		driver.switchTo().frame(id);
	}

	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void screenshot(String fName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AMBatch\\screenshots\\" + fName + ".png"));
	}

	public void screenshot(WebElement element, String fName) throws IOException {

		File s = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AMBatch\\screenshots\\" + fName + ".png"));
	}

	public void visibilityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}

	public void browserLaunch() {
		driver = new ChromeDriver();
	}

	public void enterApplnUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void elementSendKeys(WebElement element, String data) {
		visibilityOfElement(element);
		boolean elementIsEnabled = elementIsEnabled(element);
		boolean elementIsDisplayed = elementIsDisplayed(element);

		if (elementIsDisplayed && elementIsEnabled) {
			element.sendKeys(data);
		}
	}

	public void elementSendKeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public void elementClickJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);

	}

	public void elementClick(WebElement element) {
		visibilityOfElement(element);
		boolean elementIsEnabled = elementIsEnabled(element);
		boolean elementIsDisplayed = elementIsDisplayed(element);

		if (elementIsDisplayed && elementIsEnabled) {
			element.click();
		}
	}

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;

	}

	public WebElement findLocatorByCLassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;

	}

	public WebElement findLocatorByXpath(String xpathExp) {
		WebElement element = driver.findElement(By.xpath(xpathExp));
		return element;

	}

	public String elementGetText(WebElement element) {
		String text = null;

		visibilityOfElement(element);
		boolean elementIsEnabled = elementIsEnabled(element);
		boolean elementIsDisplayed = elementIsDisplayed(element);

		if (elementIsDisplayed && elementIsEnabled) {

			text = element.getText();
		}
		return text;
	}

	// 99%--->value
	public String elementGetAttributeValue(WebElement element) {
		visibilityOfElement(element);
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 1%--->?
	public String elementGetAttributeValue(WebElement element, String attributeName) {
		visibilityOfElement(element);
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	public void closeWindow() {
		driver.close();
	}

	public String getApplnUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean elementIsEnabled(WebElement element) {
		boolean displayed = element.isEnabled();
		return displayed;
	}

	public boolean elementIsSelected(WebElement element) {
		boolean displayed = element.isSelected();
		return displayed;
	}

	public void elementClearTextBox(WebElement element) {
		visibilityOfElement(element);
		element.clear();

	}

	public void selectDropDownOptionByText(WebElement element, String text) {
		visibilityOfElement(element);
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectDropDownOptionByValue(WebElement element, String text) {
		visibilityOfElement(element);
		Select select = new Select(element);
		select.selectByValue(text);
	}

	public void selectDropDownOptionByIndex(WebElement element, int index) {
		visibilityOfElement(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
