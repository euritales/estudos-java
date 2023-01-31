import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double salario, imposto;

        salario = teclado.nextFloat();

        if (salario <= 2000) {
            imposto = 0;
            System.out.println("Isento");
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if(imposto != 0){
            System.out.printf("R$ %.2f\n", imposto);
        }
        teclado.close();

    }
}