package facade;

public class AudioMixer {
    public String mix(String metadata, String audio, String targetFormat) {
        return "Conversion complete: " + metadata + "; " + audio
                + "; outputFormat=" + targetFormat.toLowerCase();
    }
}
