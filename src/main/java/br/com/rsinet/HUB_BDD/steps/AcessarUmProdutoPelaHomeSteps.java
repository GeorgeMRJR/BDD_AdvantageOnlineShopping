package br.com.rsinet.HUB_BDD.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.HUB_BDD.pageObjects.CategoriaProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import br.com.rsinet.HUB_BDD.suporte.Web;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class AcessarUmProdutoPelaHomeSteps {
	private WebDriver driver;
	private HomePage homePage;
	private CategoriaProdutoPage categoriaProdutoPage;
	private ProdutoPage produtoPage;

	@Before
	public void setUp() {
		driver = Web.inicializarDriver();
		homePage = PageFactory.initElements(driver, HomePage.class);
		categoriaProdutoPage = PageFactory.initElements(driver, CategoriaProdutoPage.class);
		produtoPage = PageFactory.initElements(driver, ProdutoPage.class);
	}

	@Dado("^clico na categoria \"([^\"]*)\"$")
	public void clicoNaCategoria(String arg1) {
		homePage.clicarCategoria(arg1);
	}

	@Entao("^deve abrir a pagina da gategoria \"([^\"]*)\"$")
	public void deveAbrirAPaginaDaGategoria(String arg1) {
		String url = homePage.urlAtual().toLowerCase();
		assertTrue(url.contains(arg1.toLowerCase()));

	}

	@Entao("^clico no produto \"([^\"]*)\"$")
	public void clicoNoProduto(String arg1) {
		categoriaProdutoPage.ClicarEm(arg1);

	}

	@Entao("^aparecera a pagina do produto \"([^\"]*)\"$")
	public void apareceraAPaginaDoProduto(String arg1) {
		assertEquals(arg1.toLowerCase(), produtoPage.nomeDoProduto().toLowerCase());
	}

	@Entao("^deve nao abrir a pagina da gategoria \"([^\"]*)\"$")
	public void deveNaoAbrirAPaginaDaGategoria(String arg1) {
		String url = homePage.urlAtual().toLowerCase();
		assertFalse(url.contains(arg1.toLowerCase()));
	}
}
