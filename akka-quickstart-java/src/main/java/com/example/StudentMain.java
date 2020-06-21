package com.example;

import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.RunnableGraph;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;

import java.util.concurrent.CompletionStage;

public class StudentMain {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("akka-basic-stream");
        Source<Student, NotUsed> source = new StudentSource().source();
        Flow<Student, Student, NotUsed> flow = new StudentProcess().flow();
        Sink<Student, CompletionStage<Done>> sink = new StudentSink().sink();

        RunnableGraph<NotUsed> runnable = source.via(flow).to(sink);
        ActorMaterializer materializer = ActorMaterializer.create(system);
        runnable.run(materializer);
    }
}
