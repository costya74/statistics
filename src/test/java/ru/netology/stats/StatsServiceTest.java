package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9; // в каком месяце выполняются условия запроса
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8; // в каком месяце выполняются условия запроса
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSumSalesYear() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180; // сумма продаж за год
        int actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAvgSumSalesYear() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15; // средняя сумма продаж за год
        int actual = service.avgSalesAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldamountBelowAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountBelowAvg(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldamountAboveAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountBelowAvg(sales);
        assertEquals(expected, actual);
    }
}