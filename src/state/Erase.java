package state;

public class Erase implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Erase Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erased");
    }
}
