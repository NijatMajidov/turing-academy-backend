package backend.task;

public class ZooApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setName("Zuzu");
        animal1.setAge(2);

        Cat cat1 = new Cat();
        cat1.setName("Cat");
        cat1.setAge(1);
        cat1.setGender("erkek");

        Dog dog1 = new Dog();
        dog1.setName("havhav");
        dog1.setAge(3);
        dog1.setColor("yellow");
    }
}
