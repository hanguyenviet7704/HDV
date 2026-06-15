package GRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Typed service for advanced gRPC questions. It runs in parallel with
 * JudgeService so existing Q2111-Q2131 clients keep working unchanged.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: judge.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TypedJudgeServiceGrpc {

  private TypedJudgeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "GRPC.TypedJudgeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GRPC.TypedJudgeRequest,
      GRPC.TypedJudgeResponse> getRequestTypedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestTyped",
      requestType = GRPC.TypedJudgeRequest.class,
      responseType = GRPC.TypedJudgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPC.TypedJudgeRequest,
      GRPC.TypedJudgeResponse> getRequestTypedMethod() {
    io.grpc.MethodDescriptor<GRPC.TypedJudgeRequest, GRPC.TypedJudgeResponse> getRequestTypedMethod;
    if ((getRequestTypedMethod = TypedJudgeServiceGrpc.getRequestTypedMethod) == null) {
      synchronized (TypedJudgeServiceGrpc.class) {
        if ((getRequestTypedMethod = TypedJudgeServiceGrpc.getRequestTypedMethod) == null) {
          TypedJudgeServiceGrpc.getRequestTypedMethod = getRequestTypedMethod =
              io.grpc.MethodDescriptor.<GRPC.TypedJudgeRequest, GRPC.TypedJudgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestTyped"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPC.TypedJudgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPC.TypedJudgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TypedJudgeServiceMethodDescriptorSupplier("RequestTyped"))
              .build();
        }
      }
    }
    return getRequestTypedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GRPC.TypedSubmitRequest,
      GRPC.TypedSubmitResponse> getSubmitTypedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitTyped",
      requestType = GRPC.TypedSubmitRequest.class,
      responseType = GRPC.TypedSubmitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GRPC.TypedSubmitRequest,
      GRPC.TypedSubmitResponse> getSubmitTypedMethod() {
    io.grpc.MethodDescriptor<GRPC.TypedSubmitRequest, GRPC.TypedSubmitResponse> getSubmitTypedMethod;
    if ((getSubmitTypedMethod = TypedJudgeServiceGrpc.getSubmitTypedMethod) == null) {
      synchronized (TypedJudgeServiceGrpc.class) {
        if ((getSubmitTypedMethod = TypedJudgeServiceGrpc.getSubmitTypedMethod) == null) {
          TypedJudgeServiceGrpc.getSubmitTypedMethod = getSubmitTypedMethod =
              io.grpc.MethodDescriptor.<GRPC.TypedSubmitRequest, GRPC.TypedSubmitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitTyped"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPC.TypedSubmitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GRPC.TypedSubmitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TypedJudgeServiceMethodDescriptorSupplier("SubmitTyped"))
              .build();
        }
      }
    }
    return getSubmitTypedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TypedJudgeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TypedJudgeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TypedJudgeServiceStub>() {
        @java.lang.Override
        public TypedJudgeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TypedJudgeServiceStub(channel, callOptions);
        }
      };
    return TypedJudgeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TypedJudgeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TypedJudgeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TypedJudgeServiceBlockingStub>() {
        @java.lang.Override
        public TypedJudgeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TypedJudgeServiceBlockingStub(channel, callOptions);
        }
      };
    return TypedJudgeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TypedJudgeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TypedJudgeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TypedJudgeServiceFutureStub>() {
        @java.lang.Override
        public TypedJudgeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TypedJudgeServiceFutureStub(channel, callOptions);
        }
      };
    return TypedJudgeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Typed service for advanced gRPC questions. It runs in parallel with
   * JudgeService so existing Q2111-Q2131 clients keep working unchanged.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void requestTyped(GRPC.TypedJudgeRequest request,
        io.grpc.stub.StreamObserver<GRPC.TypedJudgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestTypedMethod(), responseObserver);
    }

    /**
     */
    default void submitTyped(GRPC.TypedSubmitRequest request,
        io.grpc.stub.StreamObserver<GRPC.TypedSubmitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitTypedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TypedJudgeService.
   * <pre>
   * Typed service for advanced gRPC questions. It runs in parallel with
   * JudgeService so existing Q2111-Q2131 clients keep working unchanged.
   * </pre>
   */
  public static abstract class TypedJudgeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TypedJudgeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TypedJudgeService.
   * <pre>
   * Typed service for advanced gRPC questions. It runs in parallel with
   * JudgeService so existing Q2111-Q2131 clients keep working unchanged.
   * </pre>
   */
  public static final class TypedJudgeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TypedJudgeServiceStub> {
    private TypedJudgeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypedJudgeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TypedJudgeServiceStub(channel, callOptions);
    }

    /**
     */
    public void requestTyped(GRPC.TypedJudgeRequest request,
        io.grpc.stub.StreamObserver<GRPC.TypedJudgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestTypedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitTyped(GRPC.TypedSubmitRequest request,
        io.grpc.stub.StreamObserver<GRPC.TypedSubmitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitTypedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TypedJudgeService.
   * <pre>
   * Typed service for advanced gRPC questions. It runs in parallel with
   * JudgeService so existing Q2111-Q2131 clients keep working unchanged.
   * </pre>
   */
  public static final class TypedJudgeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TypedJudgeServiceBlockingStub> {
    private TypedJudgeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypedJudgeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TypedJudgeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public GRPC.TypedJudgeResponse requestTyped(GRPC.TypedJudgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestTypedMethod(), getCallOptions(), request);
    }

    /**
     */
    public GRPC.TypedSubmitResponse submitTyped(GRPC.TypedSubmitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitTypedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TypedJudgeService.
   * <pre>
   * Typed service for advanced gRPC questions. It runs in parallel with
   * JudgeService so existing Q2111-Q2131 clients keep working unchanged.
   * </pre>
   */
  public static final class TypedJudgeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TypedJudgeServiceFutureStub> {
    private TypedJudgeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypedJudgeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TypedJudgeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.TypedJudgeResponse> requestTyped(
        GRPC.TypedJudgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestTypedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GRPC.TypedSubmitResponse> submitTyped(
        GRPC.TypedSubmitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitTypedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_TYPED = 0;
  private static final int METHODID_SUBMIT_TYPED = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_TYPED:
          serviceImpl.requestTyped((GRPC.TypedJudgeRequest) request,
              (io.grpc.stub.StreamObserver<GRPC.TypedJudgeResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_TYPED:
          serviceImpl.submitTyped((GRPC.TypedSubmitRequest) request,
              (io.grpc.stub.StreamObserver<GRPC.TypedSubmitResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRequestTypedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GRPC.TypedJudgeRequest,
              GRPC.TypedJudgeResponse>(
                service, METHODID_REQUEST_TYPED)))
        .addMethod(
          getSubmitTypedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GRPC.TypedSubmitRequest,
              GRPC.TypedSubmitResponse>(
                service, METHODID_SUBMIT_TYPED)))
        .build();
  }

  private static abstract class TypedJudgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TypedJudgeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GRPC.Judge.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TypedJudgeService");
    }
  }

  private static final class TypedJudgeServiceFileDescriptorSupplier
      extends TypedJudgeServiceBaseDescriptorSupplier {
    TypedJudgeServiceFileDescriptorSupplier() {}
  }

  private static final class TypedJudgeServiceMethodDescriptorSupplier
      extends TypedJudgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TypedJudgeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TypedJudgeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TypedJudgeServiceFileDescriptorSupplier())
              .addMethod(getRequestTypedMethod())
              .addMethod(getSubmitTypedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
