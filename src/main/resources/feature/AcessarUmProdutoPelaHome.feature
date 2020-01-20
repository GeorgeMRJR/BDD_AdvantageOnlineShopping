# language: pt
Funcionalidade: Abrir a pagina de um produto pela categoria na home
  estando na home page o usuario deve clicar em uma categoria e e selecionar um produdo

  Contexto: 
    Dado que estou no site advantage online shopping
    
    Cenario: 
    	E clico na categoria "MICE"
    	Entao deve abrir a pagina da gategoria "MICE"
    	E clico no produto "Logitech G502 Proteus Core"
    	Entao aparecera a pagina do produto "Logitech G502 Proteus Core"
    	
    	Cenario: 
    	E clico na categoria "MICE"
    	Entao deve nao abrir a pagina da gategoria "TABLETS"