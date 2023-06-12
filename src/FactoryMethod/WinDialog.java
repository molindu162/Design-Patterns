package FactoryMethod;

public class WinDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
