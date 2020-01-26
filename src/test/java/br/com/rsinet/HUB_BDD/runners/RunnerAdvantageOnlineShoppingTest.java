package br.com.rsinet.HUB_BDD.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
					glue = "br.com.rsinet.HUB_BDD.steps", 
					tags = {
							"@BuscarUmProdutoPelaHome, "
							+ "@CadastrarNovoCliente, "
							+ "@AcessarUmProdutoPelaHome, "
							+ "@TestePositivo, "
							+ "@TesteNegativo" 
							},
					plugin = { "pretty", 
								//"html:target/report-html",
								"com.cucumber.listener.ExtentCucumberFormatter:target/report/report_BDD_AdvantageOnlineShopping.html"
							}, 
					monochrome = true, 
					snippets = SnippetType.CAMELCASE, 
					dryRun = false, 
					strict = false)
public class RunnerAdvantageOnlineShoppingTest {

	@AfterClass
	public static void  writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/java/br/com/rsinet/HUB_BDD/suporte/extension-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.141.59");
		Reporter.setSystemInfo("cucumber-java", "1.2.5");
		Reporter.setSystemInfo("cucumber-junit", "1.2.5");
		Reporter.setSystemInfo("Maven", "4.0.0");
	    Reporter.setSystemInfo("Java Version", "1.8");
	}
}
