package br.com.rsinet.HUB_BDD.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature",
		glue = "br.com.rsinet.HUB_BDD.steps",
//		tags = {"@BuscarUmProdutoPelaHome",
//				"@CadastrarNovoCliente",
//				"@AcessarUmProdutoPelaHome"
////				"@TestePositivo",
////				"@TesteNegativo"
//		},
		plugin = {"pretty","html:target/report-html"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false 
		)
public class RunnerAdvantageOnlineShoppingTest {

}
