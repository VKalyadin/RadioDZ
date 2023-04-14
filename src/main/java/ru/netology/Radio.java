package ru.netology;

public class Radio {
    private int maxCurrentRadioStation = 9;
    private int minCurrentRadioStation = 0;
    private int currentRadioStation = minCurrentRadioStation;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentVolume;

    public Radio(int quantityRadioStation) {
        maxCurrentRadioStation = quantityRadioStation - 1;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation <= maxCurrentRadioStation && newCurrentRadioStation >= minCurrentRadioStation) {
            this.currentRadioStation = newCurrentRadioStation;
        }

    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
        } else {
            currentVolume = maxCurrentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume--;
        } else {
            currentVolume = minCurrentVolume;
        }

    }

}