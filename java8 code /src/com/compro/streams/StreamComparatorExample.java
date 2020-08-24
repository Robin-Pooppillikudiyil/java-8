package com.compro.streams;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Collectors;

import com.compro.funcprogramming.Instructor;
import com.compro.funcprogramming.Instructors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        //retuning all instructors sorted by their name
        List<Instructor> list = Instructors.getAll().stream()
                            .sorted(Comparator.comparing(Instructor::getName).reversed())
                            .collect(Collectors.toList());

        list.forEach(System.out::println);

    }
}
