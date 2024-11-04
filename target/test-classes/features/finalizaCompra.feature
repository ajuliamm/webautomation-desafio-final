#language: pt

@Global
Funcionalidade: Adiciona compra no carrinho e finaliza compra da categoria de monitores

  Contexto:
    Dado que estou na pagina inicial

    @Cenario1
    Cenario: Acesso a categoria de monitor, adiciono 1 item no carrinho e finalizo a compra
      Dado que clico no link de Monitores
      E clico em um monitor da lista
      E adiciono o item no carrinho
      Quando acesso o menu card
      E finalizo o pedido
      Então o pedido deve ser finalizado com sucesso

