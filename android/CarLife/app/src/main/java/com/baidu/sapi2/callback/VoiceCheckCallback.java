package com.baidu.sapi2.callback;

import com.baidu.sapi2.result.VoiceCheckResult;

public abstract class VoiceCheckCallback
  implements IncompleteUserAware<VoiceCheckResult>
{
  public abstract void onAccountTypeConflict(VoiceCheckResult paramVoiceCheckResult);
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/sapi2/callback/VoiceCheckCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */