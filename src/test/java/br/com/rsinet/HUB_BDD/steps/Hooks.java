package br.com.rsinet.HUB_BDD.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.manager.DriverFactory;
import br.com.rsinet.HUB_BDD.suporte.Screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {
	private WebDriver driver;

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		driver = DriverFactory.getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
		Screenshot screenshot = new Screenshot();
		screenshot.gerarScreenShot(driver, scenario);
	}

	@After(order = 0)
	public void tearDown() {
		DriverFactory.fecharDriver();
	}
}
