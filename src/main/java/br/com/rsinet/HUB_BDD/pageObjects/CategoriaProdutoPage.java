package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriaProdutoPage extends BasePage {

	public CategoriaProdutoPage(WebDriver driver) {
		super(driver);
	}

	public ProdutoPage ClicarEm(String produto) {// 1
		WebElement element = driver.findElement(By.linkText(produto));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		return new ProdutoPage(driver);
	}

	public String ClicarEmProdutoValido(String produto) {// 2
		try {
			WebElement element = driver.findElement(By.linkText(produto));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("Nao Foi Encontrado o produto na pagina >>>" + e.getMessage());
			return new BasePage(driver).urlAtual();
		}
		System.out.println("Encontrado o produto na pagina ");
		return new BasePage(driver).urlAtual();
	}

}