package srp.utils;

import srp.model.Employee;
import srp.model.EmployeeData;

public class PayCalculator {

    private static final double OVERTIMEPAYMENTFACTOR = 1.50;

    public double calculatePay(Employee employee) {
        EmployeeData employeeData = employee.getEmployeeData();
        double hourSalary = employeeData.getHourlySalary();

        double regularPay = hourSalary * regularHours(employeeData);
        double overtimePay = hourSalary * employeeData.getOvertimeHoursWorked() * OVERTIMEPAYMENTFACTOR;

        return regularPay + overtimePay;
    }

    private int regularHours(EmployeeData employeeData){
        return employeeData.getTotalHoursWorked() - employeeData.getOvertimeHoursWorked();
    }
}
