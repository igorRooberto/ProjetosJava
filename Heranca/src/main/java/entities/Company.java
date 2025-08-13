package entities;

public class Company extends TaxPlayer {

    private Integer  numberOfEmployees;

    public Company(){

    }

    public Company(Double anualIncome, String name, Integer numberOfEmployees) {
        super(anualIncome, name);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        if(numberOfEmployees > 10){
           return getAnualIncome() * 0.14;
        }else{
            return getAnualIncome() * 0.16;
        }
    }


}
