// Generated by the protocol buffer compiler.  DO NOT EDIT!

package me.objectyan.screensharing.protobuf;

public final class CarlifeProtocolVersionMatchStatusProto {
  private CarlifeProtocolVersionMatchStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CarlifeProtocolVersionMatchStatus extends
      com.google.protobuf.GeneratedMessage {
    // Use CarlifeProtocolVersionMatchStatus.newBuilder() to construct.
    private CarlifeProtocolVersionMatchStatus() {}
    
    private static final CarlifeProtocolVersionMatchStatus defaultInstance = new CarlifeProtocolVersionMatchStatus();
    public static CarlifeProtocolVersionMatchStatus getDefaultInstance() {
      return defaultInstance;
    }
    
    public CarlifeProtocolVersionMatchStatus getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.internal_static_com_baidu_carlife_protobuf_CarlifeProtocolVersionMatchStatus_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.internal_static_com_baidu_carlife_protobuf_CarlifeProtocolVersionMatchStatus_fieldAccessorTable;
    }
    
    // required int32 matchStatus = 1;
    public static final int MATCHSTATUS_FIELD_NUMBER = 1;
    private boolean hasMatchStatus;
    private int matchStatus_ = 0;
    public boolean hasMatchStatus() { return hasMatchStatus; }
    public int getMatchStatus() { return matchStatus_; }
    
    public final boolean isInitialized() {
      if (!hasMatchStatus) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasMatchStatus()) {
        output.writeInt32(1, getMatchStatus());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasMatchStatus()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getMatchStatus());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus result;
      
      // Construct using me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus();
        return builder;
      }
      
      protected me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.getDescriptor();
      }
      
      public me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus getDefaultInstanceForType() {
        return me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus) {
          return mergeFrom((me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus other) {
        if (other == me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.getDefaultInstance()) return this;
        if (other.hasMatchStatus()) {
          setMatchStatus(other.getMatchStatus());
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
              setMatchStatus(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // required int32 matchStatus = 1;
      public boolean hasMatchStatus() {
        return result.hasMatchStatus();
      }
      public int getMatchStatus() {
        return result.getMatchStatus();
      }
      public Builder setMatchStatus(int value) {
        result.hasMatchStatus = true;
        result.matchStatus_ = value;
        return this;
      }
      public Builder clearMatchStatus() {
        result.hasMatchStatus = false;
        result.matchStatus_ = 0;
        return this;
      }
    }
    
    static {
      me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.getDescriptor();
    }
    
    static {
      me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_baidu_carlife_protobuf_CarlifeProtocolVersionMatchStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_baidu_carlife_protobuf_CarlifeProtocolVersionMatchStatus_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n,CarlifeProtocolVersionMatchStatusProto" +
      ".proto\022\032com_baidu_carlife\"8\n!Ca" +
      "rlifeProtocolVersionMatchStatus\022\023\n\013match" +
      "Status\030\001 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_baidu_carlife_protobuf_CarlifeProtocolVersionMatchStatus_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_baidu_carlife_protobuf_CarlifeProtocolVersionMatchStatus_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_baidu_carlife_protobuf_CarlifeProtocolVersionMatchStatus_descriptor,
              new String[] { "MatchStatus", },
              me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.class,
              me.objectyan.screensharing.protobuf.CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.Builder.class);
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
