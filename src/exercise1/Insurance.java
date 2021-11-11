package exercise1;

public abstract class Insurance {

    //Declare instance variables
    protected String typeOfInsurance;
    protected double monthlyCost;

    //Constructor to initialize instance variables
    public Insurance(String typeOfInsurance, double monthlyCost){
        this.typeOfInsurance = typeOfInsurance;
        this.monthlyCost = monthlyCost;
    }

    //Implementing Getters for instance variables
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }


    //Declare abstract methods to be implemented in children classes

    //Method to set the monthly cost
    abstract void setInsuranceCost(double insuranceCost);

    //Method to display the object's info
    abstract void displayInfo();

}
