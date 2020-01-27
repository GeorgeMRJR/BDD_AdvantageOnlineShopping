# BDD_AdvantageOnlineShopping
Teste BDD da loja online "Advantage Online Shopping"


++++++Mapa-do-projeto+++++

	✓Java
		✓ Manager
			✓DriverFactory.java - Classe responsável em criar, entregar e encerrar um WebDriver
			✓PageObjectManager.java - Casse responsável por gerenciar e entregar uma instancia dos pageObjects 
			
		✓ Page Objects
			✓BasePage.java – Super Classe (Representa funcionalidades que todas as paginas tem em comum) com métodos de uso comuns das subclasses
			✓CadastroPage.java - Abstração da pagina de cadastro com suas respectivas funcionalidades
			✓CategoriaProdutoPage.java - Abstração de uma pagina de categoria de produtos genérica
			✓HomePage.java - Abstração da home page com suas respectivas funcionalidades
			✓ProdutoPage.java  - Abstração da pagina de um produto genérico com suas respectivas funcionalidades
			✓ResultadoDaBuscaPage.java - Abstração da pagina de busca realizada
			
		✓Runners
			✓RunnerAdvantageOnlineShoppingTest.java - Ponto de inicio do cucumber com as configurações pré-teste e o AfterClass do Extent Report
			
		✓Steps
			✓AcessarUmProdutoPelaHomeSteps.java - Classe responsável em realizar o teste de sua respectiva feature
			✓BuscarUmProdutoPelaBuscaSteps.java - Classe responsável em realizar o teste de sua respectiva feature
			✓CadastrarNovoClienteSteps.java - Classe responsável em realizar o teste de sua respectiva feature
			✓Hook.java - Classe com os Afters responsáveis e fechar o driver e realizar o report
			
		✓Suporte
			✓ExcelConsumer.java - classe responsável por consumir os dados da massa
			✓ExelUtils.java - classe responsável por gerir um arquivo do excel com seus gets e sets
			✓Generator.java - classe responsável por gerar uma string com a data e hora atual usada no Screenshot
			✓Screenshot.java - classe responsável por tirar uma Screenshot do resultado do teste
			✓extension-config.xml - xml do Extent Report responsável por definir algumas configurações do report
		
	✓Resources
		✓DataBase
			✓BDD_AdvantageOnlineShoppingData.xlsx - Massa de dados
			
		✓Feature
			✓AcessarUmProdutoPelaHome.feature
			✓BuscarUmProdutoPelaBusca.feature
			✓CadastrarNovoCliente.feature
		
	✓Target			
		✓report
			✓screenshot
				✓nomeTesteData_Hora.png - screenshot do teste realizado
				
			✓report_BDD_AdvantageOnlineShopping.html - report
