public class PartTimeEmployee  extends employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, String employeeId,
                            String department, int hoursWorked,
                            double hourlyRate) {

        super(employeeId, name, department, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getcategory() {
        return "Part-Time Employee";
    }
}

