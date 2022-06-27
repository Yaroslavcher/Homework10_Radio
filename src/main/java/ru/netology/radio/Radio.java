package ru.netology.radio;

public class Radio {
    private int numOfStations = 10;
    private int currentStation;

    public Radio(int numOfStations) {       //Конструктор принимает желаемое количество станций
        this.numOfStations = numOfStations;
    }

    public Radio() {                        //Этот конструктор используется, если пользователь не изменит значение numOfStations
    }

    int maxStation = numOfStations - 1;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {  //сеттер текущей станции
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    private int currentVolume;

    public void setCurrentVolume(int newVolume) {   //Сеттер текущей громкости
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
