package com.example.grpc_client;

import lombok.RequiredArgsConstructor;
import org.chb.examples.lib.HelloRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class GrpcClientController {
    private final GrpcClientService grpcClientService;

    @GetMapping("/test")
    public String defaultMessage() {
        grpcClientService.sendBlockingUnary(HelloRequest.newBuilder().build());
        grpcClientService.sendAsyncUnary(HelloRequest.newBuilder().build());
        grpcClientService.sendFutureUnary(HelloRequest.newBuilder().build());
        grpcClientService.sendBlockingServerStream(HelloRequest.newBuilder().build());
        grpcClientService.sendAsynServerStream(HelloRequest.newBuilder().build());

        List<HelloRequest> requestList = new ArrayList<>();
        requestList.add(HelloRequest.newBuilder().build());
        requestList.add(HelloRequest.newBuilder().build());
        requestList.add(HelloRequest.newBuilder().build());

        grpcClientService.sendAsynClientStream(requestList);
        grpcClientService.sendAsynBiStream(requestList);

        return "테스트 완료";
    }

}
