package org.codingdojo.yatzy.numberofkindstrategies;

import org.codingdojo.yatzy.CategoryStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnePairStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public OnePairStrategyTest() {
        this.categoryStrategy = new OnePairStrategy();
    }

    @Test
    public void givenDice_whenOnePair_thenReturnOnePairsSum() {
        assertEquals(6, categoryStrategy.score(List.of(3,4,3,5,6)));
        assertEquals(10, categoryStrategy.score(List.of(5,3,3,3,5)));
        assertEquals(12, categoryStrategy.score(List.of(5,3,6,6,5)));
        assertEquals(0, categoryStrategy.score(List.of(1,2,3,4,5)));
        assertEquals(8, categoryStrategy.score(List.of(3,3,3,4,4)));
        assertEquals(12, categoryStrategy.score(List.of(1,1,6,2,6)));
        assertEquals(6, categoryStrategy.score(List.of(3,3,3,4,1)));
        assertEquals(6, categoryStrategy.score(List.of(3,3,3,3,1)));
    }

}