package exercise3;

//Abstract class that implements de MortgageConstants Interface
public abstract class Mortgage implements MortgageConstants {

    //Properties
    protected final int mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    protected int mortgageTermInMonths;


    //Constructor that validates inputs
    protected Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int mortgageTermInMonths) {
       this.mortgageNumber = mortgageNumber;
       this.customerName = customerName;
       if(mortgageAmount > maximumMortgageAmount){
           System.out.println("\nThe Mortgage Amount cannot be greater than CAD$300,000.00.");
           this.mortgageAmount = maximumMortgageAmount;
       }
       else{
           this.mortgageAmount = mortgageAmount;
       }
       this.interestRate = interestRate;
       if(mortgageTermInMonths == shortTerm){
           this.mortgageTermInMonths = shortTerm;
       }
       else if(mortgageTermInMonths == mediumTerm ){
           this.mortgageTermInMonths = mediumTerm;
       }
       else if(mortgageTermInMonths == longTerm){
           this.mortgageTermInMonths = longTerm;
       }
       else{
           this.mortgageTermInMonths = shortTerm;
       }

    }
    //Method to display the objects properties
    public void getMortgageInfo() {
        System.out.printf("Mortgage Number: %d%n" +
                "Mortgagor: %s%n" +
                "Mortgage Amount: %.2f%n" +
                "Interest Rate: %.4f%n" +
                "Mortgage term in months: %d%n",
                this.mortgageNumber,
                this.customerName,
                this.mortgageAmount,
                this.interestRate,
                this.mortgageTermInMonths);

    }

}
