  package org.step;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CheckClass {
	public static WebDriver driver;
	public static Actions a;
	public static Alert b;
	public static JavascriptExecutor jse;
	public static Select s;

	public static void browserLaunched() {
		driver = new ChromeDriver();
	}

	public static void getUrl(String anyurl) {
		driver.get(anyurl);

	}

	public static void max() {
		driver.manage().window().maximize();

	}

	public static void prtTtl() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static String prtCurrenUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static void fillTextBox(WebElement webref, String anyvalue) {
		webref.sendKeys(anyvalue);
	}

	public static void btnClick(WebElement webref) {
		webref.click();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	//date
	public static void dateTime() {
		Date d=new Date();
		System.out.println(d);
	}

	// actions
	public static void mousehover(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static void dragDrop(WebElement source, WebElement target) {
		a.dragAndDrop(source, target).perform();
	}

	public static void dualClick() {
		a.doubleClick().perform();
	}

	public static void conClick(WebElement target) {
		a.contextClick(target).perform();
	}

	// alerts
	public static void switchToAlt() {
		b = driver.switchTo().alert();
	}

	public static void acceptAlt() {
		b.accept();
	}

	public static void dismissAlt() {
		b.dismiss();
	}

	public static void passTheText(String passtxt) {
		b.sendKeys(passtxt);
	}

	// frames
	public static void SwitchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public static  void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static  void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	// takescreenshot
	public static void takess(String nameofss) throws IOException {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Bharathi\\eclipse-workspace\\Mavenfirstday\\sc1\\" + nameofss + ".png");
		FileUtils.copyFile(source, destination);
	}

	// javascriptexecutor
	public static void javaScriptSetAttribute(String entertext, WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value'," + "'" + entertext + "'" + ")", element);
	}

	public static void javaScriptSetClick(WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);
	}

	public static String javaScriptGetAttribute(WebElement element) {
		jse = (JavascriptExecutor) driver;
		Object text = jse.executeScript("return arguments[0].getAttribute('value')", element);
		String s = (String) text;
		return s;
	}

	public static  void javaScriptScrollIntoView(WebElement element, boolean enterTrueOrFalse) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0],scrollIntoView(" + enterTrueOrFalse + ")", element);
	}

	// select
	public static  void selectByValue(String value) {
		s.selectByVisibleText(value);
	}

	public static  void selectByIndex(int index) {
		s.selectByIndex(index);
	}

	public static  void selectByVisibleText(String text) {
		s.selectByVisibleText(text);
	}

	public static boolean selectIsMultiple() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		return multiple;
	}

	public static String selectGetOptionsTxt(WebElement element, int i) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
		return text;
	}

	public static String selectGetAllSelectedOption(WebElement element, int i) {
		s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		WebElement webElement = allSelectedOptions.get(i);
		String attribute = webElement.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}
	public static String selectGetOptionsAttribute(WebElement element, int i) {
		s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		WebElement webElement = allSelectedOptions.get(i);
		String attribute = webElement.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}
	

	public  static String selectFirstSelectedOption(WebElement element) {
		s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String attribute = firstSelectedOption.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}

	public static void selectDeSelectByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}

	public static void selectDeSelectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static  void selectDeselectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void selectDeslectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	// window handling
	public static void switchToWindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(i));
	}

	// waits
	public static void threadsleep(long entermillis) throws InterruptedException {
		Thread.sleep(entermillis);
	}

	// data driven
	public static String readParticularcell(String bookName, String sheetName, int r, int c) throws IOException  {
		File f = new File("C:\\Users\\Bharathi\\eclipse-workspace\\Mavenfirstday\\workbook\\" + bookName + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		int celltype = cell.getCellType();
		String value=null;
		if (celltype == 1) {
			 value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dat = cell.getDateCellValue();
			SimpleDateFormat sa = new SimpleDateFormat("dd/MM/yyyy");
				value = sa.format(dat);
		} else {
			double dle = cell.getNumericCellValue();
			long l = (long) dle;
			 	value = String.valueOf(l);

		}
		return value;
		
	}
	public static void readAllCell(String bookName,String sheetName) throws IOException {
		File f = new File("C:\\Users\\Bharathi\\eclipse-workspace\\Mavenfirstday\\workbook\\" + bookName + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet(sheetName);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	    Row row = sheet.getRow(i);
	    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	    	Cell cell = row.getCell(j);
	    	int celltype = cell.getCellType();
			if (celltype == 1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (DateUtil.isCellDateFormatted(cell)) {
				Date dat = cell.getDateCellValue();
				SimpleDateFormat sa = new SimpleDateFormat("dd/MM/yyyy");
				String	value = sa.format(dat);
				System.out.println(value);
			} else {
				double dle = cell.getNumericCellValue();
				long l = (long) dle;
				String 	value = String.valueOf(l);
				System.out.println(value);	
		}
		}
		
		}
	
	}
	public static void readParticularRow(String bookName,String sheetName,int i) throws IOException  {
		File f = new File("C:\\Users\\Bharathi\\eclipse-workspace\\Mavenfirstday\\workbook\\" + bookName + ".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet(sheetName);
		
	    Row row = sheet.getRow(i);
	    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	    	Cell cell = row.getCell(j);
	    	int celltype = cell.getCellType();
			if (celltype == 1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (DateUtil.isCellDateFormatted(cell)) {
				Date dat = cell.getDateCellValue();
				SimpleDateFormat sa = new SimpleDateFormat("dd/MM/YYYY");
				String	value = sa.format(dat);
				System.out.println(value);
			} else {
				double dle = cell.getNumericCellValue();
				long l = (long) dle;
				String 	value = String.valueOf(l);
				System.out.println(value);	
		}
		}
		
		}
	
	
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


