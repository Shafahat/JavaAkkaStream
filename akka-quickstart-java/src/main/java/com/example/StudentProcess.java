package com.example;

import akka.NotUsed;
import akka.stream.javadsl.Flow;

public class StudentProcess {
    public Flow<Student, Student, NotUsed> flow(){
        return  Flow.fromFunction(std -> {
            std.setCourse("Software & Design Pattern");
            return std;
        });
    }
}
