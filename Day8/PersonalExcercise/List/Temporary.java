package Day8.PersonalExcercise.List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Temporary {

    //main method
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(
                List.of(
                        "Faniel",
                        "Sirak",
                        "Diana",
                        "Heran"
                )
        );

        String nameFaniel = (names.get(0)); //Not nessesary for down casting
        System.out.println(nameFaniel);

        System.out.println("*".repeat(50));

        for(String l : names) {       //Not nessesary for down casting
            System.out.println(l);
        }

        System.out.println("*".repeat(50));

        List<Employeee> employeees = new LinkedList<Employeee>(List.of(
                  new Employeee("Faniel", 2021, 12, 5),
                  new Employeee("Sirak", 2022, 10, 4),
                  new Employeee("Heran", 2012, 11, 12)
        ));

        for(Employeee e : employeees) {
            String name = e.getName(); //No Casting
            System.out.println(name);
            LocalDate date = e.getHireDate();  //No casting
            System.out.println(date);
            System.out.println("----".repeat(5));
        }

        System.out.println("*".repeat(50));

        List<Integer> list1 = new ArrayList<Integer>(List.of(
                1, 2, 3, 4, 5, 6, 7
        ));
       // list1.add("5"); It is not allowed


    }
}

class Employeee {
    //Instance fields
    private String name;
    private LocalDate hireDate;

    //Constructor
    public Employeee(String name, int year, int month, int day) {
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
