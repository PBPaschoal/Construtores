/* Rio de Janeiro, Dia 12/01/2023
Construtores Aula 75:

Product
- Name: string
- Price: double
- Quantity: int

+ TotalValueInStock(): double
+ AddProducts(quantity: int): void
+ RemoveProducts(quantity: int): void

Enter product data:
Name: TV
Price: 900.00
Quantity in stock: 10
Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
Enter the number of products to be added in stock: 5
Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
Enter the number of products to be removed from stock: 3
Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00


Construtor
• É uma operação especial da classe, que executa no momento da 
instanciação do objeto
• Usos comuns:
• Iniciar valores dos atributos
• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua 
instanciação (injeção de dependência)
• Se um construtor customizado não for especificado, a classe disponibiliza o 
construtor padrão:
Product p = new Product();
• É possível especificar mais de um construtor na mesma classe (sobrecarga) */

package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) { // Construtor OBS: Os nomes String name, double prince e int quantity não precisam ser exatamente iguais aos de cima, mas é colocado por boas praticas.
		this.name = name; // this name para se referir ao atributo do objeto (em cima: "public String name;")
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}