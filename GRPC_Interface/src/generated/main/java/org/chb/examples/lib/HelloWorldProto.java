// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package org.chb.examples.lib;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014sample.proto\"*\n\014HelloRequest\022\014\n\004name\030\001" +
      " \001(\t\022\014\n\004memo\030\002 \001(\t\"/\n\nHelloReply\022\017\n\007mess" +
      "age\030\001 \001(\t\022\020\n\010greeting\030\002 \001(\t2\333\001\n\tMyServic" +
      "e\022(\n\010SayHello\022\r.HelloRequest\032\013.HelloRepl" +
      "y\"\000\0226\n\024SayHelloServerStream\022\r.HelloReque" +
      "st\032\013.HelloReply\"\0000\001\0226\n\024SayHelloClientStr" +
      "eam\022\r.HelloRequest\032\013.HelloReply\"\000(\001\0224\n\020S" +
      "ayHelloBiStream\022\r.HelloRequest\032\013.HelloRe" +
      "ply\"\000(\0010\001B)\n\024org.chb.examples.libB\017Hello" +
      "WorldProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Memo", });
    internal_static_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloReply_descriptor,
        new java.lang.String[] { "Message", "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
