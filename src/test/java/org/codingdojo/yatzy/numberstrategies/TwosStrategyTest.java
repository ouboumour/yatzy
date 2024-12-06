package org.codingdojo.yatzy.numberstrategies;

import org.codingdojo.yatzy.CategoryStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwosStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public TwosStrategyTest() {
        this.categoryStrategy = new TwosStrategy();
    }

    @Test
    public void givenDice_whenTwos_thenReturnTwosSum() {
        assertEquals(4, categoryStrategy.score(List.of(1,2,3,2,6)));
        assertEquals(10, categoryStrategy.score(List.of(2,2,2,2,2)));
        assertEquals(4, categoryStrategy.score(List.of(2,3,2,5,1)));
    }

}