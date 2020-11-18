package ru.netology.service;

import static org.testng.AssertJUnit.*;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldAdviseToBuyMore() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void shouldNotAdviseToBuyMore() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
