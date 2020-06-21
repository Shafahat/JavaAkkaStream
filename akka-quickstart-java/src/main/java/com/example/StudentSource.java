package com.example;

import akka.NotUsed;
import akka.stream.javadsl.Source;

public class StudentSource {
    public Source<Student, NotUsed> source(){
        return Source.range(1, 25).map(val ->{
            return new Student(val, "studentName"+val);
        });
    }
}
