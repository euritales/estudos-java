import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String x;
        int y;
        double z;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um nome");
        x = teclado.next();
        System.out.println("Digite sua idade");
        y = teclado.nextInt();
        System.out.println("Digite altura");
        z = teclado.nextDouble();
        System.out.println(y);
        teclado.close();
        System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f", x, y,z);


//        x = scNome.next().charAt(2);

    }
}