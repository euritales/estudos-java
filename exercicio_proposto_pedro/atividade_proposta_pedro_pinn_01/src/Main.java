import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        String nomeAluno = "";
        double resultado = 0;
        double nota[] = new double[4];

        System.out.println("Insira o nome do aluno:");
        nomeAluno = teclado.nextLine();

        for(int i = 0; i < nota.length; i++){
            System.out.printf("Insira a sua %d(a) nota:", i+1);
            nota[i] = teclado.nextDouble();
            resultado += nota[i];
        }
        resultado /= 4;

        System.out.printf("Nome do aluno: %s - Média: %.2f", nomeAluno, resultado);
        teclado.close();

    }
}