package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Insira o nome do departamento: ");
        String departamentName = teclado.nextLine();

        System.out.println("Dados do trabalhador: ");
        System.out.println("Nome: ");
        String workerName = teclado.nextLine();
        System.out.println("Level: ");
        String workerLevel = teclado.nextLine();
        System.out.println("Salario: ");
        double workerSalary = teclado.nextDouble();

        Worker worker = new Worker( workerName , WorkerLevel.valueOf(workerLevel), workerSalary, new Departament(departamentName));

        System.out.println("Quantos contratos existirao? ");
        int n = teclado.nextInt();

        for (int i = 0; i<n; i++){
            System.out.printf("Entre com o %d contrato", i+1);
            System.out.println("Data: (DD/MM/YYYY)");
            Date contractDate = sdf.parse(teclado.next());
            System.out.println("Valor por hora:");
            double valorHora = teclado.nextDouble();
            System.out.println("Duracao (hora) contrato:");
            int horas = teclado.nextInt();
            HourContract contract = new HourContract(contractDate, valorHora,horas);
            worker.addContract(contract);
        }

        System.out.println("Insira o mes e ano para calcular o salario (MM/YYYY): ");
        String monthAndYear = teclado.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName()  );
        System.out.println("Quantia no mes " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        teclado.close();
    }

}
