# avaliacaoLP2
Implementar um sistema de cadastro de compradores e vendedores onde é possível registrar um catálogo de produtos bem como compras realizadas. As compras podem ser realizadas por diferentes formas de pagamento.


Avaliação da primeira unidade
Universidade Federal do Rio Grande do Norte
Instituto Metrópole Digital
IMD0040 - Linguagem de Programação 2 - 2020.2 35N34
Professor: Vinicius Mendes


O prazo para entrega é 22/03/2021 às 23:59.

# Objetivo
   - Avaliar a aplicação dos conceitos da linguagem de programação Java e do paradigma de programação orientada a objetos.

# Escopo
    - Implementar um sistema de cadastro de compradores e vendedores onde é possível registrar um catálogo de produtos bem como compras realizadas. As compras podem ser realizadas por diferentes formas de pagamento.

# Conceitos do sistema
    @ Forma de Pagamento

    - PIX Instantaneamente debita o valor da conta do comprador e deposita na conta do vendedor.

    - Boleto Verifica se a data de vencimento do boleto não foi excedida. Instantaneamente debita o valor da conta do comprador e adiciona nos valores a receber do vendedor, descontado do valor para emissão do boleto.

    - Débito Instantaneamente debita o valor da conta do comprador e deposita na conta do vendedor, descontado da taxa percentual de cobrança da operadora do cartão.

    - Credito Coloca o valor na lista de valores a pagar do comprador e adiciona nos valores a receber do vendedor, descontado da taxa percentual de cobrança da operadora do cartão.

# Compra/Venda
    - CPF Comprador
    - CNPJ do Vendedor
    - Forma de Pagamento
    - Itens

# Comprador
    nome
    cpf
    saldo da conta
    valores a pagar
    compras realizadas
    
# Vendedor
    nome
    cnpj
    saldo da conta
    valores a receber
    vendas realizadas
    catalogo de produtos

# Produto
    codigo
    nome
    precoUnitario


# Requisitos:
Não podem existir dois compradores com o mesmo CPF, Não podem existir dois vendedores com o mesmo CNPJ, Não podem existir dois produtos com o mesmo código

    -O sistema deve permitir cadastrar compradores informando o saldo inicial de sua conta
    -O sistema deve permitir cadastrar vendedores
    -O sistema deve permitir cadastrar produtos e adicionar ao catálogo de um vendedor
    -O sistema deve permitir imprimir os dados de um comprador com base no seu CPF
    -O sistema deve permitir imprimir os dados de um vendedor, iclusive o seu catálogo, com base no seu CNPJ

    O sistema deve permitir cadastrar compras/vendas informando o CPF do comprador, o CNPJ do vendedor e os códigos dos produtos.

    O sistema deve atualizar os seguintes atributos de acordo com o valor de cada compra realizada e o tipo de pagamento escolhido:
        Comprador: saldo da conta, valores a pagar, compras realizadas
        Vendedor: saldo da conta, valores a receber, vendas realizadas
            Forma de avaliação
            Este projeto contará como 7 pontos da primeira unidade. A forma de avaliação será:

* Cada requisito satisfeito valerá 0,5 pontos
* Cada um dos conceitos abaixo aplicado corretamente valerá 0,5 pontos:
    - Organização em pacotes e encapsulamento adequado
    - Equals e Hashcode implementados corretamente
    - Uso do toString()
    - Uso adequado das coleções
    - Aplicação da herança
    - Aplicação do polimorfismo