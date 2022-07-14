package ru.netology.radio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio station = new Radio(20);

/*    @BeforeEach
    public void b4EachTest() {
        station.setMaxStation(20);
    }*/

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStation.csv")
    public void shouldSetStation(int newCurrentStation, int expected) {
        station.setCurrentStation(newCurrentStation);

        assertEquals(expected, station.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void shouldNextStation(int newCurrentStation, int expected) {
        station.setCurrentStation(newCurrentStation);
        station.next();
        assertEquals(expected, station.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.csv")
    public void shouldPrevStation(int newCurrentStation, int expected) {
        station.setCurrentStation(newCurrentStation);

        station.prev();

        assertEquals(expected, station.getCurrentStation());
    }
}



