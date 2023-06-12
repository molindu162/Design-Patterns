package AbstractFactory2.Windows;

import AbstractFactory2.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Win Check Box rendered");
    }
}
