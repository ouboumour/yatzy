package org.codingdojo.yatzy.numberofkindstrategies;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public abstract class NumberOfKindScorer {

     BiFunction<List<Integer>, Integer, Integer> score =
             (List<Integer> dice, Integer target) ->
                     target *
                     dice.stream()
                         .distinct()
                         .filter(d -> Collections.frequency(dice, d) >= target)
                         .reduce(Integer::max)
                         .orElse(0);

}