# Assignment 4 - Facade Pattern

A simple Java 17 console application demonstrating the Facade design pattern through media file conversion.

## How it works

`MediaConversionFacade` coordinates the conversion process. It uses `MetadataReader` to read file information, `CodecFactory` to select the appropriate codec, `BitrateReader` to process the media data, and `AudioMixer` to perform the final processing.

The client calls the facade instead of coordinating these classes directly. The subsystem classes remain independent and can still be used without the facade.

## Project structure

- `Main` starts the application and demonstrates the conversion.
- `MediaConversionFacade` provides the simplified conversion interface.
- `MetadataReader` reads media metadata.
- `CodecFactory` selects a codec for the target format.
- `BitrateReader` processes media data.
- `AudioMixer` handles the final audio processing.

## How to run

1. Open the project in IntelliJ IDEA with JDK 17.
2. Run `Main`.