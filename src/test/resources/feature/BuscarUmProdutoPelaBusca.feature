# language: pt
@BuscarUmProdutoPelaHome
Funcionalidade: Buscar um produto
  
  O usuario buscara um produto pelo campo de busca

  Contexto:
  Dado que estou no site advantage online shopping
  E o usuario clicou no icone da lupa
  @TestePositivo
  Esquema do Cenario: buscar positivo
    E digitou no campo de busca "<Produto>" e preciona Enter
    Entao a pagina do resultado aparecera com o resultado da busca "<Produto>"

    Exemplos: produto pelo campo de busca
      | Produto                       |
      | HP USB 3 BUTTON OPTICAL MOUSE |
      | LOGITECH USB HEADSET H390     |
      | HP STREAM - 11-D020NR LAPTOP  |

  @TesteNegativo
  Esquema do Cenario: buscar negativo
    E digitou no campo de busca "<Produto>" e preciona Enter
    Entao aparecera uma pagina informando que o produto "<Produto>" nao foi encontrado

    Exemplos: Buscar um inesistente
      | Produto |
      | iphone  |
      | Sansung |
      | Xiaomi  |
