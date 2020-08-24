package com.compro.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.compro.funcprogramming.Instructor;
import com.compro.funcprogramming.Instructors;

public class FilterExample {
    public static void main(String[] args) {
        //returning instructors sorted by their name and have more that 10 years of experience

        List<Instructor> list = Instructors.getAll().stream()
                                .filter(instructor -> instructor.getYearsOfExperience()>10)
                                .sorted(Comparator.comparing(Instructor::getName))
                                .collect(Collectors.toList());

        list.forEach(System.out::println);

    }
}
