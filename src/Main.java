import Decorator.CloudStream;
import Decorator.Encrypted;

public class Main {
    public static void main (String[] args){
        CloudStream cloudStream = new CloudStream();
        Encrypted encrypted = new Encrypted(cloudStream);
        cloudStream.write("Molindu123");
    }
}
