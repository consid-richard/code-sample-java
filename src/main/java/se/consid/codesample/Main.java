package se.consid.codesample;

public class Main {
    public static void main(String[] args) {
        var employeeService = new EmployeeService();
        var employeesView = new EmployeesView();
        var employees = employeeService.getEmployees();

        employeesView.display(employees);
    }
}