package javacollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Employee2 {
    private String name;
    private String department;
    public Employee2(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
}
public class Task6_3 {
	public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee2> employees = Arrays.asList(
        		new Employee2("Alice", "HR"),
                new Employee2("Bob", "IT"),
                new Employee2("Charlie", "IT"),
                new Employee2("David", "HR"),
                new Employee2("Eve", "Finance")
        );
        // Group employees by department
        Map<String, List<Employee2>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee2::getDepartment));
        // Print the grouped employees
        groupedByDepartment.forEach((department, empList) -> {
            System.out.println(department + ": " + empList);
        });
    }
}
