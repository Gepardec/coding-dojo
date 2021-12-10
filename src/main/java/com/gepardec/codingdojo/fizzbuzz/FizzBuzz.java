package com.gepardec.codingdojo.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public String toFizzBuzz(final int i) {
        if (isFizzBuzz(i)) {
            return "FizzBuzz";
        }
        if (isFizz(i)) {
            return "Fizz";
        }
        if (isBuzz(i)) {
            return "Buzz";
        }

        return i + "";
    }

    private boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    private boolean isFizz(int i) {
        return i % 3 == 0 || numberContains(i, "3");
    }

    private boolean numberContains(int i, String s) {
        return (i + "").contains(s);
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0 || numberContains(i, "5");
    }

    public List<String> listTo(int i) {
        return IntStream.rangeClosed(1, i)
                .mapToObj(this::toFizzBuzz)
                .collect(Collectors.toList());
    }
}
