package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.List;

public class OnePairStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return 2* dice
                .stream()
                .distinct()
                .filter(d -> Collections.frequency(dice, d) >= 2)
                .reduce(Integer::max)
                .orElse(0);
    }

}