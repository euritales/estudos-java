package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        int quantity, aux;

        Product product = new Product();
        System.out.println("Insira o nome do produto: ");
        product.name = teclado.nextLine();
        System.out.println("Insira a quantidade do produto: ");
        product.quantity = teclado.nextInt();
        System.out.println("Insira o preço do produto: ");
        product.price = teclado.nextDouble();
        System.out.println(product);

        System.out.println("\nDeseja adicionar quantidade? 1-SIM / 0-NAO");
        aux = teclado.nextInt();
        if(aux == 1){
            System.out.println("\nInsira a quantidade que sera adicionada:");
            quantity = teclado.nextInt();
            product.addProducts(quantity);
        }
        System.out.println(product);

        System.out.println("\nDeseja remover quantidade? 1-SIM / 0-NAO");
        aux = teclado.nextInt();
        if(aux == 1){
            System.out.println("\nInsira a quantidade que sera removida:");
            quantity = teclado.nextInt();
            product.removeProducts(quantity);
        }
        System.out.println(product);

        teclado.close();
    }
}