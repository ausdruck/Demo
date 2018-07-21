package com.baidu.cloudsdk.common.http;

import android.os.Looper;
import android.os.Message;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHttpResponseHandler
  extends HttpResponseHandler
{
  protected static final int SUCCESS_JSON_MESSAGE = 100;
  
  public JsonHttpResponseHandler() {}
  
  public JsonHttpResponseHandler(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  protected void handleFailureMessage(Throwable paramThrowable, String paramString)
  {
    if (paramString != null)
    {
      try
      {
        Object localObject = parseResponse(paramString);
        if ((localObject instanceof JSONObject))
        {
          onFailure(paramThrowable, (JSONObject)localObject);
          return;
        }
        if ((localObject instanceof JSONArray))
        {
          onFailure(paramThrowable, (JSONArray)localObject);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        onFailure(paramThrowable, paramString);
        return;
      }
      onFailure(paramThrowable, paramString);
      return;
    }
    onFailure(paramThrowable, "");
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
      return;
    }
    paramMessage = (Object[])paramMessage.obj;
    handleSuccessJsonMessage(((Integer)paramMessage[0]).intValue(), paramMessage[1]);
  }
  
  protected void handleSuccessJsonMessage(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof JSONObject))
    {
      onSuccess(paramInt, (JSONObject)paramObject);
      return;
    }
    if ((paramObject instanceof JSONArray))
    {
      onSuccess(paramInt, (JSONArray)paramObject);
      return;
    }
    onFailure(new JSONException("Unexpected type " + paramObject.getClass().getName()), "");
  }
  
  protected void onFailure(Throwable paramThrowable, JSONArray paramJSONArray) {}
  
  protected void onFailure(Throwable paramThrowable, JSONObject paramJSONObject) {}
  
  protected void onSuccess(int paramInt, JSONArray paramJSONArray)
  {
    onSuccess(paramJSONArray);
  }
  
  protected void onSuccess(int paramInt, JSONObject paramJSONObject)
  {
    onSuccess(paramJSONObject);
  }
  
  protected void onSuccess(JSONArray paramJSONArray) {}
  
  protected void onSuccess(JSONObject paramJSONObject) {}
  
  protected Object parseResponse(String paramString)
    throws JSONException
  {
    Object localObject = null;
    String str = paramString.trim();
    if (!str.startsWith("{"))
    {
      paramString = (String)localObject;
      if (!str.startsWith("[")) {}
    }
    else
    {
      paramString = new JSONTokener(str).nextValue();
    }
    localObject = paramString;
    if (paramString == null) {
      localObject = str;
    }
    return localObject;
  }
  
  protected void sendSuccessMessage(int paramInt, String paramString)
  {
    if (paramInt != 204) {
      try
      {
        sendMessage(obtainMessage(100, new Object[] { Integer.valueOf(paramInt), parseResponse(paramString) }));
        return;
      }
      catch (JSONException localJSONException)
      {
        sendFailureMessage(localJSONException, paramString);
        return;
      }
    }
    sendMessage(obtainMessage(100, new Object[] { Integer.valueOf(paramInt), new JSONObject() }));
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes-dex2jar.jar!/com/baidu/cloudsdk/common/http/JsonHttpResponseHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */