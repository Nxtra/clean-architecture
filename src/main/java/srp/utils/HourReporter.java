package srp.utils;

import srp.model.Employee;
import srp.model.EmployeeData;

public class HourReporter {
    public void reportHours(Employee employee) {
        int regularHours = regularHours(employee);
        int overtimeHours = overtimeHours(employee);
        System.out.println(String.format("Regular hours: %d, Overtime hours: %d", regularHours, overtimeHours));
    }

    private int regularHours(Employee employee){
        EmployeeData employeeData = employee.getEmployeeData();
        return employeeData.getTotalHoursWorked() - employeeData.getOvertimeHoursWorked();
    }

    private int overtimeHours(Employee employee){
        return employee.getEmployeeData().getOvertimeHoursWorked();
    }
}
