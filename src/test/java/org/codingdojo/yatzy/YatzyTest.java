package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class YatzyTest {

    @Test
    public void givenDice_whenChance_thenReturnTheSum() {
        assertEquals(15, Yatzy.chance(new int[]{2,3,4,5,1}));
        assertEquals(16, Yatzy.chance(new int[]{3,3,4,5,1}));
    }

    @Test
    public void givenDice_whenYatzy_thenReturnFiftyIfAllMatchElseZero() {
        assertEquals(50, Yatzy.yatzy(new int[] {4,4,4,4,4}));
        assertEquals(50, Yatzy.yatzy(new int[]{6,6,6,6,6}));
        assertEquals(0, Yatzy.yatzy(new int[]{6,6,6,6,3}));
    }

    @Test
    public void givenDice_whenOnes_thenReturnOnesSum() {
        assertEquals(1, Yatzy.ones(new int[]{1,2,3,4,5}));
        assertEquals(2, Yatzy.ones(new int[]{1,2,1,4,5}));
        assertEquals(0, Yatzy.ones(new int[]{6,2,2,4,5}));
        assertEquals(4, Yatzy.ones(new int[]{1,2,1,1,1}));
    }

    @Test
    public void givenDice_whenTwos_thenReturnTwosSum() {
        assertEquals(4, Yatzy.twos(new int[]{1,2,3,2,6}));
        assertEquals(10, Yatzy.twos(new int[]{2,2,2,2,2}));
    }

    @Test
    public void givenDice_whenThrees_thenReturnThreesSum() {
        assertEquals(6, Yatzy.threes(new int[]{1,2,3,2,3}));
        assertEquals(12, Yatzy.threes(new int[]{2,3,3,3,3}));
    }

    @Test
    public void givenDice_whenFours_thenReturnFoursSum() {
        assertEquals(12, Yatzy.fours(new int[]{4,4,4,5,5}));
        assertEquals(8, Yatzy.fours(new int[]{4,4,5,5,5}));
        assertEquals(4, Yatzy.fours(new int[]{4,5,5,5,5}));
    }

    @Test
    public void givenDice_whenFives_thenReturnFivesSum() {
        assertEquals(10, Yatzy.fives(new int[]{4,4,4,5,5}));
        assertEquals(15, Yatzy.fives(new int[]{4,4,5,5,5}));
        assertEquals(20, Yatzy.fives(new int[]{4,5,5,5,5}));
    }

    @Test
    public void givenDice_whenSixes_thenReturnSixesSum() {
        assertEquals(0, Yatzy.sixes(new int[]{4,4,4,5,5}));
        assertEquals(6, Yatzy.sixes(new int[]{4,4,6,5,5}));
        assertEquals(18, Yatzy.sixes(new int[]{6,5,6,6,5}));
    }

    @Test
    public void givenDice_whenOnePair_thenReturnOnePairsSum() {
        assertEquals(6, Yatzy.onePair(new int[]{3,4,3,5,6}));
        assertEquals(10, Yatzy.onePair(new int[]{5,3,3,3,5}));
        assertEquals(12, Yatzy.onePair(new int[]{5,3,6,6,5}));
    }

    @Test
    public void givenDice_whenTwoPair_thenReturnTwoPairsSum() {
        assertEquals(16, Yatzy.twoPair(new int[]{3,3,5,4,5}));
        assertEquals(16, Yatzy.twoPair(new int[]{3,3,5,5,5}));
    }

    @Test
    public void givenDice_whenThreeOfAKind_thenReturnThreeOfAKindSum() {
        assertEquals(9, Yatzy.threeOfAKind(new int[]{3,3,3,4,5}));
        assertEquals(15, Yatzy.threeOfAKind(new int[]{5,3,5,4,5}));
        assertEquals(9, Yatzy.threeOfAKind(new int[]{3,3,3,3,5}));
        assertEquals(9, Yatzy.threeOfAKind(new int[]{3,3,3,3,3}));
    }

    @Test
    public void givenDice_whenFourOfAKind_thenReturnFourOfAKindSum() {
        assertEquals(12, Yatzy.fourOfAKind(new int[]{3,3,3,3,5}));
        assertEquals(20, Yatzy.fourOfAKind(new int[]{5,5,5,4,5}));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, Yatzy.smallStraight(new int[]{1,2,3,4,5}));
        assertEquals(15, Yatzy.smallStraight(new int[]{2,3,4,5,1}));
        assertEquals(0, Yatzy.smallStraight(new int[]{1,2,2,4,5}));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, Yatzy.largeStraight(6,2,3,4,5));
        assertEquals(20, Yatzy.largeStraight(2,3,4,5,6));
        assertEquals(0, Yatzy.largeStraight(1,2,2,4,5));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, Yatzy.fullHouse(6,2,2,2,6));
        assertEquals(0, Yatzy.fullHouse(2,3,4,5,6));
    }
}
