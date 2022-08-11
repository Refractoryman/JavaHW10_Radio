package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void testNextRadio1() {
        Radio radio = new Radio();

        radio.setRadio(9);
        radio.nextRadio();

        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testNextRadio2() {
        Radio radio = new Radio();

        radio.setRadio(0);
        radio.nextRadio();

        int expected = 1;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNextRadio3() {
        Radio radio = new Radio();

        radio.setRadio(5);
        radio.nextRadio();

        int expected = 6;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNextRadio4() {
        Radio radio = new Radio();

        radio.setRadio(10);
        radio.nextRadio();

        int expected = 1;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevRadio1() {
        Radio radio = new Radio();

        radio.setRadio(5);
        radio.prevRadio();

        int expected = 4;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevRadio2() {
        Radio radio = new Radio();

        radio.setRadio(10);
        radio.prevRadio();

        int expected = 9;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevRadio3() {
        Radio radio = new Radio();

        radio.setRadio(0);
        radio.prevRadio();

        int expected = 9;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeUp1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeUp2() {
        Radio radio = new Radio();
        radio.setVolume(4);
        radio.volumeUp();

        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testVolumeUp3() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.volumeUp();

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeUp4() {
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.volumeUp();

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown2() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.volumeDown();

        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeDown3() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
