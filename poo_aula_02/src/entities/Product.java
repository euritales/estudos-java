package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "Product Data: " + name + ", $" + String.format("%.2f", price ) + ", "+ quantity+
                " unit(s), Total: $" +
                String.format("%.2f", totalValueInStock());

    }
}
