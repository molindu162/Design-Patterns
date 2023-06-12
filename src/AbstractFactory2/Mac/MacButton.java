package AbstractFactory2.Mac;

import AbstractFactory2.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac Button rendered");
    }
}
