package se.consid.codesample;

public class Main {
    public static void main(String[] args) {
        var data = new Data();
        var employeeService = new EmployeeService(data);
        var employeesView = new EmployeesView();
        var employees = employeeService.getEmployees();

        employeesView.display(employees);
    }
}