package org.codingdojo.yatzy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

    protected int[] dice;
    public Yatzy() {}
    public Yatzy(int d1, int d2, int d3, int d4, int _5)
    {
        this();
        dice = new int[5];
        dice[0] = d1;
        dice[1] = d2;
        dice[2] = d3;
        dice[3] = d4;
        dice[4] = _5;
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

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5)
    {
        int[] tallies;
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;




        tallies = new int[6];
        tallies[d1-1] += 1;
        tallies[d2-1] += 1;
        tallies[d3-1] += 1;
        tallies[d4-1] += 1;
        tallies[d5-1] += 1;

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i+1;
            }

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i+1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }
}



