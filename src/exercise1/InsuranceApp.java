package exercise1;

//Import the necessary modules to run the application
import javax.swing.JOptionPane;
import java.util.ArrayList;

//Driver class
public class InsuranceApp {

    //Main method
    public static void main(String[] args) {

            //Store in a list the objects created by the user's input
            ArrayList<Insurance> ins = buildInsurance();

            //Loop through the List to display de objects' properties
            for(int i= 0; i<ins.size();i++){
                System.out.println("=============================");
                ins.get(i).displayInfo();
            }

    }

    //Method that prompts the user to input the necessary arguments, creates the new objects of the selected types, and
    //store the values in a list.
    public static ArrayList<Insurance> buildInsurance(){

        //Variables to be used in the object's construction process
        ArrayList<Insurance> insurance = new ArrayList<Insurance>();
        boolean status = true;
        String type="";
        String cost="";
        double insuranceCost=0;

        //A loop that allows the user to continuously create objects of the selected type
        while(status){
            JOptionPane.showMessageDialog(null,"Let's build your insurances. Type 'x' at any moment to stop");
            type = JOptionPane.showInputDialog("Please enter the type of insurance. Health or Life: ").trim().toLowerCase();
            if(type.equals("x")){
                status = false;
            }
            else {
                cost = JOptionPane.showInputDialog("Please enter the cost for the selected insurance: ").trim();
                try{
                    insuranceCost = Double.parseDouble(cost);
                }
                catch(Exception IllegalArgumentException){
                    JOptionPane.showMessageDialog(null, "Please enter a number!");
                }

            }
            if(type.equals("health")){
                Insurance healthInsurance = new Health(type, insuranceCost);
                healthInsurance.displayInfo();
                insurance.add(healthInsurance);
            }
            else if(type.equals("life")){
                Insurance lifeInsurance = new Life(type, insuranceCost);
                lifeInsurance.displayInfo();
                insurance.add(lifeInsurance);
            }
            else if(!type.equals("x") & !type.equals("health") & !type.equals("life")){
                JOptionPane.showMessageDialog(null, "Please choose between 'Health' and 'Life'.");
            }

        }

        return insurance;
    }



}
