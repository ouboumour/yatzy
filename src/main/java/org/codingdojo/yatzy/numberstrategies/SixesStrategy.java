package org.codingdojo.yatzy.numberstrategies;

import org.codingdojo.yatzy.CategoryStrategy;

import java.util.List;

public class SixesStrategy extends NumbersScorer implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return score.apply(dice, 6);
    }

}