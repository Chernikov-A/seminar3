public class Employee implements Comparable<Employee> {

    String name;
    int age;
    int salary;

    public Employee() {

    }

//    private static class EmployeeSalaryComparator implements Comparator<Employee>{
//
//        @Override
//        public int compare(Employee o1, Employee o2) {
//            return  (int)(o1.getSalary() - o2.getSalary());
//        }
//    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee o) {
        return (int)(age - o.getAge());
    }

    @Override
    public String toString() {
        return "[" + name + "] (" + age + ") (" + salary + ")" ;
    }

//    public abstract Company.EmployeeIterator iterator();
}
