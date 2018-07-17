// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.envelop.proto

package io.spring.up.ipc.model;

public interface IpcEnvelopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.spring.up.ipc.model.IpcEnvelop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelop data format
   * </pre>
   *
   * <code>.io.spring.up.ipc.model.em.Format type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Envelop data format
   * </pre>
   *
   * <code>.io.spring.up.ipc.model.em.Format type = 1;</code>
   */
  io.spring.up.ipc.model.em.Format getType();

  /**
   * <pre>
   * Body content
   * </pre>
   *
   * <code>string body = 2;</code>
   */
  java.lang.String getBody();
  /**
   * <pre>
   * Body content
   * </pre>
   *
   * <code>string body = 2;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * Stream content
   * </pre>
   *
   * <code>bytes stream = 3;</code>
   */
  com.google.protobuf.ByteString getStream();

  /**
   * <pre>
   * Service name for method calling, connect to method
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Service name for method calling, connect to method
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
