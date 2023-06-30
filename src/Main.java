import Decorator.CloudStream;
import Decorator.EncryptedCloudStream;

public class Main {
    public static void main (String[] args){
        CloudStream cloudStream = new CloudStream();
        EncryptedCloudStream encrypted = new EncryptedCloudStream(cloudStream);
        encrypted.write("Molindu123");
    }
}
