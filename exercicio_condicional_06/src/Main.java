import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num;

        num = teclado.nextFloat();

        if(num >= 0 && num <= 25){
            System.out.println("Faixa: 0 - 25");
        } else if (num > 25 && num <= 50){
            System.out.println("Faixa: 25 - 50");
        }else if(num > 50 && num <= 75){
            System.out.println("Faixa: 50 - 75");
        }else if (num > 75 && num <= 100){
            System.out.println("Faixa: 756 - 100");
        }
        System.out.println("Fora do Intervalo");
        teclado.close();

    }
}