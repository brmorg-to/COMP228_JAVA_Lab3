package exercise1;

//Life class that extends the parent class Insurance
public class Life extends Insurance{

    //Constructor that calls upon the parent constructor
    public Life(String type, double cost){
        super(type, cost);
    }

    //Implementation of abstract methods declared in the parent class Insurance
    @Override
    public void setInsuranceCost(double insuranceCost) {
        this.monthlyCost = insuranceCost;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Type of Insurance: %s%n" +
                "Insurance Cost: %.2f%n", this.getTypeOfInsurance(), this.getMonthlyCost());
    }

}
