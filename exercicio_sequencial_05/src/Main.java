import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        int peca1, peca2, numPeca1, numPeca2;
        double valorPeca1, valorPeca2, resultado;

        System.out.println("Insira o codigo da peca1:");
        peca1 = teclado.nextInt();
        System.out.println("Insira quantidade da peca1:");
        numPeca1 = teclado.nextInt();
        System.out.println("Insira o valor da peca1:");
        valorPeca1 = teclado.nextDouble();
        valorPeca1 *= numPeca1;

        System.out.println("Insira o codigo da peca2:");
        peca2 = teclado.nextInt();
        System.out.println("Insira quantidade da peca2:");
        numPeca2 = teclado.nextInt();
        System.out.println("Insira o valor da peca2:");
        valorPeca2 = teclado.nextDouble();
        valorPeca2 *= numPeca2;

        resultado = valorPeca1 + valorPeca2;

        System.out.printf("Valor a ser pago: %.2f", resultado);
        teclado.close();
    }
}