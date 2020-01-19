package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorProdutoPage extends BasePage {

	public ErrorProdutoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/label[1]/span[1]")
	private WebElement produtoNaoEncontrado;

//	public String rerultadoBuscaNegativa() throws InterruptedException {
//
//		return driver.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/label[1]/span[1]")).getText();
//
//	}

}
