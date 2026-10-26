public class FullTimeEmplyee extends employee {

    private double allowance;

    public FullTimeEmplyee(String name, String employeeId,
                            String department, double basicSalary,
                            double allowance) {

        super(employeeId, name, department, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }

    @Override
    public String getcategory() {
        return "Full-Time Employee";
    }
}