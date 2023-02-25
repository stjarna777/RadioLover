package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

        @Test

        public void RadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(9);
            int expected = 9;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void shouldSetRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(8);
            int expected = 8;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);

        }

        @Test
        public void shouldRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(-1);
            int expected = 0;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void shouldNotSetNewRadioStationAboveMax() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(10);
            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void shouldNotSetRadioStationAboveMax() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(9);
            int expected = 9;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetRadioStationUnderMin() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(11);
            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void shouldSetToMaxRadioStation() {
            Radio radio = new Radio();

            radio.setToMinRadioStation();
            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void shouldSetToMinRadioStation() {
            Radio radio = new Radio();

            radio.setToMaxRadioStation();
            int expected = 9;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void shouldSetVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolume(8);
            int expected = 8;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void shouldNotSetVolumeAboveMax() {
            Radio radio = new Radio();

            radio.setCurrentVolume(11);
            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void shouldSetToMaxVolume() {
            Radio radio = new Radio();

            radio.setToMaxVolume();
            int expected = 10;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void shouldSetToMinVolume() {
            Radio radio = new Radio();

            radio.setToMinVolume();
            int expected = 0;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetVolumeUnderMin() {
            Radio radio = new Radio();

            radio.setCurrentVolume(11);
            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void prevRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(4);
            radio.prevRadioStation();
            int expected = 0;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void nextRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(10);
            radio.nextRadioStation();
            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void nextNewToRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(9);
            radio.nextRadioStation();
            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void nextNewRadioStation() {
            Radio radio = new Radio();

            radio.setCurrentRadioStation(0);
            radio.nextRadioStation();
            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void newPrevStation() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(0);
            radio.prevRadioStation();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotNeedNewPrevStation() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(-1);
            radio.prevRadioStation();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void increaseToNextVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolume(4);
            radio.increaseToNextVolume();
            int expected = 5;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void increaseToNewNextVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolume(-1);
            radio.increaseToNextVolume();
            int expected = 1;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void increaseNewNextVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolume(10);
            radio.increaseToNextVolume();
            int expected = 10;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldIncreaseToPrevVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(5);

            radio.increaseToPrevVolume();
            int expected = 4;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNewIncreaseToPrevVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(-1);

            radio.increaseToPrevVolume();
            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }

