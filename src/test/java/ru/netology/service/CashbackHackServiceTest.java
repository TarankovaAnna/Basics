package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldBuyFor800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(expected,actual);


    }

    @Test
    public void shouldBuyFor0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}