import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num;

        num = teclado.nextInt();

        if(num < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Positivo");
        }
        teclado.close();
    }
}