package com.example.grpc_client;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.chb.examples.lib.HelloReply;
import org.chb.examples.lib.HelloRequest;
import org.springframework.stereotype.Service;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.chb.examples.lib.MyServiceGrpc;

import java.awt.*;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class GrpcClientService {

    private ManagedChannel channel;

    @GrpcClient("test")
    private MyServiceGrpc.MyServiceBlockingStub simpleStub;

    @GrpcClient("test1")
    private MyServiceGrpc.MyServiceStub simple2Stub;

    @GrpcClient("test2")
    private MyServiceGrpc.MyServiceFutureStub simple3Stub;

    //파라미터 전달
//    public String sendMessage(final String name) {
//        try{
//            HelloReply response = this.simpleStub.sayHello(HelloRequest.newBuilder().setName(name).build());
//            return response.getMessage();
//        } catch (StatusRuntimeException e) {
//            return "FAILED with " + e.getStatus().getCode().name();
//        }
//    }

    //통신 테스트 7가지
    public void sendBlockingUnary(HelloRequest request){
        System.out.println("통신 테스트 1: Client 1 server 1 Blocking");
        HelloReply helloResponse = simpleStub.sayHello(request);
        System.out.println("step1 결과 : " + helloResponse.getMessage() + "/" + helloResponse.getGreeting());
//        try {
//            HelloReply response = simpleStub.sayHello(HelloRequest.newBuilder().setName("Unary").setMemo("Blocking").build());
//            System.out.println(response.getMessage() + "/"+response.getGreeting());
//            System.out.println("통신 테스트 1: 끝");
//            return response.getMessage() + "/"+response.getGreeting();
//        }catch (StatusRuntimeException e){
//            System.out.println("통신 테스트 1: 실패");
//            return "FAILED with " + e.getStatus().getCode().name();
//        }
        System.out.println("통신 테스트 1: 끝");
    }

    public void sendAsyncUnary (HelloRequest request) {
        System.out.println("통신 테스트 2: Client 1 server 1 Async");

        simple2Stub.sayHello(request, new StreamObserver<HelloReply>() {
            @Override
            public void onNext(HelloReply value) {
                System.out.println("step2 결과 : " + value.getMessage() +"/"+value.getGreeting());
            }
            @Override
            public void onError(Throwable t) {
                System.out.println("error");
            }
            @Override
            public void onCompleted() {
                System.out.println("테스트 2 통신 끝");
            }
        });

        System.out.println("통신 테스트 2: 끝");
    }

    public void sendFutureUnary(HelloRequest request) {
        System.out.println("통신 테스트 3: Client 1 server 1 future");
        ListenableFuture<HelloReply> future = simple3Stub.sayHello(request);
        HelloReply response = null;

        try {
            response = future.get(2, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("step3 결과 : " + response.getMessage() + "/" + response.getGreeting());
        System.out.println("통신 테스트 3: 끝");
    }

    public void sendBlockingServerStream(HelloRequest request) {
        System.out.println("통신 테스트 4: Client 1 server N Blocking");

        Iterator<HelloReply> responseIter = simpleStub.sayHelloServerStream(request);
        responseIter.forEachRemaining(response -> {
            System.out.println("step4 결과 : " + response.getMessage() + "/" + response.getGreeting());
        });

        System.out.println("통신 테스트 4: 끝");
    }

    public void sendAsynServerStream(HelloRequest request) {
        System.out.println("통신 테스트 5: Client 1 server N Async");
        simple2Stub.sayHelloServerStream(request, new StreamObserver<HelloReply>() {
            @Override
            public void onNext(HelloReply value) {
                System.out.println("step5 결과 : " + value.getMessage() +"/"+value.getGreeting());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("error");
            }

            @Override
            public void onCompleted() {
                System.out.println("step5 통신 끝");
            }
        });
        System.out.println("통신 테스트 5: 끝");
    }

    public void sendAsynClientStream(List<HelloRequest> requestList) {
        System.out.println("통신 테스트 6: Client N server 1 Async");
        StreamObserver<HelloReply> responseObserver = new StreamObserver<HelloReply>() {
            @Override
            public void onNext(HelloReply value) {
                System.out.println("step6 결과 : " + value.getMessage() +"/"+value.getGreeting());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("error");
            }

            @Override
            public void onCompleted() {
                System.out.println("step6 통신 끝");
            }
        };
        StreamObserver<HelloRequest> requestObserver = simple2Stub.sayHelloClientStream(responseObserver);
        for (HelloRequest request : requestList) {
            requestObserver.onNext(request);
        }
        requestObserver.onCompleted();
        System.out.println("통신 테스트 6: 끝");
    }

    public void sendAsynBiStream(List<HelloRequest> requestList) {
        System.out.println("통신 테스트 7: Client N server N Async");
        StreamObserver<HelloReply> responseObserver = new StreamObserver<HelloReply>() {
            @Override
            public void onNext(HelloReply value) {
                System.out.println("step7 결과 : " + value.getMessage() +"/"+value.getGreeting());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("error");
            }

            @Override
            public void onCompleted() {
                System.out.println("step7 통신 끝");
            }
        };

        StreamObserver<HelloRequest> requestObsever = simple2Stub.sayHelloBiStream(responseObserver);

        for (HelloRequest request : requestList) {
            requestObsever.onNext(request);
        }

        requestObsever.onCompleted();

        System.out.println("통신 테스트 7: 끝");
    }
}
