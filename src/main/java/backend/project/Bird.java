package backend.project;

public class Bird extends Animal{
    private String type;
    public Bird(String name, int age, double price) {
        super(name, age, price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "type :" + this.type;
    }
}