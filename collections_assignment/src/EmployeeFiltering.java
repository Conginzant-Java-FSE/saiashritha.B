import java.util.*;
import java.util.stream.Collectors;
    class Employeee {
        int id;
        String name;
        double salary;
        public Employeee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        public double getSalary() {
            return salary;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
        }
    }
    public class EmployeeFiltering {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(1, "Sharukh", 80000),
                    new Employee(2, "Bob", 60000),
                    new Employee(3, "Salman", 5000),
                    new Employee(4, "David", 76000),
                    new Employee(5, "Farooq", 95000));
            List<String> result = employees.stream()
                    .filter(e -> e.getSalary() > 75000)
                    .map(Employee::getName)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Filtered & Sorted Names:");
            result.forEach(System.out::println);
        }
    }

