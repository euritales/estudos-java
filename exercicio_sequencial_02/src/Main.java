import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double pi = 3.14159;
        double raio;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio do círculo:");
        raio = teclado.nextDouble();
        raio = Math.pow(raio, 2.0);
        pi = pi * raio;
        System.out.printf("Resultado: %.4f", pi);
        teclado.close();

    }
}