package com.baidu.android.bbalbs.common.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class b
{
  public static String a(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      String str2 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str1 = str2;
      if (paramBoolean) {
        str1 = str2.toUpperCase();
      }
      if (str1.length() == 1) {
        localStringBuilder.append("0");
      }
      localStringBuilder.append(str1).append(paramString);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.reset();
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = a(localMessageDigest.digest(), "", paramBoolean);
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      throw new RuntimeException(paramArrayOfByte);
    }
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/android/bbalbs/common/security/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */