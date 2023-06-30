package Decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed = new CompressedCloudStream(stream);
        String compressedData = compressed.compress(data);
        stream.write(compressedData);
    }

    private String compress(String data){
        System.out.println("Data Compressed");
        return data.substring(0, 4);
    }

}
