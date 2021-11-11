package exercise2;

//Abstract class GameTester
public abstract class GameTester {

    //Instance variables
    protected String name;
    protected boolean fullTime;

    //Constructor
    public GameTester(String name, boolean fullTime){
        this.name = name;
        this.fullTime = fullTime;
    }

    //Getter for property Name
    public String getName() {
        return name;
    }

    //Getter for property fullTime
    public boolean isFullTime() {
        return fullTime;
    }

    //Abstract method to calculate Salary. To be implemented in derived classes
    protected abstract double calculateSalary();

}
