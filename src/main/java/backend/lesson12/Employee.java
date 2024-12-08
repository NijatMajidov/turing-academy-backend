package backend.lesson12;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public double calculateBonus(double percentage) {
        return salary * (percentage / 100);
    }
}
