public class employeemain {
    public static void main(String[] args) {

            employee[] employees = {
                    new FullTimeEmplyee("EM001", "Ahmed Ali", "IT", 500, 150),

                    new PartTimeEmployee(
                            "EMP002", "Fatima Hassan", "Nursing", 20, 12),

                    new manager(
                            "EMP003", "Mohamed Omar", "Management", 1000, 200)
            };



            for (employee employee : employees) {
                employee.displayInfo();
            }
        }
    }
