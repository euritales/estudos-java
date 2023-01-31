package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor do raio:");
        double raio = teclado.nextDouble();

        double c = Calculator.circumferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("\nCircunferencia: %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI: %.2f", Calculator.PI);

        teclado.close();

    }


}
