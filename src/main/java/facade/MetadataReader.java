package facade;

public class MetadataReader {
    public String read(String fileName) {
        String extension = fileName.contains(".")
                ? fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase()
                : "unknown";
        return "metadata[file=" + fileName + ", sourceFormat=" + extension + "]";
    }
}
