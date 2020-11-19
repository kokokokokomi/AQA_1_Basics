package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJUnit5Test {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldAdviseToBuyMore() {
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
    void shouldNotAdviseToBuyMore() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}
