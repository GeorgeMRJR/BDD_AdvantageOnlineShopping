# language: pt
@CadastrarNovoCliente
Funcionalidade: Cadastro de novo usuario
  
  Usuario deve fazer um cadastro

  Contexto:
  Dado que estou no site advantage online shopping
  E nao estou logado
  Quando clico no icone de usuario
  E clico no link de criar nova conta
  @TestePositivo
  Esquema do Cenario: cadastro positivo
    E Digito o nome de usuario "<NomeDeUsuario>"
    E Digito a senha "<Senha>"
    E Digito a comfirmacao da senha "<ComfirmaSenha>"
    E Digito o email "<Email>"
    E Digito o primeiro nome "<Nome>"
    E Digito o sobre nome "<SobreNome>"
    E Digito o telefone "<Telefone>"
    E Seleciono o continente "<Continente>"
    E Digito a cidade "<Cidade>"
    E Digito o endereco "<Endereco>"
    E Digito o estado "<Estado>"
    E Digito o codigo postal "<Cep>"
    E clico em aceito os termos de uso
    Entao o botao de registrar deve estar abilitado
    E clico no botao de registro
    Entao o usuario estara cadastrado

    Exemplos: Deve preencher todos os campos e efetuar cadastro com sucesso
      | NomeDeUsuario | Senha   | ComfirmaSenha | Email           | Nome   | SobreNome | Telefone  | Continente | Cidade   | Estado | Endereco | Cep      |
      | George48      | Abc123  | Abc123        | george@test.com | George | Luiz      | 989999899 | Brazil     | Sorocaba | SP     | Av.Gal   | 18060501 |
      | Joao48        | Abc1236 | Abc1236       | joao@test.com   | joao   | da silva  | 898777877 | Japan      | Tokyo    | Tokyo  | Av.Meiji | 18060501 |

  @TesteNegativo
   Cenario: cadastro negativo
    Quando Digito os dados invalidos para cadastro
    E clico em aceito os termos de uso
    E clico no botao de registro
    Entao o cadastro nao sera realisado


