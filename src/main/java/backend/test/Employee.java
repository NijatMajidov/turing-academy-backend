package backend.test;

public class Employee {
    public String name;
    public String surname;
    private int age;

    public Employee(String name, String surname){
        this.name =name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age){
        this.name =name;
        this.surname = surname;
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18)
        this.age = age;
        else{
            System.out.println("Boyuyende gelersen");
        }
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
