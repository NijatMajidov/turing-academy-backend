package backend.lesson09;

public class Student {
    public String name;
    public String surname;
    private int studentId;
    private double grade;

    public Student(String name, String surname, int studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
        this.grade = 0.0;
    }
    public void printInfo() {
        System.out.println("Öğrenci ID: " + studentId);
        System.out.println("Adı: " +    name);
        System.out.println("Soyadı: " + surname);
        System.out.println("Not: " + grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}