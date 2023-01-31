import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double numero;

        System.out.println("Digite um numero para saber se ele é 'POSITIVO' ou ''NEGATIVO'");
        numero = teclado.nextDouble();

        if(numero > 0){
            System.out.println("POSITIVO");
        } else if (numero == 0) {
            System.out.println("0 é um número neutro");
        } else{
            System.out.println("NEGATIVO");
        }
        teclado.close();
    }
}