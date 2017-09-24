// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookService.proto

package com.dkohut.bookchat.common.entity;

/**
 * <pre>
 * Message from server which consist of info about success of operation
 * </pre>
 *
 * Protobuf type {@code com.dkohut.bookchat.common.entity.ResponseMessage}
 */
public  final class ResponseMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dkohut.bookchat.common.entity.ResponseMessage)
    ResponseMessageOrBuilder {
  // Use ResponseMessage.newBuilder() to construct.
  private ResponseMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseMessage() {
    response_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ResponseMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            response_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dkohut.bookchat.common.entity.BookServiceOuterClass.internal_static_com_dkohut_bookchat_common_entity_ResponseMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dkohut.bookchat.common.entity.BookServiceOuterClass.internal_static_com_dkohut_bookchat_common_entity_ResponseMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dkohut.bookchat.common.entity.ResponseMessage.class, com.dkohut.bookchat.common.entity.ResponseMessage.Builder.class);
  }

  public static final int RESPONSE_FIELD_NUMBER = 1;
  private int response_;
  /**
   * <code>.com.dkohut.bookchat.common.entity.ResponseEnum response = 1;</code>
   */
  public int getResponseValue() {
    return response_;
  }
  /**
   * <code>.com.dkohut.bookchat.common.entity.ResponseEnum response = 1;</code>
   */
  public com.dkohut.bookchat.common.entity.ResponseEnum getResponse() {
    com.dkohut.bookchat.common.entity.ResponseEnum result = com.dkohut.bookchat.common.entity.ResponseEnum.valueOf(response_);
    return result == null ? com.dkohut.bookchat.common.entity.ResponseEnum.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (response_ != com.dkohut.bookchat.common.entity.ResponseEnum.SUCCESS.getNumber()) {
      output.writeEnum(1, response_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (response_ != com.dkohut.bookchat.common.entity.ResponseEnum.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, response_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.dkohut.bookchat.common.entity.ResponseMessage)) {
      return super.equals(obj);
    }
    com.dkohut.bookchat.common.entity.ResponseMessage other = (com.dkohut.bookchat.common.entity.ResponseMessage) obj;

    boolean result = true;
    result = result && response_ == other.response_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + response_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dkohut.bookchat.common.entity.ResponseMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.dkohut.bookchat.common.entity.ResponseMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message from server which consist of info about success of operation
   * </pre>
   *
   * Protobuf type {@code com.dkohut.bookchat.common.entity.ResponseMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dkohut.bookchat.common.entity.ResponseMessage)
      com.dkohut.bookchat.common.entity.ResponseMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dkohut.bookchat.common.entity.BookServiceOuterClass.internal_static_com_dkohut_bookchat_common_entity_ResponseMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dkohut.bookchat.common.entity.BookServiceOuterClass.internal_static_com_dkohut_bookchat_common_entity_ResponseMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dkohut.bookchat.common.entity.ResponseMessage.class, com.dkohut.bookchat.common.entity.ResponseMessage.Builder.class);
    }

    // Construct using com.dkohut.bookchat.common.entity.ResponseMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      response_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dkohut.bookchat.common.entity.BookServiceOuterClass.internal_static_com_dkohut_bookchat_common_entity_ResponseMessage_descriptor;
    }

    public com.dkohut.bookchat.common.entity.ResponseMessage getDefaultInstanceForType() {
      return com.dkohut.bookchat.common.entity.ResponseMessage.getDefaultInstance();
    }

    public com.dkohut.bookchat.common.entity.ResponseMessage build() {
      com.dkohut.bookchat.common.entity.ResponseMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.dkohut.bookchat.common.entity.ResponseMessage buildPartial() {
      com.dkohut.bookchat.common.entity.ResponseMessage result = new com.dkohut.bookchat.common.entity.ResponseMessage(this);
      result.response_ = response_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dkohut.bookchat.common.entity.ResponseMessage) {
        return mergeFrom((com.dkohut.bookchat.common.entity.ResponseMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dkohut.bookchat.common.entity.ResponseMessage other) {
      if (other == com.dkohut.bookchat.common.entity.ResponseMessage.getDefaultInstance()) return this;
      if (other.response_ != 0) {
        setResponseValue(other.getResponseValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.dkohut.bookchat.common.entity.ResponseMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dkohut.bookchat.common.entity.ResponseMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int response_ = 0;
    /**
     * <code>.com.dkohut.bookchat.common.entity.ResponseEnum response = 1;</code>
     */
    public int getResponseValue() {
      return response_;
    }
    /**
     * <code>.com.dkohut.bookchat.common.entity.ResponseEnum response = 1;</code>
     */
    public Builder setResponseValue(int value) {
      response_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.dkohut.bookchat.common.entity.ResponseEnum response = 1;</code>
     */
    public com.dkohut.bookchat.common.entity.ResponseEnum getResponse() {
      com.dkohut.bookchat.common.entity.ResponseEnum result = com.dkohut.bookchat.common.entity.ResponseEnum.valueOf(response_);
      return result == null ? com.dkohut.bookchat.common.entity.ResponseEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.dkohut.bookchat.common.entity.ResponseEnum response = 1;</code>
     */
    public Builder setResponse(com.dkohut.bookchat.common.entity.ResponseEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      response_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.dkohut.bookchat.common.entity.ResponseEnum response = 1;</code>
     */
    public Builder clearResponse() {
      
      response_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.dkohut.bookchat.common.entity.ResponseMessage)
  }

  // @@protoc_insertion_point(class_scope:com.dkohut.bookchat.common.entity.ResponseMessage)
  private static final com.dkohut.bookchat.common.entity.ResponseMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dkohut.bookchat.common.entity.ResponseMessage();
  }

  public static com.dkohut.bookchat.common.entity.ResponseMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseMessage>
      PARSER = new com.google.protobuf.AbstractParser<ResponseMessage>() {
    public ResponseMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResponseMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseMessage> getParserForType() {
    return PARSER;
  }

  public com.dkohut.bookchat.common.entity.ResponseMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
