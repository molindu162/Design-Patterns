package Strategy;

public class FilterHighContrast implements Filter{
    @Override
    public void filter() {
        System.out.println("Applying high-contrast filter");
    }
}
