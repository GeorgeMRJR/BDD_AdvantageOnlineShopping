package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BasePage {

	private WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[@class='hi-user containMiniTitle ng-binding']")
	private WebElement logado; // elemento que aparece apenas quando logado

	@FindBy(id = "menuSearch")
	private WebElement lupa;

	@FindBy(id = "autoComplete")
	private WebElement campoBusca;

	@FindBy(xpath = "//p[@class='roboto-regular ng-binding']")
	private WebElement resultadoBusca;

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

	public void clicarLupa() {
		lupa.click();
	}

	public void Busca(String produto) {
		campoBusca.sendKeys("" + produto + "" + Keys.ENTER);
	}

	public void inicio() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.HOME).perform();
	}

}
