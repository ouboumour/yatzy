package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SixesStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public SixesStrategyTest() {
        this.categoryStrategy = new SixesStrategy();
    }

    @Test
    public void givenDice_whenSixes_thenReturnSixesSum() {
        assertEquals(0, categoryStrategy.score(new int[]{4,4,4,5,5}));
        assertEquals(6, categoryStrategy.score(new int[]{4,4,6,5,5}));
        assertEquals(18, categoryStrategy.score(new int[]{6,5,6,6,5}));
    }

}