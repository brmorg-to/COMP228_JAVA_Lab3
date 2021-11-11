package exercise2;
//Import necessary modules
import java.util.Scanner;


//Driver Class
public class GameTesterApp {

    //Main method
    public static void main(String[] args){

        generateGameTester();

    }

    //Static method to prompt the user, generate objets and display results
    public static void generateGameTester(){

        boolean mode = true;

        Scanner in = new Scanner(System.in);

        //Loop to continuously prompt the user
        while(mode){

            System.out.println("Please select a number for the type of Game Tester you want to create:\n" +
                    "1) Full-time game tester.\n" +
                    "2) Part-time game tester.\n" +
                    "3) EXIT\n");


            int selection = in.nextInt();

            if (selection == 1){
                    System.out.print("Inform the Tester's name: ");
                    in.nextLine();
                    String name = in.nextLine();
                    GameTester fullTime = new FullTimeGameTester(name);

                    System.out.printf("%s is a Full-time Game tester with a salary of: CAD$ %.2f%n%n", fullTime.getName(), fullTime.calculateSalary());

            }
            else if(selection == 2) {
                    System.out.print("\nInform the Tester's name: ");
                    in.nextLine();
                    String namePartTime = in.nextLine();
                    System.out.print("Inform the number of hours worked: ");
                    int numHours = in.nextInt();
                    GameTester partTime = new PartTimeGameTester(namePartTime, false, numHours);

                    System.out.printf("%s is a Part-time Game tester with a salary of: CAD$ %.2f%n%n", partTime.getName(), partTime.calculateSalary());

            }
            else if(selection == 3) {

                mode = false;

            }

        }

    }

}
