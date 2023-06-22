package Bridge;

public abstract class UIControl {
    protected Renderer renderer;

    public UIControl(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void buttonRendered();
    public abstract void sliderRendered();

}
