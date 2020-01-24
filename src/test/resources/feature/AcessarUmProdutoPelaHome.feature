# language: pt
@AcessarUmProdutoPelaHome
Funcionalidade: Abrir a pagina de um produto pela categoria na home
  estando na home page o usuario deve clicar em uma categoria e e selecionar um produdo

  Contexto:
  Dado que estou no site advantage online shopping
  @TestePositivo
  Esquema do Cenario: produto pela home positivo
    E clico na categoria "<Categoria>"
    Entao deve abrir a pagina da gategoria "<Categoria>"
    E clico no produto "<Produto>"
    Entao aparecera a pagina do produto "<Produto>"

    Exemplos: 
      | Categoria | Produto                          |
      | MICE      | Logitech G502 Proteus Core       |
      | LAPTOPS   | HP Chromebook 14 G1(ENERGY STAR) |
      | TABLETS   | HP Elite x2 1011 G1 Tablet       |

  @TesteNegativo
  Esquema do Cenario: produto pela home negativo
    E clico na categoria "<Categoria>"
    Entao deve nao abrir a pagina da gategoria "<CategoriaErrada>"

    Exemplos: 
      | Categoria | CategoriaErrada |
      | MICE      | TABLETS         |
      | LAPTOPS   | HEADPHONES      |
