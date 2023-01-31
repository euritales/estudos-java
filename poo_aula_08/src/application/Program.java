package application;

import entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Quarto[] arrayQuartos = new Quarto[10];

        System.out.println("Quantos quartos serao alugados?");
        int n = teclado.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("Registro #%d:\n", i);
            System.out.println("Nome:");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.println("Email:");
            String email = teclado.nextLine();
            System.out.println("Numero quarto:");
            int numQuarto = teclado.nextInt();

            arrayQuartos[numQuarto] = new Quarto(name, email);
        }

        System.out.println("\n-----Alocacao dos quartos-----\n");
        for(int i = 0 ; i < 10; i++) {
            if(arrayQuartos[i] != null){
                System.out.println(i + ": " + arrayQuartos[i]);
            }
        }
    teclado.close();
    }

}
