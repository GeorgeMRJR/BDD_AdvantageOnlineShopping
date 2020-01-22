package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultadoDaBuscaPage {

	public ResultadoDaBuscaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='productName ng-binding']")
	private WebElement produtoLink;

	@FindBy(xpath = "//*[@id=\"searchPage\"]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/p[1]/a[1]")
	private WebElement resultadoClicavel;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/label[1]/span[1]")
	private WebElement produtoNaoEncontrado;

	public String rerultadoBuscaNegativa() {
		return produtoNaoEncontrado.getText();
	}

	public String encontrou() {
		return produtoLink.getText();
	}

	public void clickNoProduto() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		resultadoClicavel.sendKeys(Keys.ENTER);
	}

}
