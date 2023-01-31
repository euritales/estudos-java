import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o primeiro valor");
        a = teclado.nextDouble();
        System.out.println("Insira o segundo valor");
        b = teclado.nextDouble();
        System.out.println("Insira o terceiro valor");
        c = teclado.nextDouble();

        triangulo = a * c / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        teclado.close();
    }
}