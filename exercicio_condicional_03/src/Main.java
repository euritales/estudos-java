import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Multiplos");
        }else{
            System.out.println("Nao multiplos");
        }
        teclado.close();

    }
}