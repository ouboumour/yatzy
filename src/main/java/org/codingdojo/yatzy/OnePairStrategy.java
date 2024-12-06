package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.stream.IntStream;

public class OnePairStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return 2* IntStream
                .of(dice)
                .distinct()
                .filter(d -> Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 2)
                .max()
                .orElse(0);
    }

}