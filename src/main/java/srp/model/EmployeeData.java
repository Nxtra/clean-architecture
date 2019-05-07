package srp.model;

public class EmployeeData {

    private int totalHoursWorked;
    private int overtimeHoursWorked;
    private double hourlySalary;

    public EmployeeData(int totalHoursWorked, int overtimeHoursWorked, double hourlySalary) {
        this.totalHoursWorked = totalHoursWorked;
        this.overtimeHoursWorked = overtimeHoursWorked;
        this.hourlySalary = hourlySalary;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public int getOvertimeHoursWorked() {
        return overtimeHoursWorked;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "totalHoursWorked=" + totalHoursWorked +
                ", overtimeHoursWorked=" + overtimeHoursWorked +
                ", hourlySalary=" + hourlySalary +
                '}';
    }
}
