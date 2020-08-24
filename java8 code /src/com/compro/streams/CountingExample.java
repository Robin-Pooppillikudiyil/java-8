package com.compro.streams;

import java.util.stream.Collectors;

import com.compro.funcprogramming.Instructor;
import com.compro.funcprogramming.Instructors;

public class CountingExample {
    public static void main(String[] args) {
        //count the numbers of instructors who teaches online courses
        //stream.count
        long count = Instructors.getAll().stream()
                    .filter(Instructor::isOnlineCourses)
                    .count();
        System.out.println(count);
        
        
        //collectors.counting
        count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .collect(Collectors.counting());
        System.out.println("count = " + count);
        
    }
}
