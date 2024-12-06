package org.codingdojo.yatzy;

import java.util.stream.IntStream;

public class FivesStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return IntStream.of(dice).filter(d -> d == 5).sum();
    }

}