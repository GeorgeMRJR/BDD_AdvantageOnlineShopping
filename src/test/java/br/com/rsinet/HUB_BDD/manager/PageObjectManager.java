package br.com.rsinet.HUB_BDD.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageObjects.CadastroPage;
import br.com.rsinet.HUB_BDD.pageObjects.CategoriaProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.ResultadoDaBuscaPage;

public class PageObjectManager {

	private WebDriver driver;
	private CadastroPage cadastroPage;
	private CategoriaProdutoPage categoriaProdutoPage;
	private HomePage homePage;
	private ProdutoPage produtoPage;
	private ResultadoDaBuscaPage resultadoDaBuscaPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroPage getCadastroPage() {
		return (cadastroPage == null) ? cadastroPage = new CadastroPage(driver) : cadastroPage;
	}

	public CategoriaProdutoPage getCategoriaProdutoPage() {
		return (categoriaProdutoPage == null) ? categoriaProdutoPage = new CategoriaProdutoPage(driver)
				: categoriaProdutoPage;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public ProdutoPage getProdutoPage() {
		return (produtoPage == null) ? produtoPage = new ProdutoPage(driver) : produtoPage;
	}

	public ResultadoDaBuscaPage getResultadoDaBuscaPage() {
		return (resultadoDaBuscaPage == null) ? resultadoDaBuscaPage = new ResultadoDaBuscaPage(driver)
				: resultadoDaBuscaPage;
	}
}
