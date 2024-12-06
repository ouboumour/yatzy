package org.codingdojo.yatzy.numberstrategies;

import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;

public abstract class NumbersScorer {

    BiFunction<List<Integer>, Integer, Integer> score =
            (List<Integer> dice, Integer target) ->
                    dice.stream().filter(d -> Objects.equals(d, target)).reduce(0,Integer::sum);

}