package entities;

public class Pessoas {

    private String name;
    private int idade;
    private double altura;

    public Pessoas(String name, int idade, double altura){
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static double mediaAltura(double value, int n){
        return value / n;
    }
}
