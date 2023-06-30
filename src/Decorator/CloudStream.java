package Decorator;

public class CloudStream implements Stream{
    @Override
    public void write(String data) {
        System.out.println("Write the data to the cloud " + data);
    }
}
