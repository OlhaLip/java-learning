package lv.acodemy.object;

public class Car {

    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public Car() {
    }

    public void start () {
        System.out.println( "Car started");

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    //GETTERS
    // SETTERS


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
