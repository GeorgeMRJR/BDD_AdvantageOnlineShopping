package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutoPage extends BasePage{

	public ProdutoPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@class='roboto-regular screen768 ng-binding']")
	private WebElement tituloProduto;

	public String nomeDoProduto() {
		return tituloProduto.getText();
	}


}
