package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.List;

public class ThreeOfAKindStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return 3 * dice
                .stream()
                .distinct()
                .filter(d -> Collections.frequency(dice, d) >= 3)
                .findFirst()
                .orElse(0);
    }

}