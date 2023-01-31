package application;

import utils.CurrencyConverte;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double conversao = 0;

        System.out.println("Insira o valor do dolar:");
        double valorDolar = teclado.nextDouble();

        System.out.println("Insira quantos dolas serão convertidos:");
        double valorReal = teclado.nextDouble();
        conversao = CurrencyConverte.converteDollar(valorDolar, valorReal);
        System.out.printf("Valor em Real: %.2f", conversao);


    }

}
