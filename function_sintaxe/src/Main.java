import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira 3 numeros (A cada numero digitado, confirme com o ENTER)");

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int higher = max(a,b,c);
        showResult(higher);
    }

    public static int max(int x, int y, int z){
        int aux;

        if (x > y && y > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}