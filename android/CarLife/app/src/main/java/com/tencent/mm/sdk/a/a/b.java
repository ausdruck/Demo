package com.tencent.mm.sdk.a.a;

import com.tencent.mm.a.a;

public final class b
{
  public static byte[] a(String paramString1, int paramInt, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null) {
      localStringBuffer.append(paramString1);
    }
    localStringBuffer.append(paramInt);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    return a.a(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/com/tencent/mm/sdk/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */