import java.util.List;

public class EmployeePayrollData {
    public String id;
    public String name;
    public double salary;
/*
* Creating Constructor to initialise instance variables in EmployeePayrollData Class
* */
    public EmployeePayrollData(String  id, String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

/*
* toString() method to print construct type variables
* */

    @Override
    public String toString() {
        return "EmployeePayrollData{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
