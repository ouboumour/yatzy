package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoursStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public FoursStrategyTest() {
        this.categoryStrategy = new FoursStrategy();
    }

    @Test
    public void givenDice_whenFours_thenReturnFoursSum() {
        assertEquals(12, categoryStrategy.score(new int[]{4,4,4,5,5}));
        assertEquals(8, categoryStrategy.score(new int[]{4,4,5,5,5}));
        assertEquals(4, categoryStrategy.score(new int[]{4,5,5,5,5}));
        assertEquals(8, categoryStrategy.score(new int[]{1,1,2,4,4}));
    }

}