package br.com.rsinet.HUB_BDD.suporte;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;


public class Screenshot {

	public static void tirar(WebDriver driver, Scenario cenario) {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("target/screenshot/"+Generator.dataHoraParaArquivo()+cenario.getId()+".jpg"));
		} catch (Exception e) {
			System.out.println("erro ao copiar arquivo para a pasta " + e.getMessage());
		}
	}
	
}
