package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeOfAKindStrategyTest {

    private final CategoryStrategy categoryStrategy;

    public ThreeOfAKindStrategyTest() {
        this.categoryStrategy = new ThreeOfAKindStrategy();
    }

    @Test
    public void givenDice_whenThreeOfAKind_thenReturnThreeOfAKindSum() {
        assertEquals(9, categoryStrategy.score(List.of(3,3,3,4,5)));
        assertEquals(15, categoryStrategy.score(List.of(5,3,5,4,5)));
        assertEquals(9, categoryStrategy.score(List.of(3,3,3,3,5)));
        assertEquals(9, categoryStrategy.score(List.of(3,3,3,3,3)));
        assertEquals(0, categoryStrategy.score(List.of(3,3,4,5,6)));
        assertEquals(9, categoryStrategy.score(List.of(3,3,3,3,1)));
    }

}