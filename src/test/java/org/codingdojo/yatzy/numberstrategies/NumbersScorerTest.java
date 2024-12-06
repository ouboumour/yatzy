package org.codingdojo.yatzy.numberstrategies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersScorerTest {

    private final NumbersScorer numbersScorer;

    public NumbersScorerTest() {
        this.numbersScorer = new NumbersScorer() {};
    }

    @Test
    public void givenDice_whenOnes_thenReturnOnesSum() {
        assertEquals(1, numbersScorer.score.apply(List.of(1,2,3,4,5), 1));
        assertEquals(2, numbersScorer.score.apply(List.of(1,2,1,4,5), 1));
        assertEquals(0, numbersScorer.score.apply(List.of(6,2,2,4,5), 1));
        assertEquals(4, numbersScorer.score.apply(List.of(1,2,1,1,1), 1));
        assertEquals(0, numbersScorer.score.apply(List.of(3,3,3,4,5), 1));
    }

    @Test
    public void givenDice_whenTwos_thenReturnTwosSum() {
        assertEquals(4, numbersScorer.score.apply(List.of(1,2,3,2,6), 2));
        assertEquals(10, numbersScorer.score.apply(List.of(2,2,2,2,2), 2));
        assertEquals(4, numbersScorer.score.apply(List.of(2,3,2,5,1), 2));
    }

    @Test
    public void givenDice_whenThrees_thenReturnThreesSum() {
        assertEquals(6, numbersScorer.score.apply(List.of(1,2,3,2,3), 3));
        assertEquals(12, numbersScorer.score.apply(List.of(2,3,3,3,3), 3));
    }

    @Test
    public void givenDice_whenFours_thenReturnFoursSum() {
        assertEquals(12, numbersScorer.score.apply(List.of(4,4,4,5,5), 4));
        assertEquals(8, numbersScorer.score.apply(List.of(4,4,5,5,5), 4));
        assertEquals(4, numbersScorer.score.apply(List.of(4,5,5,5,5), 4));
        assertEquals(8, numbersScorer.score.apply(List.of(1,1,2,4,4), 4));
    }

    @Test
    public void givenDice_whenFives_thenReturnFivesSum() {
        assertEquals(10, numbersScorer.score.apply(List.of(4,4,4,5,5), 5));
        assertEquals(15, numbersScorer.score.apply(List.of(4,4,5,5,5), 5));
        assertEquals(20, numbersScorer.score.apply(List.of(4,5,5,5,5), 5));
    }

    @Test
    public void givenDice_whenSixes_thenReturnSixesSum() {
        assertEquals(0, numbersScorer.score.apply(List.of(4,4,4,5,5), 6));
        assertEquals(6, numbersScorer.score.apply(List.of(4,4,6,5,5), 6));
        assertEquals(18, numbersScorer.score.apply(List.of(6,5,6,6,5), 6));
    }

}