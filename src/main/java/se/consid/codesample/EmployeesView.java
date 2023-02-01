package se.consid.codesample;

import java.util.List;

public class EmployeesView {
    public void display(List<Employee> employees) {
        for (Employee employee : employees) {
            String info = getEmployeeInfo(employee);
            System.out.println(info);
        }
    }

    private void getEmployeeInfo(Employee employee) {
        return employee.getFirstName() + " "  + employee.getLastName();
    }
}
