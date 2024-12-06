package org.codingdojo.yatzy.numberstrategies;

import org.codingdojo.yatzy.CategoryStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FivesStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public FivesStrategyTest() {
        this.categoryStrategy = new FivesStrategy();
    }

    @Test
    public void givenDice_whenFives_thenReturnFivesSum() {
        assertEquals(10, categoryStrategy.score(List.of(4,4,4,5,5)));
        assertEquals(15, categoryStrategy.score(List.of(4,4,5,5,5)));
        assertEquals(20, categoryStrategy.score(List.of(4,5,5,5,5)));
    }

}