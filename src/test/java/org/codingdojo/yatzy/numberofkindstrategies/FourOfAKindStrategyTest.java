package org.codingdojo.yatzy.numberofkindstrategies;

import org.codingdojo.yatzy.CategoryStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourOfAKindStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public FourOfAKindStrategyTest() {
        this.categoryStrategy = new FourOfAKindStrategy();
    }

    @Test
    public void givenDice_whenFourOfAKind_thenReturnFourOfAKindSum() {
        assertEquals(12, categoryStrategy.score(List.of(3,3,3,3,5)));
        assertEquals(20, categoryStrategy.score(List.of(5,5,5,4,5)));
        assertEquals(8, categoryStrategy.score(List.of(2,2,2,2,5)));
        assertEquals(0, categoryStrategy.score(List.of(2,2,2,5,5)));
        assertEquals(8, categoryStrategy.score(List.of(2,2,2,2,2)));
    }

}