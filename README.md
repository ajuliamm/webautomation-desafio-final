# Projeto de Automação Web 
Este projeto de automação web foi desenvolvido para testar o fluxo de compra de um monitor no e-commerce de eletrônicos Demoblaze. Utilizando o Selenium para a automação de interações com o navegador, Cucumber para escrita de cenários de teste em Gherkin, Maven como gerenciador de dependências, Extent Report para geração de relatórios, e os padrões Page Object e Page Factory para organização do código.

## Tecnologias e Ferramentas Utilizadas
- Java: Linguagem principal utilizada no desenvolvimento dos testes automatizados.
- Selenium: Biblioteca para automação de interações com o navegador.
- Cucumber: Ferramenta que permite a escrita de testes em linguagem natural (Gherkin), facilitando a compreensão dos cenários de teste.
- Maven: Gerenciador de dependências e automatizador de builds.
- Extent Report: Ferramenta para geração de relatórios customizados e detalhados sobre os testes.
- Page Object Model (POM): Padrão de design que organiza o código dos elementos da página, aumentando a manutenibilidade.
- Page Factory: Técnica para inicialização e gerenciamento de elementos das páginas, usada em conjunto com o padrão POM para melhorar a performance e legibilidade do código.


## Cenário de Teste
### Teste de Fluxo de Compra de um Monitor
O cenário principal testado neste projeto é o fluxo de compra de um monitor, um dos produtos da loja Demoblaze. Esse fluxo cobre os seguintes passos:

Acessar o site da loja Demoblaze.
Realizar a busca pelo produto desejado (Monitor).
Selecionar o produto na lista de resultados.
Adicionar o produto ao carrinho.
Navegar até o carrinho para verificar os itens.
Realizar o processo de checkout (confirmação de endereço, método de pagamento, etc.).
Finalizar a compra e verificar a mensagem de confirmação.


## Executando os Testes

1. Clone o repositório:

       git clone git@github.com:ajuliamm/webautomation-desafio-final.git
2. Abra a sua IDE e escolha o arquivo de teste que você quer testar.

3. Rode o teste escolhido.
## Geração de Relatório
Após a execução, o relatório detalhado dos testes será gerado automaticamente na pasta target/ExtentReports e poderá ser visualizado em formato HTML.
