package org.codingdojo.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

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