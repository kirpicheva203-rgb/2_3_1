package web.Model;

public class Car {
    private String model;
    private int number;
    private String color;


    public Car(String model, String color, int number) {
        this.model = model;
        this.number = number;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
