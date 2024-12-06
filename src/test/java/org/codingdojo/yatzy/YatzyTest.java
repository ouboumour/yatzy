package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @Test
    public void givenDice_whenThreeOfAKind_thenReturnThreeOfAKindSum() {
        assertEquals(9, Yatzy.threeOfAKind(new int[]{3,3,3,4,5}));
        assertEquals(15, Yatzy.threeOfAKind(new int[]{5,3,5,4,5}));
        assertEquals(9, Yatzy.threeOfAKind(new int[]{3,3,3,3,5}));
        assertEquals(9, Yatzy.threeOfAKind(new int[]{3,3,3,3,3}));
        assertEquals(0, Yatzy.threeOfAKind(new int[]{3,3,4,5,6}));
        assertEquals(9, Yatzy.threeOfAKind(new int[]{3,3,3,3,1}));
    }

    @Test
    public void givenDice_whenFourOfAKind_thenReturnFourOfAKindSum() {
        assertEquals(12, Yatzy.fourOfAKind(new int[]{3,3,3,3,5}));
        assertEquals(20, Yatzy.fourOfAKind(new int[]{5,5,5,4,5}));
        assertEquals(8, Yatzy.fourOfAKind(new int[]{2,2,2,2,5}));
        assertEquals(0, Yatzy.fourOfAKind(new int[]{2,2,2,5,5}));
        assertEquals(8, Yatzy.fourOfAKind(new int[]{2,2,2,2,2}));
    }

    @Test
    public void givenDice_whenSmallStraight_thenReturnFifteenElseZero() {
        assertEquals(15, Yatzy.smallStraight(new int[]{1,2,3,4,5}));
        assertEquals(15, Yatzy.smallStraight(new int[]{2,3,4,5,1}));
        assertEquals(0, Yatzy.smallStraight(new int[]{1,2,2,4,5}));
    }

    @Test
    public void givenDice_whenLargeStraight_thenReturnTwentyElseZero() {
        assertEquals(20, Yatzy.largeStraight(new int[]{6,2,3,4,5}));
        assertEquals(20, Yatzy.largeStraight(new int[]{2,3,4,5,6}));
        assertEquals(0, Yatzy.largeStraight(new int[]{1,2,2,4,5}));
    }

    @Test
    public void givenDice_whenFullHouse_thenReturnTheSum() {
        assertEquals(18, Yatzy.fullHouse(new int[]{6,2,2,2,6}));
        assertEquals(0, Yatzy.fullHouse(new int[]{2,3,4,5,6}));
    }

}