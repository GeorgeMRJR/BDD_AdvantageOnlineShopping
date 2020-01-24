package br.com.rsinet.HUB_BDD.manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return (driver == null) ? criarDriver() : driver;
	}

	private static WebDriver criarDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
	}

	public static void fecharDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
