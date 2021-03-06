// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.stream.proto

package io.spring.up.ipc.model;

public interface StreamServerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.spring.up.ipc.model.StreamServerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.spring.up.ipc.model.em.Format response_type = 1;</code>
   */
  int getResponseTypeValue();
  /**
   * <code>.io.spring.up.ipc.model.em.Format response_type = 1;</code>
   */
  io.spring.up.ipc.model.em.Format getResponseType();

  /**
   * <code>repeated .io.spring.up.ipc.model.ResponseParams response_params = 2;</code>
   */
  java.util.List<io.spring.up.ipc.model.ResponseParams> 
      getResponseParamsList();
  /**
   * <code>repeated .io.spring.up.ipc.model.ResponseParams response_params = 2;</code>
   */
  io.spring.up.ipc.model.ResponseParams getResponseParams(int index);
  /**
   * <code>repeated .io.spring.up.ipc.model.ResponseParams response_params = 2;</code>
   */
  int getResponseParamsCount();
  /**
   * <code>repeated .io.spring.up.ipc.model.ResponseParams response_params = 2;</code>
   */
  java.util.List<? extends io.spring.up.ipc.model.ResponseParamsOrBuilder> 
      getResponseParamsOrBuilderList();
  /**
   * <code>repeated .io.spring.up.ipc.model.ResponseParams response_params = 2;</code>
   */
  io.spring.up.ipc.model.ResponseParamsOrBuilder getResponseParamsOrBuilder(
      int index);

  /**
   * <code>.io.spring.up.ipc.model.IpcEnvelop envelop = 3;</code>
   */
  boolean hasEnvelop();
  /**
   * <code>.io.spring.up.ipc.model.IpcEnvelop envelop = 3;</code>
   */
  io.spring.up.ipc.model.IpcEnvelop getEnvelop();
  /**
   * <code>.io.spring.up.ipc.model.IpcEnvelop envelop = 3;</code>
   */
  io.spring.up.ipc.model.IpcEnvelopOrBuilder getEnvelopOrBuilder();

  /**
   * <code>.io.spring.up.ipc.model.em.Compression algorithm = 4;</code>
   */
  int getAlgorithmValue();
  /**
   * <code>.io.spring.up.ipc.model.em.Compression algorithm = 4;</code>
   */
  io.spring.up.ipc.model.em.Compression getAlgorithm();

  /**
   * <code>.io.spring.up.ipc.model.IpcStatus response_status = 5;</code>
   */
  boolean hasResponseStatus();
  /**
   * <code>.io.spring.up.ipc.model.IpcStatus response_status = 5;</code>
   */
  io.spring.up.ipc.model.IpcStatus getResponseStatus();
  /**
   * <code>.io.spring.up.ipc.model.IpcStatus response_status = 5;</code>
   */
  io.spring.up.ipc.model.IpcStatusOrBuilder getResponseStatusOrBuilder();
}
