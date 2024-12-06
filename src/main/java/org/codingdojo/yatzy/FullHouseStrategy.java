package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FullHouseStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return IntStream
                .of(dice)
                .filter(d -> List.of(2, 3).contains(Collections.frequency(IntStream.of(dice).boxed().toList(), d)))
                .boxed()
                .mapToInt(Integer::intValue)
                .sum();
    }

}