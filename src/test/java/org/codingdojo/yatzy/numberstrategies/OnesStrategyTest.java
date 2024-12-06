package org.codingdojo.yatzy.numberstrategies;

import org.codingdojo.yatzy.CategoryStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnesStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public OnesStrategyTest() {
        this.categoryStrategy = new OnesStrategy();
    }

    @Test
    public void givenDice_whenOnes_thenReturnOnesSum() {
        assertEquals(1, categoryStrategy.score(List.of(1,2,3,4,5)));
        assertEquals(2, categoryStrategy.score(List.of(1,2,1,4,5)));
        assertEquals(0, categoryStrategy.score(List.of(6,2,2,4,5)));
        assertEquals(4, categoryStrategy.score(List.of(1,2,1,1,1)));
        assertEquals(0, categoryStrategy.score(List.of(3,3,3,4,5)));
    }

}