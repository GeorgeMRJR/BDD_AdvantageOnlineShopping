package br.com.rsinet.HUB_BDD.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.HUB_BDD.pageObjects.CadastroPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.suporte.Web;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarNovoClienteSteps {
	private WebDriver driver;
	private HomePage homePage;
	private CadastroPage cadastroPage;

	@Before
	public void setUp() {
		driver = Web.inicializarDriver();
		homePage = PageFactory.initElements(driver, HomePage.class);
		cadastroPage = PageFactory.initElements(driver, CadastroPage.class);
	}

	@Dado("^que estou no site advantage online shopping$")
	public void queEstouNoSiteAdvantageOnlineShopping() {
		assertEquals("https://www.advantageonlineshopping.com/", homePage.urlAtual());
	}

	@Dado("^nao estou logado$")
	public void naoEstouLogado() {
		boolean logado = homePage.logado();
		assertFalse(logado);
	}

	@Quando("^clico no icone de usuario$")
	public void clicoNoIconeDeUsuario() {
		homePage.clicarUsuario();
	}

	@Quando("^clico no link de criar nova conta$")
	public void clicoNoLinkDeCriarNovaConta() {
		homePage.clicarNovaConta();
	}

	@Quando("^Digito o nome de usuario \"([^\"]*)\"$")
	public void digitoONomeDeUsuario(String arg1) {
		cadastroPage.digitarUserName(arg1);
	}

	@Quando("^Digito a senha \"([^\"]*)\"$")
	public void digitoASenha(String arg1) {
		cadastroPage.digitarPassword(arg1);
	}

	@Quando("^Digito a comfirmacao da senha \"([^\"]*)\"$")
	public void digitoAComfirmacaoDaSenha(String arg1) {
		cadastroPage.digitarNovamenteSenha(arg1);
	}

	@Quando("^Digito o email \"([^\"]*)\"$")
	public void digitoOEmail(String arg1) {
		cadastroPage.digitarEmail(arg1);
	}

	@Quando("^Digito o primeiro nome \"([^\"]*)\"$")
	public void digitoOPrimeiroNome(String arg1) {
		cadastroPage.digitarPrimeiroNome(arg1);
	}

	@Quando("^Digito o sobre nome \"([^\"]*)\"$")
	public void digitoOSobreNome(String arg1) {
		cadastroPage.DigitarSobreNome(arg1);
	}

	@Quando("^Digito o telefone \"([^\"]*)\"$")
	public void digitoOTelefone(String arg1) {
		cadastroPage.DigitarTelefone(arg1);
	}

	@Quando("^Seleciono o continente \"([^\"]*)\"$")
	public void selecionoOContinente(String arg1) {
		cadastroPage.EscolherContinente(arg1);
	}

	@Quando("^Digito a cidade \"([^\"]*)\"$")
	public void digitoACidade(String arg1) {
		cadastroPage.escreverCidade(arg1);
	}

	@Quando("^Digito o endereco \"([^\"]*)\"$")
	public void digitoOEndereco(String arg1) {
		cadastroPage.digitarEndereco(arg1);
	}

	@Quando("^Digito o estado \"([^\"]*)\"$")
	public void digitoOEstado(String arg1) {
		cadastroPage.DigitarEstado(arg1);
	}

	@Quando("^Digito o codigo postal \"([^\"]*)\"$")
	public void digitoOCodigoPostal(String arg1) {
		cadastroPage.DigitarCodigoPostal(arg1);
	}

	@Quando("^clico em aceito os termos de uso$")
	public void clicoEmAceitoOsTermosDeUso() {
		cadastroPage.ClicarCbxAceitoTermos();
	}

	@Entao("^o botao de registrar deve estar abilitado$")
	public void oBotaoDeRegistrarDeveEstarAbilitado() {
		boolean registrarAbilitado = cadastroPage.RegistrarAbilitado();
		assertTrue(registrarAbilitado);
	}

	@Quando("^clico no botao de registro$")
	public void clicoNoBotaoDeRegistro() {
		cadastroPage.ClicarEmRegistrar();
	}

	@Dado("^o cadastro nao sera realisado$")
	public void oCadastroNaoSeraRealisado() {
		assertTrue(homePage.urlAtual().contains("register"));
	}

	@Entao("^o usuario estara cadastrado$")
	public void oUsuarioEstaraCadastrado() {
		boolean logado = homePage.logado();
		assertTrue(logado);
	}

	@After
	public void tearDown() {
		Web.fecharDriver();
	}

}
