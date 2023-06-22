package Bridge;

public class WindowsRenderer implements Renderer{
    @Override
    public void renderButton() {
        System.out.println("Button rendered");
    }

    @Override
    public void renderSlider() {
        System.out.println("Slider rendered");
    }
}
