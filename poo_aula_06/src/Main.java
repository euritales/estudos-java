import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantas alturas serao lidas");
        int alturas = teclado.nextInt();
        double[] vetor = new double[alturas];
        double resultado = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite as alturas:");
            resultado += vetor[i] = teclado.nextDouble();
        }
        System.out.printf("Valor da média das %d alturas: %.2f", vetor.length, resultado = resultado / vetor.length );
    }
}