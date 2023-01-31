package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        int aux;

        System.out.println("Insira o nome do produto: ");
        String name = teclado.nextLine();
        System.out.println("Insira o preço do produto: ");
        double price = teclado.nextDouble();
        Product product = new Product(name, price);
        System.out.println(product.totalValueInStock());

        System.out.println("\nDeseja adicionar quantidade? 1-SIM / 0-NAO");
        aux = teclado.nextInt();
        if(aux == 1){
            System.out.println("\nInsira a quantidade que sera adicionada:");
            int quantity = teclado.nextInt();
            product.addProducts(quantity);
        }
        System.out.printf("Total: R$%.2f",product.totalValueInStock());

        product.setName("Bloco Grande");

        System.out.println("\nDeseja remover quantidade? 1-SIM / 0-NAO");
        aux = teclado.nextInt();
        if(aux == 1){
            System.out.println("\nInsira a quantidade que sera removida:");
            int quantity = teclado.nextInt();
            product.removeProducts(quantity);
        }
        System.out.println(product);

        teclado.close();
    }
}