package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPage extends BasePage {

	public ProdutoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h1[@class='roboto-regular screen768 ng-binding']") // 1
	private WebElement tituloProduto;

	
	
	public String nomeDoProduto() {
		return tituloProduto.getText();
	}
	

	
//	public String produtoAtualTxt() {//1
//		String text;
//		try {
//			text = driver.findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']")).getText();
//		} catch (Exception e) {
//			text = driver.findElement(By.xpath("//span[@class='ng-binding']")).getText();
//			e.getMessage();
//			return text;
//		}
//		return text;
//	}

//	public String encontrou() {//2
//		WebElement element = driver.findElement(By.xpath("//a[@class='productName ng-binding']"));
//		return element.getText();
//	}
//
//	public ErrorProdutoPage naoEncontrou() {//3
//
//		return new ErrorProdutoPage(driver);
//	}

}
