# language: pt
#@ignore
Funcionalidade: Buscar um produto
  
  O usuario buscara um produto pelo campo de busca

  Contexto: 
    Dado que estou no site advantage online shopping
    E o usuario clicou no icone da lupa

  Cenario: buscar um produto pelo campo de busca
    E digitou no campo de busca "HP USB 3 BUTTON OPTICAL MOUSE" e preciona Enter
    Entao a pagina do resultado aparecera com o resultado da busca "HP USB 3 BUTTON OPTICAL MOUSE"

  Cenario: buscar um inesistente
    E digitou no campo de busca "iphone" e preciona Enter
    Entao aparecera uma pagina informando que o produto "iphone" nao foi encontrado
