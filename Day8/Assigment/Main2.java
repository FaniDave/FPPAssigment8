package Day8.Assigment;

import java.util.ArrayList;
import java.util.List;

//Main2 class for problem 2
public class Main2 {

    //main method
    public static void main(String[] args) {
        List<Staff> staff = new ArrayList<>(List.of(
                new Staff("John", 110000, 2),
                new Staff("Tom", 110000, 4),
                new Staff("Edward", 120000, 1),
                new Staff("Rich", 90000, 3),
                new Staff("Kevin", 100000, 1)
        ));

        List<Teacher> teachers = new ArrayList<>(List.of(
                new Teacher("Andrew", 110000, 10000),
                new Teacher("Andrew", 110000, 10000),
                new Teacher("Phil", 135000, 12000),
                new Teacher("Tony", 95000, 8000)
        ));


        //Implementation steps
        //Step 1: implement the combine method, to combine the two lists

        List<EmployeeData> combined = combine(staff, teachers);
        //Step 2: pass the combined list to computeSumOfSalaries
        double salarySum = Statistics.computeSumOfSalaries(combined);
        System.out.println(salarySum);
    }


    //IMPLEMENT
    public static List<EmployeeData> combine(List<Staff> staff, List<Teacher> teachers) {
        List<EmployeeData> combinedTeacherAndStaff = new ArrayList<>();
        combinedTeacherAndStaff.addAll(staff);
        combinedTeacherAndStaff.addAll(teachers);
        return combinedTeacherAndStaff;
    }
}
