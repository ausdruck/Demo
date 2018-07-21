package com.baidu.mapframework.nirvana.network.asynchttp;

import com.baidu.mapframework.commonlib.asynchttp.JsonHttpResponseHandler;
import com.baidu.mapframework.commonlib.asynchttp.NirvanaResponseHandlerInterface;
import com.baidu.mapframework.nirvana.module.Module;
import com.baidu.mapframework.nirvana.schedule.ScheduleConfig;

public class NirvanaJsonHttpResponseHandler
  extends JsonHttpResponseHandler
  implements NirvanaResponseHandlerInterface
{
  public NirvanaJsonHttpResponseHandler(Module paramModule, ScheduleConfig paramScheduleConfig)
  {
    this(paramModule, paramScheduleConfig, "UTF-8");
  }
  
  public NirvanaJsonHttpResponseHandler(Module paramModule, ScheduleConfig paramScheduleConfig, String paramString)
  {
    super(paramString);
    this.module = paramModule;
    this.scheduleConfig = paramScheduleConfig;
  }
  
  public NirvanaJsonHttpResponseHandler(Module paramModule, ScheduleConfig paramScheduleConfig, String paramString, boolean paramBoolean)
  {
    this(paramModule, paramScheduleConfig, paramString);
    this.useRFC5179CompatibilityMode = paramBoolean;
  }
  
  public NirvanaJsonHttpResponseHandler(Module paramModule, ScheduleConfig paramScheduleConfig, boolean paramBoolean)
  {
    this(paramModule, paramScheduleConfig, "UTF-8");
    this.useRFC5179CompatibilityMode = paramBoolean;
  }
  
  public Module getNirvanaModule()
  {
    return this.module;
  }
  
  public ScheduleConfig getNirvanaScheduleConfig()
  {
    return this.scheduleConfig;
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/mapframework/nirvana/network/asynchttp/NirvanaJsonHttpResponseHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */