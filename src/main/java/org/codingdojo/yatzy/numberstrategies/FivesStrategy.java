package org.codingdojo.yatzy.numberstrategies;

import org.codingdojo.yatzy.CategoryStrategy;

import java.util.List;

public class FivesStrategy extends NumbersScorer implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return score.apply(dice, 5);
    }

}