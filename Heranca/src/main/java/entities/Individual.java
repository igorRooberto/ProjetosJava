package entities;

public class Individual extends TaxPlayer {

    private Double healthExpenditures;

    public Individual(){
    }

    public Individual(Double anualIncome, String name, double healthExpenditures) {
        super(anualIncome, name);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax(){
        if(getAnualIncome() < 20000.0){
            return getAnualIncome() * 0.15 - (healthExpenditures * 0.5);
        }else{
            return getAnualIncome() * 0.25 - (healthExpenditures * 0.5);
        }
    }

}


