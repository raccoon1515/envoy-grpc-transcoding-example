package com.example.envoygrpctranscoding;

import com.example.envoytest.EchoServiceGrpc;
import com.example.envoytest.EchoServiceOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class Router extends EchoServiceGrpc.EchoServiceImplBase {

    @Override
    public void echo(EchoServiceOuterClass.EchoReq request, StreamObserver<EchoServiceOuterClass.EchoResp> responseObserver) {
        responseObserver.onNext(
                EchoServiceOuterClass.EchoResp.newBuilder()
                        .setMessage(request.getMessage())
                        .build()
        );
        responseObserver.onCompleted();
    }
}
