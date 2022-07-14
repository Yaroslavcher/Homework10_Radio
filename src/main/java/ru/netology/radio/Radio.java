package ru.netology.radio;

public class Radio {
    final int numOfStations;
    private int currentStation;
    /*    private int maxStation;*/
    private int currentVolume;

    public Radio(int numOfStations) {
        this.numOfStations = numOfStations; //Конструктор принимает желаемое количество станций
    }

    public Radio() {
        this.numOfStations = 20;            //Этот конструктор используется, если пользователь не изменит значение numOfStations
    }

    public int getCurrentStation() {
        return currentStation;
    }

/*    public void setMaxStation(int numOfStations) {
        this.maxStation = numOfStations - 1;
    }*/

    public void setCurrentStation(int newCurrentStation) {  //сеттер текущей станции
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > numOfStations - 1) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == numOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = numOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int newVolume) {           //Сеттер текущей громкости
        currentVolume = newVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
