package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage extends BasePage {
	private WebDriver driver;
	private JavascriptExecutor js;

	public CadastroPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;
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


	public boolean RegistrarAbilitado() {
		return btnRegistrar.isEnabled();
	}

	public void ClicarEmRegistrar() {
		try {
			btnRegistrar.sendKeys(Keys.ENTER);
		} catch (Exception e) {
		}
	}
	public void rolar(int qtd) {
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0," + qtd + ")");
	}
	

	public void PreencherOsDados(
			String nomeUsuario,
			String senha,
			String reSenha,
			String email,
			String primeiroNome,
			String segundoNome,
			String telefone,
			String continente,
			String cidade,
			String estado,
			String endereco,
			String codPostal
			) {

		digitarUserName(nomeUsuario);
		digitarPassword(senha);
		digitarNovamenteSenha(reSenha);
		digitarEmail(email);
		digitarPrimeiroNome(primeiroNome);
		DigitarSobreNome(segundoNome);
		DigitarTelefone(telefone);
		EscolherContinente(continente);
		escreverCidade(cidade);
		DigitarEstado(estado);
		digitarEndereco(endereco);
		DigitarCodigoPostal(codPostal);
	}

}
