package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargeStraightStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public LargeStraightStrategyTest() {
        this.categoryStrategy = new LargeStraightStrategy();
    }

    @Test
    public void givenDice_whenLargeStraight_thenReturnTwentyElseZero() {
        assertEquals(20, categoryStrategy.score(List.of(6,2,3,4,5)));
        assertEquals(20, categoryStrategy.score(List.of(2,3,4,5,6)));
        assertEquals(0, categoryStrategy.score(List.of(1,2,2,4,5)));
    }

}