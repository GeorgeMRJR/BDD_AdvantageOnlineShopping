package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuUser")
	private WebElement iconeUsuario;

	@FindBy(name = "username")
	private WebElement nomeDeUsuario;

	@FindBy(name = "password")
	private WebElement userPassword;

	@FindBy(id = "sign_in_btnundefined")
	private WebElement btnSingIn;

	@FindBy(linkText = "CREATE NEW ACCOUNT")
	private WebElement linkCriarNovaConta;

	@FindBy(id = "speakersTxt")
	private WebElement categoriaSpeakers;

	@FindBy(id = "tabletsTxt")
	private WebElement categoriaTablets;

	@FindBy(id = "laptopsTxt")
	private WebElement categoriaLaptops;

	@FindBy(id = "miceTxt")
	private WebElement categoriaMice;

	@FindBy(id = "headphonesTxt")
	private WebElement categoriaHeadphones;

	public void clicarUsuario() {
		iconeUsuario.click();
	}

	public void clicarNovaConta() {
		linkCriarNovaConta.sendKeys(Keys.ENTER);
	}

	public void clicarCategoria(String Categoria) {
		switch (Categoria) {
		case "LAPTOPS":
			categoriaLaptops.click();
			break;
		case "MICE":
			categoriaMice.click();
			break;
		case "HEADPHONES":
			categoriaHeadphones.click();
			break;
		case "SPEAKERS":
			categoriaSpeakers.click();
			break;
		case "TABLETS":
			categoriaTablets.click();
			System.out.println("categoria tablet");
		default:
			System.out.println("categoria nao encontrada");
			break;
		}
	}

}
