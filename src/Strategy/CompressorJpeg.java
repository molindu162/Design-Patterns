package Strategy;

public class CompressorJpeg implements Compressor{
    @Override
    public void compress() {
        System.out.println("Compressed using jpeg");
    }
}
