// Generated by the protocol buffer compiler.  DO NOT EDIT!

package me.objectyan.screensharing.protobuf;

public final class CarlifeBTStartPairReqProto {
  private CarlifeBTStartPairReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeBTStartPairReq extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeBTStartPairReq.newBuilder() to construct.
    private CarlifeBTStartPairReq() {}
    
    private static final CarlifeBTStartPairReq defaultInstance = new CarlifeBTStartPairReq();
    public static CarlifeBTStartPairReq getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeBTStartPairReq getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTStartPairReq_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.internal_static_com_baidu_carlife_protobuf_CarlifeBTStartPairReq_fieldAccessorTable;
    }
    
    // required int32 ostype = 1;
    public static final int OSTYPE_FIELD_NUMBER = 1;
    private boolean hasOstype;
    private int ostype_ = 0;
    public boolean hasOstype() { return hasOstype; }
    public int getOstype() { return ostype_; }
    
    // optional string address = 2;
    public static final int ADDRESS_FIELD_NUMBER = 2;
    private boolean hasAddress;
    private String address_ = "";
    public boolean hasAddress() { return hasAddress; }
    public String getAddress() { return address_; }

    public final boolean isInitialized() {
      if (!hasOstype) return false;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasOstype()) {
        output.writeInt32(1, getOstype());
      }
      if (hasAddress()) {
        output.writeString(2, getAddress());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (hasOstype()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getOstype());
      }
      if (hasAddress()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getAddress());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq result;

      // Construct using me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq();
        return builder;
      }

      protected me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq.getDescriptor();
      }

      public me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq getDefaultInstanceForType() {
        return me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq) {
          return mergeFrom((me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq other) {
        if (other == me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq.getDefaultInstance()) return this;
        if (other.hasOstype()) {
          setOstype(other.getOstype());
        }
        if (other.hasAddress()) {
          setAddress(other.getAddress());
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
              setOstype(input.readInt32());
              break;
            }
            case 18: {
              setAddress(input.readString());
              break;
            }
          }
        }
      }


      // required int32 ostype = 1;
      public boolean hasOstype() {
        return result.hasOstype();
      }
      public int getOstype() {
        return result.getOstype();
      }
      public Builder setOstype(int value) {
        result.hasOstype = true;
        result.ostype_ = value;
        return this;
      }
      public Builder clearOstype() {
        result.hasOstype = false;
        result.ostype_ = 0;
        return this;
      }

      // optional string address = 2;
      public boolean hasAddress() {
        return result.hasAddress();
      }
      public String getAddress() {
        return result.getAddress();
      }
      public Builder setAddress(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAddress = true;
        result.address_ = value;
        return this;
      }
      public Builder clearAddress() {
        result.hasAddress = false;
        result.address_ = getDefaultInstance().getAddress();
        return this;
      }
    }

    static {
      me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.getDescriptor();
    }

    static {
      me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.internalForceInit();
    }
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeBTStartPairReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeBTStartPairReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n CarlifeBTStartPairReqProto.proto\022\032com." +
      "baidu.carlife.protobuf\"8\n\025CarlifeBTStart" +
      "PairReq\022\016\n\006ostype\030\001 \002(\005\022\017\n\007address\030\002 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeBTStartPairReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeBTStartPairReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeBTStartPairReq_descriptor,
              new String[] { "Ostype", "Address", },
              me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq.class,
              me.objectyan.screensharing.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReq.Builder.class);
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
