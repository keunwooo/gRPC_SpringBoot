package org.chb.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: sample.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyServiceGrpc {

  private MyServiceGrpc() {}

  public static final String SERVICE_NAME = "MyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.chb.examples.lib.HelloRequest.class,
      responseType = org.chb.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = MyServiceGrpc.getSayHelloMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getSayHelloMethod = MyServiceGrpc.getSayHelloMethod) == null) {
          MyServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloServerStream",
      requestType = org.chb.examples.lib.HelloRequest.class,
      responseType = org.chb.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloServerStreamMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply> getSayHelloServerStreamMethod;
    if ((getSayHelloServerStreamMethod = MyServiceGrpc.getSayHelloServerStreamMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getSayHelloServerStreamMethod = MyServiceGrpc.getSayHelloServerStreamMethod) == null) {
          MyServiceGrpc.getSayHelloServerStreamMethod = getSayHelloServerStreamMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("SayHelloServerStream"))
              .build();
        }
      }
    }
    return getSayHelloServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloClientStream",
      requestType = org.chb.examples.lib.HelloRequest.class,
      responseType = org.chb.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloClientStreamMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply> getSayHelloClientStreamMethod;
    if ((getSayHelloClientStreamMethod = MyServiceGrpc.getSayHelloClientStreamMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getSayHelloClientStreamMethod = MyServiceGrpc.getSayHelloClientStreamMethod) == null) {
          MyServiceGrpc.getSayHelloClientStreamMethod = getSayHelloClientStreamMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("SayHelloClientStream"))
              .build();
        }
      }
    }
    return getSayHelloClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloBiStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloBiStream",
      requestType = org.chb.examples.lib.HelloRequest.class,
      responseType = org.chb.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest,
      org.chb.examples.lib.HelloReply> getSayHelloBiStreamMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply> getSayHelloBiStreamMethod;
    if ((getSayHelloBiStreamMethod = MyServiceGrpc.getSayHelloBiStreamMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getSayHelloBiStreamMethod = MyServiceGrpc.getSayHelloBiStreamMethod) == null) {
          MyServiceGrpc.getSayHelloBiStreamMethod = getSayHelloBiStreamMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.HelloRequest, org.chb.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloBiStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("SayHelloBiStream"))
              .build();
        }
      }
    }
    return getSayHelloBiStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStub>() {
        @java.lang.Override
        public MyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStub(channel, callOptions);
        }
      };
    return MyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub>() {
        @java.lang.Override
        public MyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceBlockingStub(channel, callOptions);
        }
      };
    return MyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub>() {
        @java.lang.Override
        public MyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceFutureStub(channel, callOptions);
        }
      };
    return MyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class MyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloServerStream(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloRequest> sayHelloClientStream(
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloClientStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloRequest> sayHelloBiStream(
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloBiStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chb.examples.lib.HelloRequest,
                org.chb.examples.lib.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.chb.examples.lib.HelloRequest,
                org.chb.examples.lib.HelloReply>(
                  this, METHODID_SAY_HELLO_SERVER_STREAM)))
          .addMethod(
            getSayHelloClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.chb.examples.lib.HelloRequest,
                org.chb.examples.lib.HelloReply>(
                  this, METHODID_SAY_HELLO_CLIENT_STREAM)))
          .addMethod(
            getSayHelloBiStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.chb.examples.lib.HelloRequest,
                org.chb.examples.lib.HelloReply>(
                  this, METHODID_SAY_HELLO_BI_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MyServiceStub extends io.grpc.stub.AbstractAsyncStub<MyServiceStub> {
    private MyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloServerStream(org.chb.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayHelloServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloRequest> sayHelloClientStream(
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSayHelloClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloRequest> sayHelloBiStream(
        io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayHelloBiStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyServiceBlockingStub> {
    private MyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public org.chb.examples.lib.HelloReply sayHello(org.chb.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.chb.examples.lib.HelloReply> sayHelloServerStream(
        org.chb.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayHelloServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyServiceFutureStub> {
    private MyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chb.examples.lib.HelloReply> sayHello(
        org.chb.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_SERVER_STREAM = 1;
  private static final int METHODID_SAY_HELLO_CLIENT_STREAM = 2;
  private static final int METHODID_SAY_HELLO_BI_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.chb.examples.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_SERVER_STREAM:
          serviceImpl.sayHelloServerStream((org.chb.examples.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloClientStream(
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply>) responseObserver);
        case METHODID_SAY_HELLO_BI_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloBiStream(
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.chb.examples.lib.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService");
    }
  }

  private static final class MyServiceFileDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier {
    MyServiceFileDescriptorSupplier() {}
  }

  private static final class MyServiceMethodDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloServerStreamMethod())
              .addMethod(getSayHelloClientStreamMethod())
              .addMethod(getSayHelloBiStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
