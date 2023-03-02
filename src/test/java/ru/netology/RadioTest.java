package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void TestToRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);

        Assertions.assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    public void nextTestRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevTestRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevCurrentRadioStation();
        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void nextCurrentStationTestNormalRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevCurrentStationTestNormalRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prevCurrentRadioStation();
        Assertions.assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevCurrentRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void remoteCurrentStationTestNormalRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.remoteCurrentRadioStation(6);
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.remoteCurrentRadioStation(10);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void remoteCurrentStationTestUndereMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.remoteCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.nextCurrentVolume();
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextCurrentVolume();
        Assertions.assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.prevCurrentVolume();
        Assertions.assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void prevVolumeTestMinBorderVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.prevCurrentVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void nextVolumeTestMaxBorderVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.nextCurrentVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void nextVolumeTestToMaxBorderVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.nextCurrentVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void setMaxRadioStationTest() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void setMinRadioStationTest() {
        Radio radio = new Radio();
        radio.setMinRadioStation(0);
        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void setCurrentStationTestOverMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(80);
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentStationTestUnderMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void setMaxVolumeTest() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        Assertions.assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeTest() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);
        radio.nextCurrentVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }
}

