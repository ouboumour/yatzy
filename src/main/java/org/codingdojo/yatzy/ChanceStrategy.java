package org.codingdojo.yatzy;

import java.util.stream.IntStream;

public class ChanceStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return IntStream.of(dice).sum();
    }

}