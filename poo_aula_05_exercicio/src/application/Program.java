package application;

import entities.Transaction;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double value;
        int aux = 1;

        Transaction p1 = new Transaction();
        System.out.println("Insira o seu nome:");
        p1.setName(teclado.nextLine());
        System.out.println("Insira o numero da sua conta:");
        p1.setNumber(teclado.nextInt());
        System.out.println("Gostaria de realizar um deposito inicial? (Digite um valor, ou 0 para Pular)");
        value = teclado.nextDouble();

        if (value != 0) {
            p1.depositoBancario(value);
        }

        while (aux != 0) {
            System.out.println("Qual operacao deseja realizar? \n1 - Deposito \n2 - Saque \n3 - Saldo\n0 - SAIR");
            aux = teclado.nextInt();

            if (aux == 1) {
                System.out.println("Insira um valor a ser depositado:");
                value = teclado.nextDouble();
                p1.depositoBancario(value);
            } else if (aux == 2) {
                System.out.println("Insira um valor a ser sacado:");
                value = teclado.nextDouble();
                p1.saqueBancario(value);
            } else if (aux == 3) {
                p1.saldo();
            }
        }
        System.out.println("Fim de transacao");
    }
}
