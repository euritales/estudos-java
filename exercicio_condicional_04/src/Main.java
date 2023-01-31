import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado;

        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        if(num1 < num2){
            resultado = num2 - num1;
        }else{
            resultado = 24 - num1 + num2;

        }
        System.out.printf("O resultado é: %d!", resultado);
    }
}