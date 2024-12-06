package org.codingdojo.yatzy;

import java.util.List;
import java.util.stream.Collectors;

public class LargeStraightStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice
                .stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining()).equals("23456") ? 20 : 0;
    }

}
