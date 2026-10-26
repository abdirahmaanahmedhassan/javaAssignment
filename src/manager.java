public class manager extends employee {

    private double bonus;

    public manager(String name, String employeeId,
                   String department, double basicSalary,
                   double bonus) {

        super(employeeId, name, department, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String getcategory() {
        return "Manager";
    }

}
