package aplication;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Insira os lados do triangulo X:");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();

        System.out.println("Insira os lados do triangulo Y:");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Area triangulo X: %.4f\n", areaX);
        System.out.printf("Area triangulo Y: %.4f\n", areaY);

        if(areaX > areaY){
            System.out.printf("Maior area é o triangulo Y: %.4f\n", areaY);
        }else{
            System.out.printf("Maior area é o triangulo Y: %.4f\n", areaY);
        }

    }
}
