package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[@class='hi-user containMiniTitle ng-binding']")
	private WebElement logado; // elemento que aparece apenas quando logado

	@FindBy(id = "menuSearch") // 2
	private WebElement lupa;

	@FindBy(id = "autoComplete") // 3
	private WebElement campoBusca;

	public String urlAtual() {
		return driver.getCurrentUrl();
	}

	public boolean logado() {
		boolean displayed = false;
		try {
			displayed = logado.isDisplayed();
		} catch (Exception e) {
			return displayed;
		}
		return displayed;
	}

//	public BasePage clicarLupa() { //2
//		driver.findElement(By.id("menuSearch")).click();
//		return this;
//	}

//	public ProdutoPage buscar(String produto) { //3
//		driver.findElement(By.id("autoComplete")).sendKeys("" + produto + "" + Keys.ENTER);
//		return new ProdutoPage(driver);
//	}

}
