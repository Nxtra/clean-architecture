package srp.facade;

import srp.model.Employee;
import srp.utils.EmployeeSaver;
import srp.utils.HourReporter;
import srp.utils.PayCalculator;

public class EmployeeFacade {
    PayCalculator payCalculator;
    HourReporter hourReporter;
    EmployeeSaver employeeSaver;

    public EmployeeFacade() {
        payCalculator = new PayCalculator();
        hourReporter = new HourReporter();
        employeeSaver = new EmployeeSaver();
    }

    public double calculatePay(Employee employee){
         return payCalculator.calculatePay(employee);
    }

    public void reportHours(Employee employee){
        hourReporter.reportHours(employee);
    }

    public void saveEmployee(Employee employee){
        employeeSaver.saveEmployee(employee);
    }

}
