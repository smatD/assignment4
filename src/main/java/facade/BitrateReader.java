package facade;

public class BitrateReader {
    public String readAndConvert(String fileName, String codec) {
        return "converted-audio[" + fileName + " -> " + codec + "]";
    }
}
