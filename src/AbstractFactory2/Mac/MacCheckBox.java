package AbstractFactory2.Mac;

import AbstractFactory2.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Mac Check Box rendered");
    }
}
