package facade;

public class CodecFactory {
    public String createCodec(String targetFormat) {
        String format = targetFormat.toLowerCase();
        if (!format.equals("mp3") && !format.equals("wav") && !format.equals("aac")) {
            throw new IllegalArgumentException("Unsupported format: " + targetFormat);
        }
        return format + "-codec";
    }
}
