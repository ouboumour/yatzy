package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.stream.IntStream;

public class ThreeOfAKindStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return 3* IntStream
                .of(dice)
                .distinct()
                .filter(d -> Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 3)
                .findFirst()
                .orElse(0);
    }

}