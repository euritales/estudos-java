import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        double x, y;

        x = teclado.nextFloat();
        y = teclado.nextFloat();

        if(x == 0.0 && y == 0.0){
            System.out.println("Origem");
        } else if(x == 0.0){
            System.out.println("Eixo Y");
        } else if(y == 0.0){
            System.out.println("Eixo X");
        }
        if(x > 0.0 && y > 0.0){
            System.out.println("Q1");
        } else if(x < 0.0 && y > 0.0){
            System.out.println("Q2");
        } else if(x < 0.0 && y < 0.0){
            System.out.println("Q3");
        } else if(x > 0.0 && y < 0.0){
            System.out.println("Q4");
        }

        teclado.close();
    }
}