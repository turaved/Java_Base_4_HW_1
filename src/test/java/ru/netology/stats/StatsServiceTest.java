package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateTotalSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateTotalSum(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateAverageSalePerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverageSalePerMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateMaxMonthIndex() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.calculateMaxSaleMonthIndex(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateMinMonthIndex() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.calculateMinSaleMonthIndex(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateLessAverageSalePerMonthAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateLessAverageSalePerMonthAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalculateGreaterAverageSalePerMonthAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateGreaterAverageSalePerMonthAmount(sales);

        assertEquals(expected, actual);
    }

    }


