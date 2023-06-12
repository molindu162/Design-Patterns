package PrototypePattern;

public class Vehicle implements PrototypeClone{
    public String getModel() {
        return model;
    }

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public Vehicle(Vehicle vehicle) {
        model = vehicle.model;
    }

    public Vehicle clone() {
        return new Vehicle(this);
    }

}
