package com.example;

import akka.Done;
import akka.NotUsed;
import akka.stream.javadsl.Sink;

import java.util.concurrent.CompletionStage;

public class StudentSink {
    public Sink<Student, CompletionStage<Done>> sink(){
        return Sink.foreach(System.out::println);
    }
}
