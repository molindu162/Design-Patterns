package AbstractFactory2.Windows;

import AbstractFactory2.Button;

public class WinButton implements Button {
    @Override
    public void render() {
        System.out.println("Win Button rendered");
    }
}
