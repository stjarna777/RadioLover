package ru.netology;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int RadioStation = minRadioStation;
    private int sizeRadioStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int Volume = minVolume;

    public Radio() {
    }

    public Radio(int size) {
        this.sizeRadioStation = size - 1;
        maxRadioStation = minRadioStation + sizeRadioStation;
    }

    // Радиостанция
    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return RadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        this.RadioStation = newCurrentRadioStation;
    }


    public void nextCurrentRadioStation() {
        int currentRadioStation = this.RadioStation;
        if (currentRadioStation >= maxRadioStation) {
            this.RadioStation = minRadioStation;
        } else {
            this.RadioStation = currentRadioStation + 1;
        }
    }

    public void prevCurrentRadioStation() {
        int currentRadioStation = this.RadioStation;
        if (currentRadioStation <= minRadioStation) {
            this.RadioStation = maxRadioStation;
        } else {
            this.RadioStation = currentRadioStation - 1;
        }
    }

    public void remoteCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.RadioStation = maxRadioStation;
        } else if (currentRadioStation < minRadioStation) {
            this.RadioStation = minRadioStation;
        } else {
            this.RadioStation = currentRadioStation;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return Volume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.Volume = currentVolume;
    }

    public void nextCurrentVolume() {
        int currentVolume = this.Volume;
        if (currentVolume >= maxVolume) {
            this.Volume = maxVolume;
        } else {
            this.Volume = currentVolume + 1;
        }
    }

    public void prevCurrentVolume() {
        int currentVolume = this.Volume;
        if (currentVolume <= minVolume) {
            this.Volume = minVolume;
        } else {
            this.Volume = currentVolume - 1;
        }
    }
}