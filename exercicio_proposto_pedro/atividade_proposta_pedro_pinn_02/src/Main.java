import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String senhaAtual = "123ABC";
        String verificaSenha = "" ;

        System.out.println("Insira a senha para acessar:");
        verificaSenha = teclado.nextLine();

        while (!senhaAtual.equals(verificaSenha)){
            System.out.println("Acesso Negado");
            verificaSenha = teclado.nextLine();
        }
        System.out.println("Acesso Permitido");
        teclado.close();
    }
}