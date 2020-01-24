package br.com.rsinet.HUB_BDD.steps;

import br.com.rsinet.HUB_BDD.manager.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@After
	public void setUp() {

	}

	@Before
	public void tearDown() {
		DriverFactory.fecharDriver();
	}
}
