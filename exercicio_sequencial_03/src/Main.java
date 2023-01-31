import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,d, resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 4 digitos:");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        a *= b;
        c *= d;
        resultado = a-c;

        System.out.printf("Resultado: %d", resultado);
        teclado.close();

    }
}