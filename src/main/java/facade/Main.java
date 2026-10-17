package facade;

public class Main {
    public static void main(String[] args) {
        MediaConversionFacade converter = new MediaConversionFacade();

        String result = converter.convert("lecture.wav", "mp3");
        System.out.println(result);
    }
}
