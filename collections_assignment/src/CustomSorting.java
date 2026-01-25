import java.util.*;
import java.util.stream.Collectors;
class Employee {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
public class CustomSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ram", 40000),
                new Employee(2, "Sita", 60000),
                new Employee(3, "Hanuman", 70000),
                new Employee(4, "Lakshmana", 70000)
        );

        Comparator<Employee> customComparator = Comparator
                .comparingDouble(Employee::getSalary).reversed()
                .thenComparing(Employee::getName)
                .thenComparingInt(Employee::getId);
        List<Employee> sortedEmployees = employees.stream()
                .sorted(customComparator)
                .collect(Collectors.toList());
        sortedEmployees.forEach(System.out::println);
    }
}
