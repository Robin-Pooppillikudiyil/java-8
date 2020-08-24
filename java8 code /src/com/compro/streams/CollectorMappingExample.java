package com.compro.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.compro.funcprogramming.Instructor;
import com.compro.funcprogramming.Instructors;

public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> namesList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);

        //mapping
        namesList= Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));

        namesList.forEach(System.out::println);

        //Instructors by their years of experience
        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        mapYearsOfExperienceAndNames.forEach((key,value) ->{
            System.out.println("key = " + key + " value = " + value);
        });






    }
}
