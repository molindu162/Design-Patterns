package FactoryMethod;

public abstract class Dialog {
    public void render(){
        System.out.println("Render Dialog");
    }

    public abstract Button createButton();
}
