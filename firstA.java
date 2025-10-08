import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class firstA {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 50000));
        employees.add(new Employee(102, "Bob", 40000));
        employees.add(new Employee(103, "Charlie", 60000));
        employees.add(new Employee(104, "David", 45000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sort by name
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        // Sort by salary (descending)
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);
    }
}