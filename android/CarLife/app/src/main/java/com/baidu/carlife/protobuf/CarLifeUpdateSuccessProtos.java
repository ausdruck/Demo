package com.baidu.carlife.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.Builder;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.UnknownFieldSet.Builder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class CarLifeUpdateSuccessProtos
{
  private static Descriptors.FileDescriptor descriptor;
  private static Descriptors.Descriptor internal_static_carlife_protobuf_CarLifeUpdateSuccess_descriptor;
  private static GeneratedMessage.FieldAccessorTable internal_static_carlife_protobuf_CarLifeUpdateSuccess_fieldAccessorTable;
  
  static
  {
    Descriptors.FileDescriptor.InternalDescriptorAssigner local1 = new Descriptors.FileDescriptor.InternalDescriptorAssigner()
    {
      public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor paramAnonymousFileDescriptor)
      {
        CarLifeUpdateSuccessProtos.access$902(paramAnonymousFileDescriptor);
        CarLifeUpdateSuccessProtos.access$002((Descriptors.Descriptor)CarLifeUpdateSuccessProtos.getDescriptor().getMessageTypes().get(0));
        CarLifeUpdateSuccessProtos.access$102(new GeneratedMessage.FieldAccessorTable(CarLifeUpdateSuccessProtos.internal_static_carlife_protobuf_CarLifeUpdateSuccess_descriptor, new String[] { "VersionCode", "SupportFlag" }, CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.class, CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.Builder.class));
        return null;
      }
    };
    Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[] { "\n\016usuccess.proto\022\020carlife.protobuf\"@\n\024CarLifeUpdateSuccess\022\023\n\013versionCode\030\001 \002(\005\022\023\n\013supportFlag\030\002 \002(\bB8\n\032com.baidu.carlife.protobufB\032CarLifeUpdateSuccessProtos" }, new Descriptors.FileDescriptor[0], local1);
  }
  
  public static Descriptors.FileDescriptor getDescriptor()
  {
    return descriptor;
  }
  
  public static void internalForceInit() {}
  
  public static void registerAllExtensions(ExtensionRegistry paramExtensionRegistry) {}
  
  public static final class CarLifeUpdateSuccess
    extends GeneratedMessage
  {
    public static final int SUPPORTFLAG_FIELD_NUMBER = 2;
    public static final int VERSIONCODE_FIELD_NUMBER = 1;
    private static final CarLifeUpdateSuccess defaultInstance = new CarLifeUpdateSuccess();
    private boolean hasSupportFlag;
    private boolean hasVersionCode;
    private int memoizedSerializedSize = -1;
    private boolean supportFlag_ = false;
    private int versionCode_ = 0;
    
    static
    {
      CarLifeUpdateSuccessProtos.getDescriptor();
      CarLifeUpdateSuccessProtos.internalForceInit();
    }
    
    public static CarLifeUpdateSuccess getDefaultInstance()
    {
      return defaultInstance;
    }
    
    public static final Descriptors.Descriptor getDescriptor()
    {
      return CarLifeUpdateSuccessProtos.internal_static_carlife_protobuf_CarLifeUpdateSuccess_descriptor;
    }
    
    public static Builder newBuilder()
    {
      return Builder.access$300();
    }
    
    public static Builder newBuilder(CarLifeUpdateSuccess paramCarLifeUpdateSuccess)
    {
      return newBuilder().mergeFrom(paramCarLifeUpdateSuccess);
    }
    
    public static CarLifeUpdateSuccess parseDelimitedFrom(InputStream paramInputStream)
      throws IOException
    {
      return ((Builder)newBuilder().mergeDelimitedFrom(paramInputStream)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseDelimitedFrom(InputStream paramInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
      throws IOException
    {
      return ((Builder)newBuilder().mergeDelimitedFrom(paramInputStream, paramExtensionRegistryLite)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(ByteString paramByteString)
      throws InvalidProtocolBufferException
    {
      return ((Builder)newBuilder().mergeFrom(paramByteString)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(ByteString paramByteString, ExtensionRegistryLite paramExtensionRegistryLite)
      throws InvalidProtocolBufferException
    {
      return ((Builder)newBuilder().mergeFrom(paramByteString, paramExtensionRegistryLite)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(CodedInputStream paramCodedInputStream)
      throws IOException
    {
      return ((Builder)newBuilder().mergeFrom(paramCodedInputStream)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
      throws IOException
    {
      return newBuilder().mergeFrom(paramCodedInputStream, paramExtensionRegistryLite).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(InputStream paramInputStream)
      throws IOException
    {
      return ((Builder)newBuilder().mergeFrom(paramInputStream)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(InputStream paramInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
      throws IOException
    {
      return ((Builder)newBuilder().mergeFrom(paramInputStream, paramExtensionRegistryLite)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(byte[] paramArrayOfByte)
      throws InvalidProtocolBufferException
    {
      return ((Builder)newBuilder().mergeFrom(paramArrayOfByte)).buildParsed();
    }
    
    public static CarLifeUpdateSuccess parseFrom(byte[] paramArrayOfByte, ExtensionRegistryLite paramExtensionRegistryLite)
      throws InvalidProtocolBufferException
    {
      return ((Builder)newBuilder().mergeFrom(paramArrayOfByte, paramExtensionRegistryLite)).buildParsed();
    }
    
    public CarLifeUpdateSuccess getDefaultInstanceForType()
    {
      return defaultInstance;
    }
    
    public int getSerializedSize()
    {
      int i = this.memoizedSerializedSize;
      if (i != -1) {
        return i;
      }
      i = 0;
      if (hasVersionCode()) {
        i = 0 + CodedOutputStream.computeInt32Size(1, getVersionCode());
      }
      int j = i;
      if (hasSupportFlag()) {
        j = i + CodedOutputStream.computeBoolSize(2, getSupportFlag());
      }
      i = j + getUnknownFields().getSerializedSize();
      this.memoizedSerializedSize = i;
      return i;
    }
    
    public boolean getSupportFlag()
    {
      return this.supportFlag_;
    }
    
    public int getVersionCode()
    {
      return this.versionCode_;
    }
    
    public boolean hasSupportFlag()
    {
      return this.hasSupportFlag;
    }
    
    public boolean hasVersionCode()
    {
      return this.hasVersionCode;
    }
    
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable()
    {
      return CarLifeUpdateSuccessProtos.internal_static_carlife_protobuf_CarLifeUpdateSuccess_fieldAccessorTable;
    }
    
    public final boolean isInitialized()
    {
      if (!this.hasVersionCode) {}
      while (!this.hasSupportFlag) {
        return false;
      }
      return true;
    }
    
    public Builder newBuilderForType()
    {
      return newBuilder();
    }
    
    public Builder toBuilder()
    {
      return newBuilder(this);
    }
    
    public void writeTo(CodedOutputStream paramCodedOutputStream)
      throws IOException
    {
      if (hasVersionCode()) {
        paramCodedOutputStream.writeInt32(1, getVersionCode());
      }
      if (hasSupportFlag()) {
        paramCodedOutputStream.writeBool(2, getSupportFlag());
      }
      getUnknownFields().writeTo(paramCodedOutputStream);
    }
    
    public static final class Builder
      extends GeneratedMessage.Builder<Builder>
    {
      private CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess result;
      
      private CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess buildParsed()
        throws InvalidProtocolBufferException
      {
        if (!isInitialized()) {
          throw newUninitializedMessageException(this.result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      private static Builder create()
      {
        Builder localBuilder = new Builder();
        localBuilder.result = new CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess(null);
        return localBuilder;
      }
      
      public CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess build()
      {
        if ((this.result != null) && (!isInitialized())) {
          throw newUninitializedMessageException(this.result);
        }
        return buildPartial();
      }
      
      public CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess buildPartial()
      {
        if (this.result == null) {
          throw new IllegalStateException("build() has already been called on this Builder.");
        }
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess localCarLifeUpdateSuccess = this.result;
        this.result = null;
        return localCarLifeUpdateSuccess;
      }
      
      public Builder clear()
      {
        if (this.result == null) {
          throw new IllegalStateException("Cannot call clear() after build().");
        }
        this.result = new CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess(null);
        return this;
      }
      
      public Builder clearSupportFlag()
      {
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$702(this.result, false);
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$802(this.result, false);
        return this;
      }
      
      public Builder clearVersionCode()
      {
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$502(this.result, false);
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$602(this.result, 0);
        return this;
      }
      
      public Builder clone()
      {
        return create().mergeFrom(this.result);
      }
      
      public CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess getDefaultInstanceForType()
      {
        return CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.getDefaultInstance();
      }
      
      public Descriptors.Descriptor getDescriptorForType()
      {
        return CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.getDescriptor();
      }
      
      public boolean getSupportFlag()
      {
        return this.result.getSupportFlag();
      }
      
      public int getVersionCode()
      {
        return this.result.getVersionCode();
      }
      
      public boolean hasSupportFlag()
      {
        return this.result.hasSupportFlag();
      }
      
      public boolean hasVersionCode()
      {
        return this.result.hasVersionCode();
      }
      
      protected CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess internalGetResult()
      {
        return this.result;
      }
      
      public boolean isInitialized()
      {
        return this.result.isInitialized();
      }
      
      public Builder mergeFrom(CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess paramCarLifeUpdateSuccess)
      {
        if (paramCarLifeUpdateSuccess == CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.getDefaultInstance()) {
          return this;
        }
        if (paramCarLifeUpdateSuccess.hasVersionCode()) {
          setVersionCode(paramCarLifeUpdateSuccess.getVersionCode());
        }
        if (paramCarLifeUpdateSuccess.hasSupportFlag()) {
          setSupportFlag(paramCarLifeUpdateSuccess.getSupportFlag());
        }
        mergeUnknownFields(paramCarLifeUpdateSuccess.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
        throws IOException
      {
        UnknownFieldSet.Builder localBuilder = UnknownFieldSet.newBuilder(getUnknownFields());
        for (;;)
        {
          int i = paramCodedInputStream.readTag();
          switch (i)
          {
          default: 
            if (!parseUnknownField(paramCodedInputStream, localBuilder, paramExtensionRegistryLite, i))
            {
              setUnknownFields(localBuilder.build());
              return this;
            }
            break;
          case 0: 
            setUnknownFields(localBuilder.build());
            return this;
          case 8: 
            setVersionCode(paramCodedInputStream.readInt32());
            break;
          case 16: 
            setSupportFlag(paramCodedInputStream.readBool());
          }
        }
      }
      
      public Builder mergeFrom(Message paramMessage)
      {
        if ((paramMessage instanceof CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess)) {
          return mergeFrom((CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess)paramMessage);
        }
        super.mergeFrom(paramMessage);
        return this;
      }
      
      public Builder setSupportFlag(boolean paramBoolean)
      {
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$702(this.result, true);
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$802(this.result, paramBoolean);
        return this;
      }
      
      public Builder setVersionCode(int paramInt)
      {
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$502(this.result, true);
        CarLifeUpdateSuccessProtos.CarLifeUpdateSuccess.access$602(this.result, paramInt);
        return this;
      }
    }
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/carlife/protobuf/CarLifeUpdateSuccessProtos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */