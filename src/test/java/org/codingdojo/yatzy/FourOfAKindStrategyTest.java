package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourOfAKindStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public FourOfAKindStrategyTest() {
        this.categoryStrategy = new FourOfAKindStrategy();
    }

    @Test
    public void givenDice_whenFourOfAKind_thenReturnFourOfAKindSum() {
        assertEquals(12, categoryStrategy.score(new int[]{3,3,3,3,5}));
        assertEquals(20, categoryStrategy.score(new int[]{5,5,5,4,5}));
        assertEquals(8, categoryStrategy.score(new int[]{2,2,2,2,5}));
        assertEquals(0, categoryStrategy.score(new int[]{2,2,2,5,5}));
        assertEquals(8, categoryStrategy.score(new int[]{2,2,2,2,2}));
    }

}