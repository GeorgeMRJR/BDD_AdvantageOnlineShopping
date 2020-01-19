package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "menuUser")
	private WebElement iconeUsuario;

	@FindBy(name = "username") // 2
	private WebElement nomeDeUsuario;

	@FindBy(name = "password") // 3
	private WebElement userPassword;

	@FindBy(id = "sign_in_btnundefined") // 4
	private WebElement btnSingIn;

	@FindBy(linkText = "CREATE NEW ACCOUNT") // 5
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

//	public HomePage clicarSingIN() {//4
//		driver.findElement(By.id("sign_in_btnundefined")).click();
//		return this;
//	}

//	public HomePage fazerLogIn(String UserName, String password) {//6
//		digitarUserName(UserName);
//		digitarPassword(password);
//		clicarSingIN();
//		return this;
//	}
//
//	public HomePage popupVisivel() {//7
//		driver.findElement(By.id("//div[@class='PopUp']")).isDisplayed();
//		return this;
//
//	}

//	public CategoriaProdutoPage clicarCategoria(String Categoria) {//8
//		
//		WebElement element = driver.findElement(By.xpath("//span[.='"+Categoria+"']"));
//
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
//		
//		return new CategoriaProdutoPage(driver);
//		
//		
//	}

}
