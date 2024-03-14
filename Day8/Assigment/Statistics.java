package Day8.Assigment;

import java.util.List;

//Statistics class
public class Statistics {

    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> combined) {
         double sumOfSalaries = 0.0;
          for(EmployeeData e : combined) {
             sumOfSalaries += e.getSalary();
          }
          return sumOfSalaries;
    }
}
