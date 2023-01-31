package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a quantidade de produtos que serao calculados:");
        int n = teclado.nextInt();
        Product[] vetorProdutos = new Product[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++){
            teclado.nextLine();
            System.out.println("Nome do produto:");
            String name = teclado.nextLine();
            System.out.println("Preco do produto:");
            double price = teclado.nextDouble();
            vetorProdutos[i] = new Product(name, price);
            soma += vetorProdutos[i].getPrice();
        }

        teclado.close();


        System.out.printf("Media dos precos: R$%.2f", soma/n);

    }
}
