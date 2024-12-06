package org.codingdojo.yatzy;

import java.util.List;

public class ThreesStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().filter(d -> d == 3).reduce(0, Integer::sum);
    }

}
