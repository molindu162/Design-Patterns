package Decorator;

public class Encrypted implements Stream{
    Stream stream;

    public Encrypted(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = new Encrypted(stream);
        String encryptedData = encrypted.encrypt();
        stream.write(encryptedData);
    }

    private String encrypt(){
        System.out.println("Data encrypted");
        return "!@/^7?)*(&%$#$6*";
    }
}
