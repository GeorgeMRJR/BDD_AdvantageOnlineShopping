# language: pt
#@ignore
Funcionalidade: Cadastro de novo usuario
  
  Usuario deve fazer um cadastro

  Contexto: 
    Dado que estou no site advantage online shopping
    E nao estou logado
    Quando clico no icone de usuario
    E clico no link de criar nova conta

  Cenario: Deve preencher todos os campos e efetuar cadastro com sucesso
    E Digito o nome de usuario "George0012"
    E Digito a senha "Abc123"
    E Digito a comfirmacao da senha "Abc123"
    E Digito o email "george@test.com"
    E Digito o primeiro nome "George"
    E Digito o sobre nome "Luiz"
    E Digito o telefone "989999877"
    E Seleciono o continente "Brazil"
    E Digito a cidade "Sorocaba"
    E Digito o endereco "AV. gal"
    E Digito o estado "SP"
    E Digito o codigo postal "18060065"
    E clico em aceito os termos de uso
    Entao o botao de registrar deve estar abilitado
    E clico no botao de registro
    Entao o usuario estara cadastrado

  Cenario: Não deve efetuar cadastro de usuario existente
    E Digito o nome de usuario "George1234"
    E Digito a senha "Abc123"
    E Digito a comfirmacao da senha "Abc123"
    E Digito o email "george@test.com"
    E clico em aceito os termos de uso
    E clico no botao de registro
    Entao o usuario recebera uma mensagem usuario ja esta cadasttado
