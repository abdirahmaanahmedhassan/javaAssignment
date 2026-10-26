public class employee {
    protected String name;
    protected String employeeid;
    protected String department;

    protected double basicSalary;

    public employee( String name,String employeeid,String department,double basicSalary){
        this.name=name;
        this.employeeid=employeeid;
        this.basicSalary=basicSalary;
        this.department=department;
    }
    public double calculateSalary() {
        return basicSalary;
    }
    public String getcategory(){
        return "employee";
    }
    public void displayInfo(){

        System.out.println("name " + name);
        System.out.println("employeeid" + employeeid);
        System.out.println("category:"+ getcategory());
        System.out.println("department"+ department);
        System.out.println("basicsalary" +basicSalary);
        calculateSalary();
        System.out.println();
    }

}
