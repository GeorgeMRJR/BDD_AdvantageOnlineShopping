# language: pt
#@ignore
Funcionalidade: Buscar um produto
  
  O usuario buscara um produto pelo campo de busca

  Cenario: buscar um produto pelo campo de busca
    Dado que estou no site advantage online shopping
    E o usuario clicou no icone da lupa
    E digitou no campo de busca "HP SPECTRE X360 - 13-4102DX"
    Entao devera aparecer o resultado
    E o usuario clicou no resultado
    Entao a tela do produto "HP SPECTRE X360 - 13-4102DX" devera abrir
