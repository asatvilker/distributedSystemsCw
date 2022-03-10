// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: matrix.proto

package com.example.grpc.server.grpcserver;

/**
 * Protobuf type {@code matrixmult.Row}
 */
public  final class Row extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:matrixmult.Row)
    RowOrBuilder {
  // Use Row.newBuilder() to construct.
  private Row(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Row() {
    elements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Row(
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
          case 80: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              elements_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            elements_.add(input.readInt32());
            break;
          }
          case 82: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              elements_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              elements_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        elements_ = java.util.Collections.unmodifiableList(elements_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_Row_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_Row_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.Row.class, com.example.grpc.server.grpcserver.Row.Builder.class);
  }

  public static final int ELEMENTS_FIELD_NUMBER = 10;
  private java.util.List<java.lang.Integer> elements_;
  /**
   * <code>repeated int32 elements = 10;</code>
   */
  public java.util.List<java.lang.Integer>
      getElementsList() {
    return elements_;
  }
  /**
   * <code>repeated int32 elements = 10;</code>
   */
  public int getElementsCount() {
    return elements_.size();
  }
  /**
   * <code>repeated int32 elements = 10;</code>
   */
  public int getElements(int index) {
    return elements_.get(index);
  }
  private int elementsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getElementsList().size() > 0) {
      output.writeUInt32NoTag(82);
      output.writeUInt32NoTag(elementsMemoizedSerializedSize);
    }
    for (int i = 0; i < elements_.size(); i++) {
      output.writeInt32NoTag(elements_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < elements_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(elements_.get(i));
      }
      size += dataSize;
      if (!getElementsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      elementsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.example.grpc.server.grpcserver.Row)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.Row other = (com.example.grpc.server.grpcserver.Row) obj;

    boolean result = true;
    result = result && getElementsList()
        .equals(other.getElementsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getElementsCount() > 0) {
      hash = (37 * hash) + ELEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getElementsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.Row parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.Row parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.Row parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.Row parseFrom(
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
  public static Builder newBuilder(com.example.grpc.server.grpcserver.Row prototype) {
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
   * Protobuf type {@code matrixmult.Row}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:matrixmult.Row)
      com.example.grpc.server.grpcserver.RowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_Row_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_Row_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.Row.class, com.example.grpc.server.grpcserver.Row.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.Row.newBuilder()
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
      elements_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.MatrixMult.internal_static_matrixmult_Row_descriptor;
    }

    public com.example.grpc.server.grpcserver.Row getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.Row.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.Row build() {
      com.example.grpc.server.grpcserver.Row result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.Row buildPartial() {
      com.example.grpc.server.grpcserver.Row result = new com.example.grpc.server.grpcserver.Row(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        elements_ = java.util.Collections.unmodifiableList(elements_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.elements_ = elements_;
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
      if (other instanceof com.example.grpc.server.grpcserver.Row) {
        return mergeFrom((com.example.grpc.server.grpcserver.Row)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.Row other) {
      if (other == com.example.grpc.server.grpcserver.Row.getDefaultInstance()) return this;
      if (!other.elements_.isEmpty()) {
        if (elements_.isEmpty()) {
          elements_ = other.elements_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureElementsIsMutable();
          elements_.addAll(other.elements_);
        }
        onChanged();
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
      com.example.grpc.server.grpcserver.Row parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.Row) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> elements_ = java.util.Collections.emptyList();
    private void ensureElementsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        elements_ = new java.util.ArrayList<java.lang.Integer>(elements_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 elements = 10;</code>
     */
    public java.util.List<java.lang.Integer>
        getElementsList() {
      return java.util.Collections.unmodifiableList(elements_);
    }
    /**
     * <code>repeated int32 elements = 10;</code>
     */
    public int getElementsCount() {
      return elements_.size();
    }
    /**
     * <code>repeated int32 elements = 10;</code>
     */
    public int getElements(int index) {
      return elements_.get(index);
    }
    /**
     * <code>repeated int32 elements = 10;</code>
     */
    public Builder setElements(
        int index, int value) {
      ensureElementsIsMutable();
      elements_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 elements = 10;</code>
     */
    public Builder addElements(int value) {
      ensureElementsIsMutable();
      elements_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 elements = 10;</code>
     */
    public Builder addAllElements(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureElementsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, elements_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 elements = 10;</code>
     */
    public Builder clearElements() {
      elements_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:matrixmult.Row)
  }

  // @@protoc_insertion_point(class_scope:matrixmult.Row)
  private static final com.example.grpc.server.grpcserver.Row DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.Row();
  }

  public static com.example.grpc.server.grpcserver.Row getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Row>
      PARSER = new com.google.protobuf.AbstractParser<Row>() {
    public Row parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Row(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Row> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Row> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.Row getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
