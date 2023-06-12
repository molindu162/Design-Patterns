package FactoryMethod;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Mac Button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Mac Button on click");
    }
}
