package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CategoriaProdutoPage extends BasePage {
	WebDriver driver;

	public CategoriaProdutoPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void ClicarEm(String produto) {
		WebElement element = driver.findElement(By.linkText(produto));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

//	public String ClicarEmProdutoValido(String produto) {// 2
//		try {
//			WebElement element = driver.findElement(By.linkText(produto));
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click();", element);
//		} catch (Exception e) {
//			System.out.println("Nao Foi Encontrado o produto na pagina >>>" + e.getMessage());
//			return new BasePage(driver).urlAtual();
//		}
//		System.out.println("Encontrado o produto na pagina ");
//		return new BasePage(driver).urlAtual();
//	}

}
