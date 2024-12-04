package org.codingdojo.yatzy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Yatzy {

    public static int chance(int[] dice) {
        return Arrays.stream(dice).sum();
    }

    public static int yatzy(int[] dice) {
        return Arrays.stream(dice).distinct().count() == 1 ? 50 : 0;
    }

    public static int ones(int[] dice) {
        return Arrays.stream(dice).filter(d -> d == 1).sum();
    }

    public static int twos(int[] dice) {
        return Arrays.stream(dice).filter(d -> d == 2).sum();
    }

    public static int threes(int[] dice) {
        return Arrays.stream(dice).filter(d -> d == 3).sum();
    }

    public static int fours(int[] dice) {
        return Arrays.stream(dice).filter(d -> d == 4).sum();
    }

    public static int fives(int[] dice) {
        return Arrays.stream(dice).filter(d -> d == 5).sum();
    }

    public static int sixes(int[] dice) {
        return Arrays.stream(dice).filter(d -> d == 6).sum();
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
        return 2*IntStream
                .of(dice)
                .distinct()
                .filter(d -> Collections.frequency(IntStream.of(dice).boxed().toList(), d) >= 2)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
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