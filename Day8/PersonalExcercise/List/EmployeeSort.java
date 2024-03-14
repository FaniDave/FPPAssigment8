package Day8.PersonalExcercise.List;

import java.time.LocalDate;
import java.util.*;

//EmployeeSort class
public class EmployeeSort {

    //main method
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("George", 1996, 11, 5),
                new Employee("Dave", 2000, 1, 3),
                new Employee("Richard", 2001, 2, 7)
        ));

        System.out.println("Employees before sorting : ");
        for(Employee e : employees) {
            System.out.println("Name : " + e.getName());
            System.out.println("Hired Date : " + e.getHireDate());
            System.out.println("-".repeat(20));
        }

        System.out.println("*".repeat(50));

        Collections.sort(employees, new NameComparator());
        System.out.println("Employees after sorting : ");
        for(Employee e : employees) {
            System.out.println("Name : " + e.getName());
            System.out.println("Hired Date : " + e.getHireDate());
            System.out.println("-".repeat(20));
        }
    }
}


//Employee class
class Employee {
    //Instance fields
    private String name;
    private LocalDate hireDate;

    //Constructor
    public Employee(String name, int year, int month, int day) {
        this.name = name;
        this.hireDate = LocalDate.of(year, month, day);
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}

//NameComparator class
class NameComparator implements Comparator<Employee> {

    //Instance method ( implemented method )
    public int compare(Employee e1, Employee e2) {
        if (e1.getName().compareTo(e2.getName()) != 0) {
            return e1.getName().compareTo(e2.getName());
        }
        return e1.getHireDate().compareTo(e2.getHireDate());
    }
}
