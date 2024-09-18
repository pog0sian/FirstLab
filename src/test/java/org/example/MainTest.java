package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzbuzz() {
        int n = 1;
        List<String> list = Main.fizzBuzz(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");

        assertEquals(expected, list);
    }

    @Test
    void reverse() {
        String expected = "llatsni ekam";

        assertEquals(expected, Main.Reverse("make install"));
    }


    @Test
    void discrimant() {

        List<String> list = Main.Discrimant(1, -2,-3);
        List<String> expected = new ArrayList<>();
        expected.add("3.0");
        expected.add("-1.0");

        assertEquals(expected, list);
    }

    @Test
    void seriesSum() {

        List<String> list = Main.seriesSum();
        List<String> expected = new ArrayList<>();

        expected.add("0.6101121094474383");

        assertEquals(expected, list);
    }


    @Test
    void palindrom() {

        boolean list1 = Main.palindrom("mam");
        boolean list2 = Main.palindrom("man");

        assertEquals(true, list1);
        assertEquals(false, list2);

    }
}