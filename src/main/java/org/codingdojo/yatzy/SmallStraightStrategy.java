package org.codingdojo.yatzy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallStraightStrategy implements CategoryStrategy {

    @Override
    public int score(int[] dice) {
        return IntStream
                .of(dice)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()).equals("12345") ? 15 : 0;
    }

}