package entities;

public class Transaction {
    private String name;
    private int number;
    private double value;

    public Transaction(){}
    public Transaction(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getValue() {
        return value;
    }

    public void saqueBancario(double value){
        if(value < this.value){
            System.out.println("Saldo insuficiente");
        }
        this.value -= (value + 5.0);
        return;

    }

    public void depositoBancario(double value){
        this.value += value;
        return;
    }

    public void saldo(){
        System.out.println("----- SALDO -----");
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Nome: %d\n", this.number);
        System.out.printf("Saldo: %.2f\n", this.value);
        System.out.println("----- -- -- -----\n");

    }

}
