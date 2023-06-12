package Strategy;

public class CompressorPng implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressed using png");
    }
}
