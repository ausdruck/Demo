package com.google.protobuf.micro;

public final class WireFormatMicro
{
  static final int MESSAGE_SET_ITEM = 1;
  static final int MESSAGE_SET_ITEM_END_TAG;
  static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
  static final int MESSAGE_SET_MESSAGE = 3;
  static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
  static final int MESSAGE_SET_TYPE_ID = 2;
  static final int MESSAGE_SET_TYPE_ID_TAG;
  static final int TAG_TYPE_BITS = 3;
  static final int TAG_TYPE_MASK = 7;
  static final int WIRETYPE_END_GROUP = 4;
  static final int WIRETYPE_FIXED32 = 5;
  static final int WIRETYPE_FIXED64 = 1;
  static final int WIRETYPE_LENGTH_DELIMITED = 2;
  static final int WIRETYPE_START_GROUP = 3;
  static final int WIRETYPE_VARINT = 0;
  
  static
  {
    MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
  }
  
  public static int getTagFieldNumber(int paramInt)
  {
    return paramInt >>> 3;
  }
  
  static int getTagWireType(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  static int makeTag(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/google/protobuf/micro/WireFormatMicro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */