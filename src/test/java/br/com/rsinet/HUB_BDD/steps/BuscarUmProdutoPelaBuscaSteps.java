package br.com.rsinet.HUB_BDD.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.HUB_BDD.pageObjects.BasePage;
import br.com.rsinet.HUB_BDD.pageObjects.ResultadoDaBuscaPage;
import br.com.rsinet.HUB_BDD.suporte.Web;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class BuscarUmProdutoPelaBuscaSteps {
	private WebDriver driver;
	private BasePage page;
	private ResultadoDaBuscaPage resultadoDaBuscaPage;

	@Before
	public void setUp() {
		driver = Web.inicializarDriver();
		page = PageFactory.initElements(driver, BasePage.class);
		resultadoDaBuscaPage = PageFactory.initElements(driver, ResultadoDaBuscaPage.class);
	}

	@Dado("^o usuario clicou no icone da lupa$")
	public void o_usuario_clicou_no_icone_da_lupa() {
		page.clicarLupa();
	}

	@Dado("^digitou no campo de busca \"([^\"]*)\" e preciona Enter$")
	public void digitou_no_campo_de_busca_e_preciona_Enter(String arg1) {
		page.Busca(arg1);
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
