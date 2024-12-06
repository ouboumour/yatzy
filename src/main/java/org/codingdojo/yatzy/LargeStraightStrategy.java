package org.codingdojo.yatzy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargeStraightStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return IntStream
                .of(dice)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()).equals("23456") ? 20 : 0;
    }

}
