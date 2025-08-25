package javacollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}
public class Task5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee("Alice", "HR"),
	            new Employee("Bob", "IT"),
	            new Employee("Charlie", "HR"),
	            new Employee("David", "IT"),
	            new Employee("Eve", "Finance")
	        );
		Map<String, List<Employee>> groupedByDepartment = employees.stream()
	            .collect(Collectors.groupingBy(Employee::getDepartment));
	        // Print the grouped employees
	        groupedByDepartment.forEach((department, empList) -> {
	            System.out.println(department + ": " + empList);
	        });
	}

}
