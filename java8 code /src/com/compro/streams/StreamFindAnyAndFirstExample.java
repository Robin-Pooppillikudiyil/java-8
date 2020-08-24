package com.compro.streams;

import java.util.Optional;

import com.compro.funcprogramming.Instructor;
import com.compro.funcprogramming.Instructors;

public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll().stream()
                .findAny();
        if(instructorOptional.isPresent())
            System.out.println(instructorOptional.get());

        instructorOptional = Instructors.getAll().stream().findFirst();
        if (instructorOptional.isPresent())
            System.out.println(instructorOptional.get());


    }
}
