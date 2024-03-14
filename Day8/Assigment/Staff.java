package Day8.Assigment;

//Staff class
public final class Staff implements EmployeeData {

    //Instance fields
    private String name;
    private double salary;
    private int numDependants;

    //Constructor
    public Staff(String name, double salary, int numDependants) {
        this.name = name;
        this.salary = salary;
        this.numDependants = numDependants;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public int getNumDependants() {
        return numDependants;
    }
}
