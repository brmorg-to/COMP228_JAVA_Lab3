package exercise2;

//Class that extends GameTester
public class FullTimeGameTester extends GameTester{

    //Constructor that overloads the parent's constructor
    public FullTimeGameTester(String name){
        super(name, true);
    }

    //Overridden method to calculate Salary
    @Override
    public double calculateSalary() {
        return 3_000.00;
    }
}
