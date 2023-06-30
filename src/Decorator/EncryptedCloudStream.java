package Decorator;

public class EncryptedCloudStream implements Stream{
    Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = new EncryptedCloudStream(stream);
        String encryptedData = encrypted.encrypt();
        stream.write(encryptedData);
    }

    private String encrypt(){
        System.out.println("Data encrypted");
        return "!@/^7?)*(&%$#$6*";
    }
}
