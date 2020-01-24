package br.com.rsinet.HUB_BDD.steps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.HUB_BDD.manager.DriverFactory;
import br.com.rsinet.HUB_BDD.suporte.Generator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private WebDriver driver;

	@Before
	public void setUp() {
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		driver = DriverFactory.getDriver();

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destinationPath = new File("C:\\Users\\george.junior\\eclipse-XPTO\\BDD_AdvantageOnlineShopping\\report\\" + screenshotName + Generator.dataHoraParaArquivo() + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("erro ao copiar arquivo para a pasta " + e.getMessage());
		}

	}

	@After(order = 0)
	public void tearDown() {
		DriverFactory.fecharDriver();
	}
}
