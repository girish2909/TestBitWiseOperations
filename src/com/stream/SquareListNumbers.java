package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class SquareListNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4, 5, 6, 56);
        List<Integer> squaredList = list.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println(squaredList);
    }
}
