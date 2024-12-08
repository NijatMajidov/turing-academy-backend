package backend.project;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private double price;

    public Animal(String name, int age,double price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age &&
                Double.compare(animal.price, price) == 0 &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, price);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}