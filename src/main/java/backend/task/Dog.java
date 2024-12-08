package backend.task;

public class Dog extends Animal {
    private String color;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", color='" + color + '\'' +
                '}';
    }
}
