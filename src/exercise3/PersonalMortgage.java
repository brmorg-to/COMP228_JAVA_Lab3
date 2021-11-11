package exercise3;

//Child class that extends parent Mortgage
public class PersonalMortgage extends Mortgage{

    //Contructor that calls upon parent's constructor
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int mortgageTermInMonths){

        super(mortgageNumber, customerName, mortgageAmount, interestRate+0.02, mortgageTermInMonths);


    }

}
