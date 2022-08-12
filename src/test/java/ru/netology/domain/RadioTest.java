package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    Radio radioNetology = new Radio();

    @Test
    public void shouldGetCurrentRadioStation() {
        radioNetology.setCurrentRadioStation(0);
        radioNetology.setCurrentRadioStation(-1);
        radioNetology.setCurrentRadioStation(11);

        Assertions.assertEquals(0, radioNetology.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {
        radioNetology.setCurrentRadioStation(0);
        radioNetology.nextRadioStation();
        Assertions.assertEquals(1, radioNetology.getCurrentRadioStation());

        radioNetology.setCurrentRadioStation(10);
        radioNetology.nextRadioStation();
        Assertions.assertEquals(0, radioNetology.getCurrentRadioStation());

        radioNetology.setCurrentRadioStation(-1);
        radioNetology.nextRadioStation();
        Assertions.assertEquals(0, radioNetology.getCurrentRadioStation());

        radioNetology.setCurrentRadioStation(11);
        radioNetology.nextRadioStation();
        Assertions.assertEquals(1, radioNetology.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        radioNetology.setCurrentRadioStation(0);
        radioNetology.prevRadioStation();
        Assertions.assertEquals(10, radioNetology.getCurrentRadioStation());

        radioNetology.setCurrentRadioStation(10);
        radioNetology.prevRadioStation();
        Assertions.assertEquals(9, radioNetology.getCurrentRadioStation());
    }

    @Test
    public void shouldGetToMaxRadioStation() {
        Assertions.assertEquals(10, radioNetology.getMaxRadioStation());
    }

    @Test
    public void shouldSetMinRadioStation() {
        radioNetology.setMinRadioStation(0);
        radioNetology.setMinRadioStation(-1);
        radioNetology.setMinRadioStation(10);
        radioNetology.setMinRadioStation(11);
        Assertions.assertEquals(11, radioNetology.getMinRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        radioNetology.setCurrentVolume(101);
        Assertions.assertEquals(0, radioNetology.getCurrentVolume());

        radioNetology.setCurrentVolume(5);
        Assertions.assertEquals(5, radioNetology.getCurrentVolume());

        radioNetology.setCurrentVolume(-1);
        Assertions.assertEquals(100, radioNetology.getCurrentVolume());
    }

    @Test
    public void shouldGetMinVolume() {
        Assertions.assertEquals(100, radioNetology.getMinVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radioNetology.setMaxVolume(100);
        radioNetology.setMinVolume(1);
        Assertions.assertEquals(1, radioNetology.getMinVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radioNetology.setMinVolume(1);
        radioNetology.setMaxVolume(101);
        Assertions.assertEquals(101, radioNetology.getMaxVolume());
    }

    @Test
    public void shouldVolumeUp() {
        radioNetology.setCurrentVolume(6);
        radioNetology.volumeUp();
        Assertions.assertEquals(7, radioNetology.getCurrentVolume());

        radioNetology.setCurrentVolume(100);
        radioNetology.volumeUp();
        Assertions.assertEquals(0, radioNetology.getCurrentVolume());

        radioNetology.setCurrentVolume(0);
        radioNetology.volumeUp();
        Assertions.assertEquals(1, radioNetology.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        radioNetology.setCurrentVolume(9);
        radioNetology.volumeDown();
        Assertions.assertEquals(8, radioNetology.getCurrentVolume());

        radioNetology.setCurrentVolume(0);
        radioNetology.volumeDown();
        Assertions.assertEquals(99, radioNetology.getCurrentVolume());
    }
}
