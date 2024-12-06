package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public ChanceStrategyTest() {
        this.categoryStrategy = new ChanceStrategy();
    }

    @Test
    public void givenDice_whenChance_thenReturnTheSum() {
        assertEquals(15, categoryStrategy.score(new int[]{2,3,4,5,1}));
        assertEquals(16, categoryStrategy.score(new int[]{3,3,4,5,1}));
        assertEquals(14, categoryStrategy.score(new int[]{1,1,3,3,6}));
        assertEquals(21, categoryStrategy.score(new int[]{4,5,5,6,1}));
    }

}