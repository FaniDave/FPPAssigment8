package Day8.Assigment;

import java.util.Comparator;

//EmployeeNameComparator class
public class EmployeeNameComparator implements Comparator<Marketing> {

    @Override
    public int compare(Marketing m1, Marketing m2) {
        return m1.getEmployeeName().compareTo(m2.getEmployeeName());
    }
}
