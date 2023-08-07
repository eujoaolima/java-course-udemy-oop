package Aula03;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;

		/*
			Como possuímos uma classe e um parâmetro com o mesmo nome,
			utilizamos a palavra "this" para referenciarmos que estamos
			chamando a atribuição da classe, e não o parâmetro da função
		*/
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units" + ". Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
