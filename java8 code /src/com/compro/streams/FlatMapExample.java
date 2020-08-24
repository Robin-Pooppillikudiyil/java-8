package com.compro.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.compro.funcprogramming.Instructor;
import com.compro.funcprogramming.Instructors;

public class FlatMapExample {
    public static void main(String[] args) {
        //Get a list of all the courses which instructors offers
        Set<String> instructorsCourses = Instructors.getAll().stream()
                                        .map(Instructor::getCourses)
                                        .flatMap(List::stream)
                                        .collect(Collectors.toSet());
        System.out.println(instructorsCourses);
    }
}
