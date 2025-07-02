package entities;

public class Bank {

    private int numeroConta;
    private String name;
    private double valueDeposito;

    public Bank(int numeroConta, String name, double valueDeposito){
        this.numeroConta = numeroConta;
        this.name = name;
        this.valueDeposito = valueDeposito;
    }

    public Bank(int numeroConta, String name){
        this.numeroConta = numeroConta;
        this.name = name;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueDeposito() {
        return valueDeposito;
    }

    public void setValueDeposito(double valueDeposito) {
        this.valueDeposito = valueDeposito;
    }

    public double depositar(double deposit){
        return this.valueDeposito = valueDeposito + deposit;
    }

    public double sacar(double sacar){
        return this.valueDeposito = valueDeposito - sacar - 5.00;
    }

    public String toString() {
        return "Update account Data: \n" +
                "Account" + numeroConta +
                ", Holder'" + name + '\'' +
                ", Balance = " + valueDeposito +
                '}';
    }
}

