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

	@FindBy(name = "usernameRegisterPage")
	private WebElement campoUserName;

	@FindBy(name = "passwordRegisterPage")
	private WebElement campoSenha;

	@FindBy(name = "confirm_passwordRegisterPage")
	private WebElement campoReSenha;

	@FindBy(name = "emailRegisterPage")
	private WebElement campoEmail;

	@FindBy(name = "first_nameRegisterPage")
	private WebElement campoPrimeiroNome;

	@FindBy(name = "last_nameRegisterPage")
	private WebElement campoSobrenome;

	@FindBy(name = "phone_numberRegisterPage")
	private WebElement campoTelefone;

	@FindBy(name = "countryListboxRegisterPage")
	private WebElement selectContinente;

	@FindBy(name = "cityRegisterPage")
	private WebElement campoCidade;

	@FindBy(name = "addressRegisterPage")
	private WebElement campoEndereco;

	@FindBy(name = "postal_codeRegisterPage")
	private WebElement campoCodPostal;

	@FindBy(name = "state_/_province_/_regionRegisterPage")
	private WebElement campoEstado;

	@FindBy(name = "i_agree")
	private WebElement checkBox;

	@FindBy(xpath = "//*[@id=\"registerPage\"]/article[1]/sec-form[1]/div[2]/label[1]")
	private WebElement mensagemDeErro;

	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div[1]/label[1]")
	private WebElement lblErroSenha;

	@FindBy(id = "register_btnundefined")
	private WebElement btnRegistrar;

	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div[1]/label[1]")
	private WebElement lblErroEmail;

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
		String erroBotao = mensagemDeErro.getText();
		String erroEmail = lblErroEmail.getText();
		String erroSenha = lblErroSenha.getText();
		if (erroBotao.length() > 5)
			return erroBotao;
		if (erroBotao.length() > 5)
			return erroEmail;
		return erroSenha;
	}

	public String textoDoErroEmail() throws InterruptedException {
		Thread.sleep(1000);
		return lblErroEmail.getText();
	}

	public String textoDoErroSenha() throws InterruptedException {
		Thread.sleep(1000);
		return lblErroSenha.getText();
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
