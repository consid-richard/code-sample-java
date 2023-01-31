package se.consid.codesample;

import java.util.List;

public class EmployeeService {
    private final Data data;

    public EmployeeService(Data data) {
        this.data = data;
    }

    public List<Employee> getEmployees() {
        return data.getEmployees();
    }
}
