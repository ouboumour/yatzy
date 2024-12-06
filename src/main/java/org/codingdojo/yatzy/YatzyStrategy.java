package org.codingdojo.yatzy;

import java.util.List;

public class YatzyStrategy implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().distinct().count() == 1 ? 50 : 0;
    }

}