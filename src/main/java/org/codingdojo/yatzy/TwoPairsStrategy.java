package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.List;

public class TwoPairsStrategy extends OnePairStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        int firstPair = super.score(dice)/2;
        if (firstPair == 0) return 0;

        return 2* dice
                .stream()
                .distinct()
                .filter(d -> d != firstPair && Collections.frequency(dice, d) >= 2)
                .map(secondPair -> secondPair + firstPair)
                .findFirst()
                .orElse(0);
    }

}