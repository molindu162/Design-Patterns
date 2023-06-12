package AbstractFactory2.Windows;

import AbstractFactory2.Button;
import AbstractFactory2.CheckBox;
import AbstractFactory2.GUIFactory;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
