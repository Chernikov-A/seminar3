import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("temp",20,2000);
        Employee employee2 = new Employee("Yjf",53,2500);
        Employee employee3 = new Employee("Name",34,2700);
        Employee employee4 = new Employee("Pot",18,3000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

        TreeSet<Employee> employees = new TreeSet<>(new EmployeeSalaryReversedComparator());
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println(employees);


    }
    private static class EmployeeSalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee first, Employee second) {
            return (int) (second.getSalary() - first.getSalary());
        }
    }
    private static class EmployeeSalaryReversedComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee first, Employee second) {
            return (int) (first.getSalary() - second.getSalary());
        }
    }
}