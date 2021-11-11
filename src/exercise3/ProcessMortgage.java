package exercise3;

//Import necessary modules
import java.util.Scanner;
import java.util.Arrays;


//Driver class
public class ProcessMortgage {

    //Main method
    public static void main(String[] args){

        Mortgage[] mortgages = generateMortgages();

        //Display mortgages info
        for(int i=0; i< mortgages.length; i++){

            System.out.println("*********************");
            System.out.printf("Mortgage #%d%n", i+1);
            System.out.println("*********************");
            mortgages[i].getMortgageInfo();
            System.out.println();

        }

    }

//    int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int mortgageTermInMonths

    //Static method that generates mortgages and returns an array of objects
    public static Mortgage[] generateMortgages(){

        Mortgage[] mortgages = new Mortgage[3];

        Scanner scan = new Scanner(System.in);


        System.out.print("Please inform the current prime rate in decimal format: ");
        double primeRate = scan.nextDouble();

        for(int i=0; i < mortgages.length; i++){

            System.out.println("=================================================================");
            System.out.printf("Please provide below the necessary information for Mortgage # %d%n%n", i+1);

            System.out.print("Please type 'B' for Business mortgage and 'P' for personal: ");
            scan.nextLine();
            String mortgageType = scan.nextLine().trim().toLowerCase();


            while(!Arrays.asList("b", "p").contains(mortgageType)){
                System.out.println("You must choose 'B' or 'P'");
                mortgageType = scan.nextLine().trim().toLowerCase();
            }

            System.out.print("Inform Mortgage Number: ");
            int mortgageNumber = scan.nextInt();

            System.out.print("Inform Customer Name: ");
            scan.nextLine();
            String customerName = scan.nextLine();

            System.out.print("Inform Mortgage Amount: ");
            long mortgageAmount = scan.nextLong();

            System.out.print("Inform the Mortgage Term in Months: ");
            scan.nextLine();
            int mortgageTermInMonths = scan.nextInt();
            System.out.println(mortgageTermInMonths);

            if(mortgageType.equals("b")){

                Mortgage businessMortgage = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, mortgageTermInMonths);

                mortgages[i]=businessMortgage;


            }
            else if(mortgageType.equals("p")){
                Mortgage personalMortgage = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, mortgageTermInMonths);

                mortgages[i] = personalMortgage;
            }

        }

        return mortgages;

    }

}
