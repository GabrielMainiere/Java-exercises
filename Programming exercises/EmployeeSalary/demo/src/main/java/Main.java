import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee;
        employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.println();
        
        System.out.print("Groos Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();
        
        System.out.println("Employee: "+employee.name+ ", $" + employee.netSalary());
        System.out.println();

        System.out.print("Which percentage to increase increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: "+employee.name+ ", $" + employee.netSalary());
        sc.close();
    }
}