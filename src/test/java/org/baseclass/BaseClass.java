
package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1.Launch Chrome

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	// 2.Load url

	public static void loadurl(String url) {
		driver.get(url);
	}

	// 3.Windows maximize

	public static void winmax() {
		driver.manage().window().maximize();

	}

	// 4.Get keys

	public static void fill(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	// 5.Click()

	public static void btnclick(WebElement ele) {
		ele.click();

	}

	// 6.Get title

	public static void printTilte() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 7.DoubleClick

	public static void dclick(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	// 8.RightClick
	public static void rclick(WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();

	}

	// 9.Drag and Drop
	public static void drgnddrp(WebElement drg, WebElement drp) {
		Actions a = new Actions(driver);
		a.dragAndDrop(drg, drp);
	}

	// 10.KeysUp
	public static void kyup(CharSequence key) {
		Actions a = new Actions(driver);
		a.keyUp(key);

	}

	// 11.KeyDown
	public static void kydwn(CharSequence key1) {
		Actions a = new Actions(driver);
		a.keyDown(key1);

	}

	// 12.Entry Button
	public static void ebtn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// 13.Tab Button
	public static void tabbtn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	// 14.Paste
	public static void pst() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// 15.Accept the alert
	public static void alrt() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// 16. ToQuit
	public static void toQuit() {
		driver.quit();

	}

	// 17.ToGeTAttribute
	public static String togetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}

	// 16.Screenshot
	public static void tkscrnshot(String scrnsht) throws InterruptedException, IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\mylearning\\workspace\\SeleniumDay2\\Screenshot.png");
		Thread.sleep(2000);
		FileUtils.copyFile(src, des);
	}

}


