package ru.netology.radio;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    Radio volume = new Radio();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volumeUp.csv")
    public void shouldVolumeUp(int newVolume, int expected) {
        volume.setCurrentVolume(newVolume);

        volume.volumeUp();

        assertEquals(expected, volume.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volumeDown.csv")
    public void shouldVolumeDown(int newVolume, int expected) {
        volume.setCurrentVolume(newVolume);

        volume.volumeDown();

        assertEquals(expected, volume.getCurrentVolume());
    }
}
