package ru.netology.radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio station = new Radio();

    //    int setStation = station.setCurrentStation();
    /*    @ParameterizedTest*/
/*    @CsvSource({
        "-1",0
        "0",0
        "1",1
        "8",8
        "9",9
        "10",0
    })*/
    /*    @CsvFileSource(files="src/test/resources/setStation.csv")*/
    @Test
    public void shouldNotSetStationBelowMin() {
        station.setCurrentStation(-1);

        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfMin() {
        station.setCurrentStation(0);

        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfMinPlusOne() {
        station.setCurrentStation(1);

        assertEquals(1, station.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfMaxMinusOne() {
        station.setCurrentStation(8);

        assertEquals(8, station.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfMax() {
        station.setCurrentStation(9);

        assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfOverMax() {
        station.setCurrentStation(10);

        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldNextIfMax() {
        station.setCurrentStation(9);

        station.next();

        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldNextIfMin() {
        station.setCurrentStation(0);

        station.next();

        assertEquals(1, station.getCurrentStation());
    }

    @Test
    public void shouldPrevIfMin() {
        station.setCurrentStation(0);

        station.prev();

        assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void shouldPrevIfMax() {
        station.setCurrentStation(9);

        station.prev();

        assertEquals(8, station.getCurrentStation());
    }

    Radio volume = new Radio();

    @Test
    public void shouldVolumeUp() {
        volume.setCurrentVolume(99);

        volume.volumeUp();

        assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUpIfMax() {
        volume.setCurrentVolume(100);

        volume.volumeUp();

        assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDownIfMax() {
        volume.setCurrentVolume(100);

        volume.volumeDown();

        assertEquals(99, volume.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDownIfMin() {
        volume.setCurrentVolume(0);

        volume.volumeDown();

        assertEquals(0, volume.getCurrentVolume());
    }
}



