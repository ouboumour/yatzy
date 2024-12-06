package org.codingdojo.yatzy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Yatzy {

    public static int fours(int[] dice) {
        return IntStream.of(dice).filter(d -> d == 4).sum();
    }

    public static int fives(int[] dice) {
        return IntStream.of(dice).filter(d -> d == 5).sum();
    }

    public static int sixes(int[] dice) {
        return IntStream.of(dice).filter(d -> d == 6).sum();
    }

    public static int onePair(int[] dice) {
        return 2*IntStream
                .of(dice)
                .distinct()
                .filter(d -> Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 2)
                .max()
                .orElse(0);
    }

    public static int twoPair(int[] dice) {
        int firstPair = onePair(dice)/2;
        if (firstPair == 0) return 0;

        return 2*IntStream
                .of(dice)
                .distinct()
                .filter(d -> d != firstPair && Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 2)
                .map(secondPair -> secondPair + firstPair)
                .findFirst()
                .orElse(0);
    }

    public static int threeOfAKind(int[] dice) {
        return 3*IntStream
                .of(dice)
                .distinct()
                .filter(d -> Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 3)
                .findFirst()
                .orElse(0);
    }

    public static int fourOfAKind(int[] dice) {
        return 4*IntStream
                .of(dice)
                .distinct()
                .filter(d -> Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 4)
                .findFirst()
                .orElse(0);
    }

    public static int smallStraight(int[] dice) {
        return IntStream
                .of(dice)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()).equals("12345") ? 15 : 0;
    }

    public static int largeStraight(int[] dice) {
        return IntStream
                .of(dice)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()).equals("23456") ? 20 : 0;
    }

    public static int fullHouse(int[] dice) {
        return IntStream
                .of(dice)
                .filter(d -> List.of(2, 3).contains(Collections.frequency(IntStream.of(dice).boxed().toList(), d)))
                .boxed()
                .mapToInt(Integer::intValue)
                .sum();
    }

}