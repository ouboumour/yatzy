package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FullHouseStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public FullHouseStrategyTest() {
        this.categoryStrategy = new FullHouseStrategy();
    }

    @Test
    public void givenDice_whenFullHouse_thenReturnTheSum() {
        assertEquals(18, categoryStrategy.score(new int[]{6,2,2,2,6}));
        assertEquals(0, categoryStrategy.score(new int[]{2,3,4,5,6}));
    }

}