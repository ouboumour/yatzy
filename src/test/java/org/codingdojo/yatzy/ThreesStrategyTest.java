package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreesStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public ThreesStrategyTest() {
        this.categoryStrategy = new ThreesStrategy();
    }

    @Test
    public void givenDice_whenThrees_thenReturnThreesSum() {
        assertEquals(6, categoryStrategy.score(List.of(1,2,3,2,3)));
        assertEquals(12, categoryStrategy.score(List.of(2,3,3,3,3)));
    }

}
