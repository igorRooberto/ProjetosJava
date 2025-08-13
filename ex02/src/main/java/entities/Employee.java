package entities;

public class Employee {
    private String name;
    private double glossSalary;
    private double tax;
    private double percentage;

    public Employee(String name, double glossSalary, double tax){
        this.name = name;
        this.glossSalary = glossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGlossSalary() {
        return glossSalary;
    }

    public void setGlossSalary(double glossSalary) {
        this.glossSalary = glossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary(){
        return getGlossSalary() - getTax();
    }
    public double increaseSalary(double percentage){
        return getGlossSalary() * percentage;
    }
}
