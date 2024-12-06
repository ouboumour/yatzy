package org.codingdojo.yatzy;

import java.util.stream.IntStream;

public class YatzyStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return IntStream.of(dice).distinct().count() == 1 ? 50 : 0;
    }

}
