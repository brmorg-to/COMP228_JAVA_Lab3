package exercise2;
//Child class that extends parent GameTester
public class PartTimeGameTester extends GameTester{

    //Properties of this class
    private double hourlyRate = 20.00;
    private int numHoursWorked;


    //Overridden constructor
    public PartTimeGameTester(String name, boolean fullTime, int numHoursWorked){
        super(name, fullTime);
        this.numHoursWorked = numHoursWorked;
    }

    //Getters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getNumHoursWorked() {
        return numHoursWorked;
    }

    //Overridden method to calculate salary
    @Override
    public double calculateSalary() {
        return numHoursWorked * hourlyRate;
    }
}
