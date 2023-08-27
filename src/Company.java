import java.util.Iterator;
import java.util.function.Consumer;

public class Company extends Employee implements Iterable<Employee> {

    public Company(String name, int age, int salary, int[] employees, String emp, String emp1) {
        super(name, age, salary);

    }
    Employee[] employees = new Employee[10];
    Company company = new Company(employees);

    public Company(Employee[] employees) {
    }

    @Override
    public void forEach(Consumer<? super Employee> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public EmployeeIterator iterator() {
        return null;
    }

//
    
    private static class EmployeeIterable implements Iterable<Employee>{
        private final String emp;

        private EmployeeIterable(String emp) {
            this.emp = emp;
        }

        @Override
    public EmployeeIterator iterator() {
        return new EmployeeIterator(emp);
    }
    }
    private static class EmployeeIterator implements Iterator<Employee> {

        private final String emp;

        private int cursor = 0;

        public EmployeeIterator(String emp) {
            this.emp = emp;
        }

        @Override
        public boolean hasNext() {
            return cursor < emp.length();
        }

        @Override
        public Employee next() {
            return null;
        }

//        @Override
//        public Employee next() {
//            return emp.charAt(cursor++);
//        }
    }
}
