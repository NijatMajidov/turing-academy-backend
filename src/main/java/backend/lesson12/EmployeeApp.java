package backend.lesson12;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Alice", 70000, 5);
        employees[1] = new Developer("Bob", 60000, "Java");
        employees[2] = new Employee("Charlie", 50000);

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("Bonus (10%): " + employee.calculateBonus(10));

            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Bonus with Fixed Amount: " + manager.calculateBonus(10, 2000));
            } else if (employee instanceof Developer) {
                Developer developer = (Developer) employee;
                System.out.println("Bonus with Fixed Amount: " + developer.calculateBonus(10, 1500));
            }
            System.out.println("-------------------------------");
        }
    }
}



