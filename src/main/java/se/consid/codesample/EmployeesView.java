package se.consid.codesample;

import java.util.List;

public class EmployeesView {
    public void display(List<Employee> employees) {
        employees.stream()
            .map(this::displayEmployee)
            .forEach(System.out::println);
    }

    private String displayEmployee(Employee employee) {
        return employee.getFirstName() + " "  + employee.getLastName();
    }
}
