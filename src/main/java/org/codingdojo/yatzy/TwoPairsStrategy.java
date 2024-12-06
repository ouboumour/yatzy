package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.stream.IntStream;

public class TwoPairsStrategy extends OnePairStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        int firstPair = super.score(dice)/2;
        if (firstPair == 0) return 0;

        return 2* IntStream
                .of(dice)
                .distinct()
                .filter(d -> d != firstPair && Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 2)
                .map(secondPair -> secondPair + firstPair)
                .findFirst()
                .orElse(0);
    }

}