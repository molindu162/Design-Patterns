package AbstractFactory2.Mac;

import AbstractFactory2.*;
import AbstractFactory2.Windows.WinButton;
import AbstractFactory2.Windows.WinCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
