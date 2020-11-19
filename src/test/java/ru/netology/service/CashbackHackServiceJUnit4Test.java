package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class CashbackHackServiceJUnit4Test {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviseToBuyMore() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdviseToBuyMoreIfMoreThanThousand() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAdviseToBuyMore() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
