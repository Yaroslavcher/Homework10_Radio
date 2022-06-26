package ru.netology.radio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetStationIfMax() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationBelowLimit() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationOverLimit() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationIfMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationIfMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStationIfMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStationIfMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeUp() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.volumeUp();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeUpIfMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.volumeUp();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeDownIfMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.volumeDown();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeDownIfMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.volumeDown();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }
}



