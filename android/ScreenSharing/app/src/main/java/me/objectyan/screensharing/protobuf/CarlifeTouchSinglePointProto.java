// Generated by the protocol buffer compiler.  DO NOT EDIT!

package me.objectyan.screensharing.protobuf;

public final class CarlifeTouchSinglePointProto {
  private CarlifeTouchSinglePointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeTouchSinglePoint extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeTouchSinglePoint.newBuilder() to construct.
    private CarlifeTouchSinglePoint() {}
    
    private static final CarlifeTouchSinglePoint defaultInstance = new CarlifeTouchSinglePoint();
    public static CarlifeTouchSinglePoint getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeTouchSinglePoint getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.internal_static_com_baidu_carlife_protobuf_CarlifeTouchSinglePoint_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.internal_static_com_baidu_carlife_protobuf_CarlifeTouchSinglePoint_fieldAccessorTable;
    }
    
    // required int32 x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private boolean hasX;
    private int x_ = 0;
    public boolean hasX() { return hasX; }
    public int getX() { return x_; }
    
    // required int32 y = 2;
    public static final int Y_FIELD_NUMBER = 2;
    private boolean hasY;
    private int y_ = 0;
    public boolean hasY() { return hasY; }
    public int getY() { return y_; }
    
    public final boolean isInitialized() {
      if (!hasX) return false;
      if (!hasY) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasX()) {
        output.writeInt32(1, getX());
      }
      if (hasY()) {
        output.writeInt32(2, getY());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasX()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getX());
      }
      if (hasY()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getY());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint result;
      
      // Construct using me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint();
        return builder;
      }
      
      protected me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint.getDescriptor();
      }
      
      public me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint getDefaultInstanceForType() {
        return me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint) {
          return mergeFrom((me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint other) {
        if (other == me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setX(input.readInt32());
              break;
            }
            case 16: {
              setY(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // required int32 x = 1;
      public boolean hasX() {
        return result.hasX();
      }
      public int getX() {
        return result.getX();
      }
      public Builder setX(int value) {
        result.hasX = true;
        result.x_ = value;
        return this;
      }
      public Builder clearX() {
        result.hasX = false;
        result.x_ = 0;
        return this;
      }
      
      // required int32 y = 2;
      public boolean hasY() {
        return result.hasY();
      }
      public int getY() {
        return result.getY();
      }
      public Builder setY(int value) {
        result.hasY = true;
        result.y_ = value;
        return this;
      }
      public Builder clearY() {
        result.hasY = false;
        result.y_ = 0;
        return this;
      }
    }
    
    static {
      me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.getDescriptor();
    }
    
    static {
      me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeTouchSinglePoint_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeTouchSinglePoint_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\"CarlifeTouchSinglePointProto.proto\022\032co" +
      "m.baidu.carlife.protobuf\"/\n\027CarlifeTouch" +
      "SinglePoint\022\t\n\001x\030\001 \002(\005\022\t\n\001y\030\002 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeTouchSinglePoint_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeTouchSinglePoint_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeTouchSinglePoint_descriptor,
              new String[] { "X", "Y", },
              me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint.class,
              me.objectyan.screensharing.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
}
