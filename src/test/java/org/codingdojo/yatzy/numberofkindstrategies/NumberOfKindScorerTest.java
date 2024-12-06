package org.codingdojo.yatzy.numberofkindstrategies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfKindScorerTest {

    private final NumberOfKindScorer numberOfKindScorer;

    public NumberOfKindScorerTest() {
        this.numberOfKindScorer = new NumberOfKindScorer() {};
    }

    @Test
    public void givenDice_whenOnePair_thenReturnOnePairsSum() {
        assertEquals(6, numberOfKindScorer.score.apply(List.of(3,4,3,5,6), 2));
        assertEquals(10, numberOfKindScorer.score.apply(List.of(5,3,3,3,5), 2));
        assertEquals(12, numberOfKindScorer.score.apply(List.of(5,3,6,6,5), 2));
        assertEquals(0, numberOfKindScorer.score.apply(List.of(1,2,3,4,5), 2));
        assertEquals(8, numberOfKindScorer.score.apply(List.of(3,3,3,4,4), 2));
        assertEquals(12, numberOfKindScorer.score.apply(List.of(1,1,6,2,6), 2));
        assertEquals(6, numberOfKindScorer.score.apply(List.of(3,3,3,4,1), 2));
        assertEquals(6, numberOfKindScorer.score.apply(List.of(3,3,3,3,1), 2));
    }

    @Test
    public void givenDice_whenThreeOfAKind_thenReturnThreeOfAKindSum() {
        assertEquals(9, numberOfKindScorer.score.apply(List.of(3,3,3,4,5), 3));
        assertEquals(15, numberOfKindScorer.score.apply(List.of(5,3,5,4,5), 3));
        assertEquals(9, numberOfKindScorer.score.apply(List.of(3,3,3,3,5), 3));
        assertEquals(9, numberOfKindScorer.score.apply(List.of(3,3,3,3,3), 3));
        assertEquals(0, numberOfKindScorer.score.apply(List.of(3,3,4,5,6), 3));
        assertEquals(9, numberOfKindScorer.score.apply(List.of(3,3,3,3,1), 3));
    }

    @Test
    public void givenDice_whenFourOfAKind_thenReturnFourOfAKindSum() {
        assertEquals(12, numberOfKindScorer.score.apply(List.of(3,3,3,3,5), 4));
        assertEquals(20, numberOfKindScorer.score.apply(List.of(5,5,5,4,5), 4));
        assertEquals(8, numberOfKindScorer.score.apply(List.of(2,2,2,2,5), 4));
        assertEquals(0, numberOfKindScorer.score.apply(List.of(2,2,2,5,5), 4));
        assertEquals(8, numberOfKindScorer.score.apply(List.of(2,2,2,2,2), 4));
    }

}