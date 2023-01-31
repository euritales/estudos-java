import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        int numero, hora;
        double valor;

        System.out.println("Insira o numero do funcionario:");
        numero = teclado.nextInt();
        System.out.println("Insira o numero de horas trabalhadas:");
        hora = teclado.nextInt();
        System.out.println("Insira o valor de trabalho/hora:");
        valor = teclado.nextDouble();
        valor *= hora;

        System.out.printf("Number: %d\n", numero);
        System.out.printf("Salary: %.2f\n", valor);

        teclado.close();

    }
}