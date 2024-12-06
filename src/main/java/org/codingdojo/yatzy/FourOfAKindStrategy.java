package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.List;

public class FourOfAKindStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return 4 * dice
                .stream()
                .distinct()
                .filter(d -> Collections.frequency(dice, d) >= 4)
                .findFirst()
                .orElse(0);
    }

}