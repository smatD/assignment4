package facade;

public class MediaConversionFacade {
    private final MetadataReader metadataReader = new MetadataReader();
    private final CodecFactory codecFactory = new CodecFactory();
    private final BitrateReader bitrateReader = new BitrateReader();
    private final AudioMixer audioMixer = new AudioMixer();

    public String convert(String fileName, String targetFormat) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("File name cannot be empty");
        }
        if (targetFormat == null || targetFormat.isBlank()) {
            throw new IllegalArgumentException("Target format cannot be empty");
        }

        String metadata = metadataReader.read(fileName);
        String codec = codecFactory.createCodec(targetFormat);
        String audio = bitrateReader.readAndConvert(fileName, codec);
        return audioMixer.mix(metadata, audio, targetFormat);
    }
}
