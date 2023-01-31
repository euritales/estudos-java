import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cod_lanche[] = {4.00, 4.50, 5.00, 2.00, 1.50};
        int lanche, quantidade;

        lanche = teclado.nextInt();
        quantidade = teclado.nextInt();

        System.out.println(cod_lanche[lanche] * quantidade);
    }
}