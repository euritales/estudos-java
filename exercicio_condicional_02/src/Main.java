import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num;

        num = teclado.nextInt();

        if(num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");

        }
        teclado.close();

    }
}