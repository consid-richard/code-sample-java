package se.consid.codesample;

import java.util.List;

public class EmployeesView {
    void display(List<Employee> employees) {
        employees.stream()
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .forEach(System.out::println);
    }
}
