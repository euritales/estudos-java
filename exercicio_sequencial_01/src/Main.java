import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,y;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero:");
        x = teclado.nextInt();
        System.out.println("Digite outro numero:");
        y = teclado.nextInt();
        x += y;
        System.out.printf("Resultado:%d", x);
        teclado.close();
    }
}