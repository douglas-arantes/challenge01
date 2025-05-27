# Desafio: Componentes e Injeção de Dependência

Este repositório contém a solução para o desafio de "Componentes e Injeção de Dependência" proposto pela Formação Desenvolvedor Moderno, módulo Back-end, capítulo "Componentes e Injeção de Dependência".

## Sobre o Desafio

O objetivo deste desafio foi desenvolver um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete. A solução foi implementada em Java com Spring Boot.

### Regras de Negócio

* **Cálculo do Valor Total**: O cálculo do valor total do pedido consiste em aplicar o desconto ao valor básico do pedido e adicionar o valor do frete.
* **Regra para Cálculo do Frete**:

| Valor básico do pedido (sem desconto) | Frete     |
| :------------------------------------ | :-------- |
| Abaixo de R$ 100.00                   | R$ 20.00  |
| De R$ 100.00 até R$ 200.00 exclusive  | R$ 12.00  |
| R$ 200.00 ou mais                     | Grátis    |

### Exemplos Fornecidos

O desafio apresentou os seguintes exemplos de entrada e saída:

**Exemplo 1:**

| ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto) | SAÍDA                  |
| :---------------------------------------------------------------------- | :--------------------- |
| 1034                                                                    | Pedido código 1034     |
| 150.00                                                                  | Valor total: R$ 132.00 |
| 20.0                                                                    |                        |

**Exemplo 2:**

| ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto) | SAÍDA                  |
| :---------------------------------------------------------------------- | :--------------------- |
| 2282                                                                    | Pedido código 2282     |
| 800.00                                                                  | Valor total: R$ 720.00 |
| 10.0                                                                    |                        |

**Exemplo 3:**

| ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto) | SAÍDA                  |
| :---------------------------------------------------------------------- | :--------------------- |
| 1309                                                                    | Pedido código 1309     |
| 95.90                                                                   | Valor total: R$ 115.90 |
| 0.0                                                                     |                        |

## Especificações da Solução

* **Objeto Pedido (Order)**: Um pedido deve ser representado por um objeto conforme projeto abaixo:
    * `code`: Integer
    * `basic`: Double
    * `discount`: Double
* **Serviços (Componentes)**: A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada um com sua responsabilidade, conforme projeto abaixo:
    * `OrderService`: Responsável por operações referentes a pedidos.
        * Método: `+ total(order: Order): double`
    * `ShippingService`: Responsável por operações referentes a frete.
        * Método: `+ shipment(order: Order): double`
* **Tecnologia**: A solução foi implementada em Java com Spring Boot.
* **Saída**: A saída deverá ser mostrada no log do terminal da aplicação.
* **Injeção de Dependência**: Cada serviço deve ser implementado como um componente registrado com `@Service`.

## Como Executar

Para executar este projeto localmente, siga os passos:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/douglas-arantes/challenge01.git](https://github.com/douglas-arantes/challenge01.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd challenge01
    ```
3.  **Abra o projeto em sua IDE (STS, IntelliJ IDEA, VS Code, etc.).**
4.  **Execute a aplicação Spring Boot.** A saída será exibida no console/log.
