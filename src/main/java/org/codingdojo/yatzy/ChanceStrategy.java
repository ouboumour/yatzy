package org.codingdojo.yatzy;

import java.util.List;

public class ChanceStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().reduce(0, Integer::sum);
    }

}