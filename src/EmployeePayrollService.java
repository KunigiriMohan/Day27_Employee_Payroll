import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService{
    List<EmployeePayrollData> employeeData = new ArrayList();
/*
* main method of the class
* */
    public static void main(String args[]) {
        EmployeePayrollService service = new EmployeePayrollService();          //Creating object of cass to access methods in class
        Scanner consoleReader = new Scanner(System.in);

        service.readEmployeeData(consoleReader);
        service.writeEmployeeData();
    }
    /*
      creating a method for read Employee data
   */
    public void readEmployeeData(Scanner consoleReader){
        System.out.print("Enter Employee ID: ");
        String empID = consoleReader.next();
        System.out.print("Enter Employee name: ");
        String empName = consoleReader.next();
        System.out.print("Enter Employee salary: ");
        double empSalary = consoleReader.nextDouble();

        employeeData.add(new EmployeePayrollData(empID, empName, empSalary));
    }
/*
* writeEmployeeData() method to print values of employees using constructor toString method
* */
    public void writeEmployeeData() {
        System.out.println(employeeData);
    }
}