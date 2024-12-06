package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FivesStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public FivesStrategyTest() {
        this.categoryStrategy = new FivesStrategy();
    }

    @Test
    public void givenDice_whenFives_thenReturnFivesSum() {
        assertEquals(10, categoryStrategy.score(new int[]{4,4,4,5,5}));
        assertEquals(15, categoryStrategy.score(new int[]{4,4,5,5,5}));
        assertEquals(20, categoryStrategy.score(new int[]{4,5,5,5,5}));
    }
}