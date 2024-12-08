package backend.lesson12;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Team Size: " + teamSize);
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        return super.calculateBonus(percentage) + fixedAmount;
    }
}
