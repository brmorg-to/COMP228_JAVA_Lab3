package exercise3;

//Child class that extends parent Mortgage
public class BusinessMortgage extends Mortgage {


    //Constructor that calls upon parent's constructor
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int mortgageTermInMonths){

        super(mortgageNumber, customerName, mortgageAmount, interestRate+0.01, mortgageTermInMonths);


    }

}
