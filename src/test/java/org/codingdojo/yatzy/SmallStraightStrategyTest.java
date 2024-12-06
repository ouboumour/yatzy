package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallStraightStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public SmallStraightStrategyTest() {
        this.categoryStrategy = new SmallStraightStrategy();
    }

    @Test
    public void givenDice_whenSmallStraight_thenReturnFifteenElseZero() {
        assertEquals(15, categoryStrategy.score(new int[]{1,2,3,4,5}));
        assertEquals(15, categoryStrategy.score(new int[]{2,3,4,5,1}));
        assertEquals(0, categoryStrategy.score(new int[]{1,2,2,4,5}));
    }

}