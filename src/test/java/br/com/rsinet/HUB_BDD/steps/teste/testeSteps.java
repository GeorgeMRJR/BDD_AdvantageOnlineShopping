package br.com.rsinet.HUB_BDD.steps.teste;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.suporte.Web;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class testeSteps {

	WebDriver driver;

	@Dado("^que estou na pagina certa$")
	public void queEstouNapaginaCerta() throws Throwable {
		driver = Web.inicializarDriver();
	}

	@Dado("^clique para fazer cadastro$")
	public void cliqueParaFazerCadastro() {
HomePage homePage = new HomePage(driver);
		homePage.clicarUsuario();
	}

	@Dado("^prenecha ps dados corretos$")
	public void prenechaPsDadosCorretos() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^estou cadastrado$")
	public void estouCadastrado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
