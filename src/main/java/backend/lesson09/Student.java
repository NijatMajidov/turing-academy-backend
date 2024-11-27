package backend.lesson09;

public class Student {
    public String name;
    public String surname;
    private int studentId;
    private double grade;

    public Student(String name, String surname, int dilber) {
        this.name = name;
        this.surname = surname;
        this.studentId = dilber;
        this.grade = 0.0;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        if(studentId>100){
        this.studentId = studentId;
        }
        else{
            System.out.println("Student Id duz deyil");
        }
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