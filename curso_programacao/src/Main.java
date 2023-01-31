import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 23;
        double renda = 4000.0;

        System.out.println(y);
        System.out.printf("%.2f\n", x);
        System.out.println("Bom dia!");
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", x);
        System.out.printf("Resultado:" + x + " Metros\n");
        System.out.printf("Resultado: %.2f Metros\n", x);
        System.out.printf("%s tem %d anos e ganha %.2f de reais.\n", nome, idade, renda);

    }
}