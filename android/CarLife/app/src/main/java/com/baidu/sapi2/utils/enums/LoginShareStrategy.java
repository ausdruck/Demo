package com.baidu.sapi2.utils.enums;

import android.text.TextUtils;

public enum LoginShareStrategy
{
  private String a;
  
  private LoginShareStrategy(String paramString)
  {
    this.a = paramString;
  }
  
  public static LoginShareStrategy getDefault()
  {
    return SILENT;
  }
  
  public static LoginShareStrategy mapStrToValue(String paramString)
  {
    Object localObject;
    if (TextUtils.isEmpty(paramString))
    {
      localObject = getDefault();
      return (LoginShareStrategy)localObject;
    }
    LoginShareStrategy[] arrayOfLoginShareStrategy = values();
    int j = arrayOfLoginShareStrategy.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label57;
      }
      LoginShareStrategy localLoginShareStrategy = arrayOfLoginShareStrategy[i];
      localObject = localLoginShareStrategy;
      if (paramString.equals(localLoginShareStrategy.getStrValue())) {
        break;
      }
      i += 1;
    }
    label57:
    return getDefault();
  }
  
  public String getStrValue()
  {
    return this.a;
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/sapi2/utils/enums/LoginShareStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */