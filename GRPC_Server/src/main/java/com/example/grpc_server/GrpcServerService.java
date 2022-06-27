package com.example.grpc_server;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import org.chb.examples.lib.HelloReply;
import org.chb.examples.lib.HelloRequest;
import org.chb.examples.lib.MyServiceGrpc;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class GrpcServerService extends MyServiceGrpc.MyServiceImplBase {
    //unary
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        String hello = request.getName() + ","+request.getMemo();

        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello Unary==> " + hello)
                .setGreeting("unary Greeting")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    //server stream
    @Override
    public void sayHelloServerStream(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        List<String> greetingList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            greetingList.add(request.getName() + "," + request.getMemo() + ":" + i);
        }

        for (String greeting : greetingList) {
            HelloReply reply = HelloReply.newBuilder()
                    .setMessage("Hello Server Stream ==> " + greeting)
                    .setGreeting("Server Stream Greeting")
                    .build();
            responseObserver.onNext(reply);
        }

        responseObserver.onCompleted();
    }

    //client steram
    @Override
    public StreamObserver<org.chb.examples.lib.HelloRequest> sayHelloClientStream(StreamObserver<HelloReply> responseObserver){
        return new StreamObserver<HelloRequest>() {
            @Override
            public void onNext(HelloRequest value) {
                System.out.println(value.getName() + "," + value.getMemo());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("error");
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        HelloReply.newBuilder()
                                .setMessage("Hello Server Stream ==>")
                                .setGreeting("Client Stream Greeting")
                                .build());
                responseObserver.onCompleted();
            }
        };
    }

//    //bi stream
    @Override
    public StreamObserver<org.chb.examples.lib.HelloRequest> sayHelloBiStream(StreamObserver<HelloReply> responseObserver){
        return new StreamObserver<HelloRequest>() {
            @Override
            public void onNext(HelloRequest value) {
                String greeting = value.getName() + "." + value.getMemo();
                System.out.println(greeting);

                responseObserver.onNext(HelloReply.newBuilder().setMessage("Hello Bi Stream ==>"+"1").setGreeting("Bi Stream Greeting").build());
                responseObserver.onNext(HelloReply.newBuilder().setMessage("Hello Bi Stream ==>"+"2").setGreeting("Bi Stream Greeting").build());

            }

            @Override
            public void onError(Throwable t) {
                System.out.println("error");
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
