package entities;

public class Employee {

    private Integer id;
    private Double salario;
    private String name;

    public Employee(){

    }
    public Employee(Integer id, Double salario,String name){
        this.id = id;
        this.salario = salario;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

}
