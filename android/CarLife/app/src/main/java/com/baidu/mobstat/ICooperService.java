package com.baidu.mobstat;

import android.content.Context;
import android.telephony.TelephonyManager;
import org.json.JSONObject;

public abstract interface ICooperService
{
  public abstract boolean checkCellLocationSetting(Context paramContext);
  
  public abstract boolean checkGPSLocationSetting(Context paramContext);
  
  public abstract boolean checkWifiLocationSetting(Context paramContext);
  
  public abstract String getAppChannel(Context paramContext);
  
  public abstract String getAppKey(Context paramContext);
  
  public abstract int getAppVersionCode(Context paramContext);
  
  public abstract String getAppVersionName(Context paramContext);
  
  public abstract String getCUID(Context paramContext, boolean paramBoolean);
  
  public abstract String getDeviceId(TelephonyManager paramTelephonyManager, Context paramContext);
  
  public abstract String getHost();
  
  public abstract String getLinkedWay(Context paramContext);
  
  public abstract String getMTJSDKVersion();
  
  public abstract String getOSVersion();
  
  public abstract String getOperator(TelephonyManager paramTelephonyManager);
  
  public abstract String getPhoneModel();
  
  public abstract String getSecretValue(String paramString);
  
  public abstract int getTagValue();
  
  public abstract void installHeader(Context paramContext, JSONObject paramJSONObject);
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/mobstat/ICooperService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */