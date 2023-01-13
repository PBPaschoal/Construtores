# Construtores Aula 75:

Product
- (-) Name: string
- (-) Price: double
- (-) Quantity: int

- (+) TotalValueInStock(): double
- (+) AddProducts(quantity: int): void
- (+) RemoveProducts(quantity: int): void

## Exemplo:
- Enter product data:
- Name: TV
- Price: 900.00
- Quantity in stock: 10
- Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
- Enter the number of products to be added in stock: 5
- Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
- Enter the number of products to be removed from stock: 3
- Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00


## Construtor
- É uma operação especial da classe, que executa no momento da instanciação do objeto
- Usos comuns:
- Iniciar valores dos atributos
- Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
- Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
Product p = new Product();
- É possível especificar mais de um construtor na mesma classe (sobrecarga)

# TECH:

![JAVA](https://i.ibb.co/Xkf17zS/java.png)
![IDE](https://i.ibb.co/njMWJXP/eclipse-icon-1-3778a4cbe978d8dfd73c091706e26aa6c57c65aa-removebg-preview.png)
