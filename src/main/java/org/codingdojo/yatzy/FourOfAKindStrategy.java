package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.stream.IntStream;

public class FourOfAKindStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return 4* IntStream
                .of(dice)
                .distinct()
                .filter(d -> Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 4)
                .findFirst()
                .orElse(0);
    }

}