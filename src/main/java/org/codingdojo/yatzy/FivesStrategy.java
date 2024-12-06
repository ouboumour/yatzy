package org.codingdojo.yatzy;

import java.util.List;

public class FivesStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().filter(d -> d == 5).reduce(0, Integer::sum);
    }

}