package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoPairsStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public TwoPairsStrategyTest() {
        this.categoryStrategy = new TwoPairsStrategy();
    }

    @Test
    public void givenDice_whenTwoPair_thenReturnTwoPairsSum() {
        assertEquals(16, categoryStrategy.score(new int[]{3,3,5,4,5}));
        assertEquals(16, categoryStrategy.score(new int[]{3,3,5,5,5}));
        assertEquals(8, categoryStrategy.score(new int[]{1,1,2,3,3}));
        assertEquals(0, categoryStrategy.score(new int[]{1,1,2,3,4}));
        assertEquals(6, categoryStrategy.score(new int[]{1,1,2,2,2}));
        assertEquals(0, categoryStrategy.score(new int[]{3,3,3,3,1}));
        assertEquals(0, categoryStrategy.score(new int[]{1,2,3,4,5}));
    }

}