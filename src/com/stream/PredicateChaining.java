package com.stream;

import java.util.function.Predicate;

public class PredicateChaining {

    public static void main(String[] args) {
        Predicate<Integer> predicateGreaterThan10 = i -> i >10;
        Predicate<Integer> predicateLessThan100 = i -> i < 100;
        System.out.println(predicateGreaterThan10.and(predicateLessThan100).negate().test(25));
    }
}
