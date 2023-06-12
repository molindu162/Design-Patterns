package PrototypePattern;

public class TwoWheelVehicle extends Vehicle{
    public TwoWheelVehicle(String model) {
        super(model);
    }

    public TwoWheelVehicle(Vehicle vehicle) {
        super(vehicle);
    }
}
