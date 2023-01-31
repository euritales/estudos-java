import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 ="Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        Double price1 = 2100.0;
        Double price2 = 650.50;
        Double meansure = 53.234567;

        System.out.println("Produtcs:");
        System.out.printf("%s, wich price is $%.2f\n", product1, price1);
        System.out.printf("%s, wich price is $%.2f\n", product2, price2);
        System.out.println("");
        System.out.printf("Record: %d years old, code %d and gender %c\n", age, code, gender);
        System.out.println("");
        System.out.printf("Measue with eight decimal places: %.8f\n", meansure);
        System.out.printf("Rouded (three decimal places): %.3f\n", meansure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", meansure);

    }
}