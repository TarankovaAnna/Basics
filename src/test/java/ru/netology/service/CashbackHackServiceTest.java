package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void shouldBuyFor800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }

    @Test
    void shouldBuyFor0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    void shouldBuyFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}