package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    assertEquals(12, service.findMax(new long[]{12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12}));
    assertEquals(12, service.findMax(new long[]{11, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12}));
  }
}