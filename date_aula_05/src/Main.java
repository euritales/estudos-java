import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date x01 = new Date();

        Date y01 = sdf01.parse("25/06/2018");
        Date y02 = sdf02.parse("25/06/2018 15:42:07");

        System.out.println("x1: " + x01);
        System.out.println("y1: " + y01);
        System.out.println("y2: " + y02);
    }
}