package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public YatzyStrategyTest() {
        this.categoryStrategy = new YatzyStrategy();
    }

    @Test
    public void givenDice_whenYatzy_thenReturnFiftyIfAllMatchElseZero() {
        assertEquals(50, categoryStrategy.score(new int[] {4,4,4,4,4}));
        assertEquals(50, categoryStrategy.score(new int[]{6,6,6,6,6}));
        assertEquals(0, categoryStrategy.score(new int[]{6,6,6,6,3}));
        assertEquals(50, categoryStrategy.score(new int[]{1,1,1,1,1}));
        assertEquals(0, categoryStrategy.score(new int[]{1,1,1,2,1}));
    }

}
