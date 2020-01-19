package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage extends BasePage {

	public CadastroPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "usernameRegisterPage") // 1
	private WebElement campoUserName;

	@FindBy(name = "passwordRegisterPage") // 2
	private WebElement campoSenha;

	@FindBy(name = "confirm_passwordRegisterPage") // 3
	private WebElement campoReSenha;

	@FindBy(name = "emailRegisterPage") // 4
	private WebElement campoEmail;

	@FindBy(name = "first_nameRegisterPage") // 5
	private WebElement campoPrimeiroNome;

	@FindBy(name = "last_nameRegisterPage") // 6
	private WebElement campoSobrenome;

	@FindBy(name = "phone_numberRegisterPage") // 7
	private WebElement campoTelefone;

	@FindBy(name = "countryListboxRegisterPage") // 8
	private WebElement selectContinente;

	@FindBy(name = "cityRegisterPage") // 9
	private WebElement campoCidade;

	@FindBy(name = "addressRegisterPage") // 10
	private WebElement campoEndereco;

	@FindBy(name = "postal_codeRegisterPage") // 11
	private WebElement campoCodPostal;

	@FindBy(name = "state_/_province_/_regionRegisterPage") // 12
	private WebElement campoEstado;

	@FindBy(name = "i_agree") // 13
	private WebElement checkBox;

	@FindBy(xpath = "//*[@id=\"registerPage\"]/article[1]/sec-form[1]/div[2]/label[1]") // 14
	private WebElement mensagemDeErro;

	@FindBy(id = "register_btnundefined") // 15
	private WebElement btnRegistrar;

	public void digitarUserName(String UserName) {
		campoUserName.sendKeys(UserName);
	}

	public void digitarPassword(String password) {
		campoSenha.sendKeys(password);
	}

	public void digitarNovamenteSenha(String ReSenha) {
		campoReSenha.sendKeys(ReSenha);
	}

	public void digitarEmail(String Email) {
		campoEmail.sendKeys(Email);
	}

	public void digitarPrimeiroNome(String Nome) {
		campoPrimeiroNome.sendKeys(Nome);
	}

	public void DigitarSobreNome(String Sobrenome) {
		campoSobrenome.sendKeys(Sobrenome);
	}

	public void DigitarTelefone(String Telefone) {
		campoTelefone.sendKeys(Telefone);
	}

	public void EscolherContinente(String Continente) {
		new Select(selectContinente).selectByVisibleText(Continente);
	}

	public void escreverCidade(String Cidade) {
		campoCidade.sendKeys(Cidade);
	}

	public void digitarEndereco(String Endereco) {
		campoEndereco.sendKeys(Endereco);
	}

	public void DigitarCodigoPostal(String zip) {
		campoCodPostal.sendKeys(zip);
	}

	public void DigitarEstado(String Estado) {
		campoEstado.sendKeys(Estado);
	}

	public void ClicarCbxAceitoTermos() {
		checkBox.sendKeys(Keys.SPACE);
	}

	public String textoDoErro() throws InterruptedException {
		Thread.sleep(1000);
		return mensagemDeErro.getText();
	}

	public boolean RegistrarAbilitado() {
		return btnRegistrar.isEnabled();
	}

	public void ClicarEmRegistrar() {
		try {
			btnRegistrar.sendKeys(Keys.ENTER);
		} catch (Exception e) {
		}
	}

}
