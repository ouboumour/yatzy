package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.List;

public class FullHouseStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice
                .stream()
                .filter(d -> List.of(2, 3).contains(Collections.frequency(dice, d)))
                .reduce(0, Integer::sum);
    }

}