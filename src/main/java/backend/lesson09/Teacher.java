package backend.lesson09;

public class Teacher {
    public String name;
    public String surname;
    private int teacherId;

    public Teacher(String name, String subject, int teacherId) {
        this.name = name;
        this.surname = subject;
        this.teacherId = teacherId;
    }
    public void printInfo() {
        System.out.println("Öğretmen ID: " + teacherId);
        System.out.println("Adı: " + name);
        System.out.println("Soyadi: " + surname);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}