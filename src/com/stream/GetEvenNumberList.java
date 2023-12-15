package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class GetEvenNumberList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(23, 45, 65, 56, 42, 43, 89);
        List<Integer> newList = integers.stream().filter(number -> number % 2 == 0 ? true : false).collect(Collectors.toList());
        System.out.println(newList);
    }
}