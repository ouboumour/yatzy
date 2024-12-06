package org.codingdojo.yatzy;

import java.util.List;
import java.util.stream.Collectors;

public class SmallStraightStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice
                .stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining()).equals("12345") ? 15 : 0;
    }

}