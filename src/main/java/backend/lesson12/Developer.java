package backend.lesson12;

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Programming Language: " + programmingLanguage);
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        return super.calculateBonus(percentage) + fixedAmount;
    }
}
