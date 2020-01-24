package br.com.rsinet.HUB_BDD.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.DriverFactory;
import br.com.rsinet.HUB_BDD.manager.PageObjectManager;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ResultadoDaBuscaPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class BuscarUmProdutoPelaBuscaSteps {

	private ResultadoDaBuscaPage resultadoDaBuscaPage;
	private WebDriver driver;
	private PageObjectManager objectManager;
	private HomePage homePage;

	public BuscarUmProdutoPelaBuscaSteps() {
		driver = DriverFactory.getDriver();
		objectManager = new PageObjectManager(driver);
		homePage = objectManager.getHomePage();
		resultadoDaBuscaPage = objectManager.getResultadoDaBuscaPage();

	}

	@Dado("^o usuario clicou no icone da lupa$")
	public void o_usuario_clicou_no_icone_da_lupa() {
		homePage.clicarLupa();
	}

	@Dado("^digitou no campo de busca \"([^\"]*)\" e preciona Enter$")
	public void digitou_no_campo_de_busca_e_preciona_Enter(String arg1) {
		homePage.Busca(arg1);
	}

	@Entao("^a pagina do resultado aparecera com o resultado da busca \"([^\"]*)\"$")
	public void aPaginaDoResultadoApareceraComOResultadoDaBusca(String arg1) {
		String encontrou = resultadoDaBuscaPage.encontrou();
		assertEquals(arg1.toLowerCase(), encontrou.toLowerCase());
	}

	@Entao("^aparecera uma pagina informando que o produto \"([^\"]*)\" nao foi encontrado$")
	public void apareceraUmaPaginaInformandoQueOProdutoNaoFoiEncontrado(String arg1) {
		String atual = resultadoDaBuscaPage.rerultadoBuscaNegativa();
		String esperado = "No results for \"" + arg1 + "\"";
		assertEquals(esperado.toLowerCase(), atual.toLowerCase());
	}

}
