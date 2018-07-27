// Generated by the protocol buffer compiler.  DO NOT EDIT!

package me.objectyan.screensharing.protobuf;

public final class CarlifeErrorCodeProto {
  private CarlifeErrorCodeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeErrorCode extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeErrorCode.newBuilder() to construct.
    private CarlifeErrorCode() {}
    
    private static final CarlifeErrorCode defaultInstance = new CarlifeErrorCode();
    public static CarlifeErrorCode getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeErrorCode getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.internal_static_com_baidu_carlife_protobuf_CarlifeErrorCode_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.internal_static_com_baidu_carlife_protobuf_CarlifeErrorCode_fieldAccessorTable;
    }
    
    // required string errorCode = 1;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    private boolean hasErrorCode;
    private String errorCode_ = "";
    public boolean hasErrorCode() { return hasErrorCode; }
    public String getErrorCode() { return errorCode_; }

    public final boolean isInitialized() {
      if (!hasErrorCode) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasErrorCode()) {
        output.writeString(1, getErrorCode());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasErrorCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getErrorCode());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode result;

      // Construct using me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode();
        return builder;
      }

      protected me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode.getDescriptor();
      }

      public me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode getDefaultInstanceForType() {
        return me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode) {
          return mergeFrom((me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode other) {
        if (other == me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode.getDefaultInstance()) return this;
        if (other.hasErrorCode()) {
          setErrorCode(other.getErrorCode());
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
            case 10: {
              setErrorCode(input.readString());
              break;
            }
          }
        }
      }


      // required string errorCode = 1;
      public boolean hasErrorCode() {
        return result.hasErrorCode();
      }
      public String getErrorCode() {
        return result.getErrorCode();
      }
      public Builder setErrorCode(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasErrorCode = true;
        result.errorCode_ = value;
        return this;
      }
      public Builder clearErrorCode() {
        result.hasErrorCode = false;
        result.errorCode_ = getDefaultInstance().getErrorCode();
        return this;
      }
    }

    static {
      me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.getDescriptor();
    }

    static {
      me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeErrorCode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeErrorCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033CarlifeErrorCodeProto.proto\022\032com.baidu" +
      ".carlife.protobuf\"%\n\020CarlifeErrorCode\022\021\n" +
      "\terrorCode\030\001 \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeErrorCode_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeErrorCode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeErrorCode_descriptor,
              new String[] { "ErrorCode", },
              me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode.class,
              me.objectyan.screensharing.protobuf.CarlifeErrorCodeProto.CarlifeErrorCode.Builder.class);
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
