package org.codingdojo.yatzy.numberofkindstrategies;

import org.codingdojo.yatzy.CategoryStrategy;

import java.util.List;

public class ThreeOfAKindStrategy extends NumberOfKindScorer implements CategoryStrategy {

    @Override
    public int score(List<Integer> dice) {
        return score.apply(dice, 3);
    }

}