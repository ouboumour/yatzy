package org.codingdojo.yatzy;

import java.util.List;

public class OnesStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().filter(d -> d == 1).reduce(0, Integer::sum);
    }

}