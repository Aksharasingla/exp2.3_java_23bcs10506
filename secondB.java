import java.util.*;
// import java.util.stream.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

public class secondB {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Ravi", 85),
                new Student(2, "Neha", 55),
                new Student(3, "Amit", 70),
                new Student(4, "Priya", 90),
                new Student(5, "Karan", 45)
        );

        System.out.println("Students with marks > 60, sorted by name:");
        students.stream()
                .filter(s -> s.marks > 60)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}
