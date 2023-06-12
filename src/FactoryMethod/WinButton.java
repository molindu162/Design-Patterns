package FactoryMethod;

public class WinButton implements Button{
    @Override
    public void render() {
        System.out.println("Win Button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Win Button on click");
    }
}
