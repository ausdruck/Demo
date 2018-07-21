package com.baidu.navi.logic;

public abstract interface AppCommandConst
{
  public static final String HOME_NOTIFY_NEWS_LAST_UPDATE_TIME = "home_notify_news_last_update_time";
  public static final String K_COMMAND_PARAM_KEY_CAR_CITYID = "appparam.car.cityid";
  public static final String K_COMMAND_PARAM_KEY_CAR_CURCITY = "appparam.car.curcityid";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_CITYID = "appparam.plugin.cityid";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_COUNT = "appparam.plugin.count";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_ID = "appparam.plugin.id";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_PAGE = "appparam.plugin.page";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_QUERYTYPENO = "appparam.plugin.querytypenum";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_SEARCHNAME = "appparam.plugin.searchname";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_VERSIONCODE = "appparam.plugin.versioncode";
  public static final String K_COMMAND_PARAM_KEY_PLUGIN_VERSIONLIST = "appparam.plugin.versionlist";
  public static final String K_COMMAND_PARAM_KEY_SHARE_NAME = "appparam.share.name";
  public static final String K_COMMAND_PARAM_KEY_SHARE_POINT = "appparam.share.poipoint";
  public static final String K_COMMAND_PARAM_KEY_SHARE_SHORTURI = "appparam.share.shorturi";
  public static final String K_COMMAND_PARAM_KEY_USERCENTER_CALCSCORE = "appparam.usercenter.calcscore";
  public static final String K_COMMAND_PARAM_KEY_USERCENTER_GETNEWS = "appparam.usercenter.getnews";
  public static final String K_COMMAND_PARAM_KEY_USERCENTER_LOGIN = "appparam.usercenter.login";
  public static final String K_COMMAND_PARAM_KEY_USERCENTER_NEWSITEM = "appparam.usercenter.newsitem";
  public static final String K_COMMAND_PARAM_KEY_USERCENTER_SHORT_URL = "appparam.usercenter.shorturl";
  public static final int K_MSG_APP_BASE = 1000000;
  public static final int K_MSG_CAR_BASE = 1003000;
  public static final int K_MSG_CAR_GETUSERCARNOINFO = 1003001;
  public static final int K_MSG_CAR_GETUSERCARTYPEINFO = 1003002;
  public static final int K_MSG_PLUGIN_BASE = 1001000;
  public static final int K_MSG_PLUGIN_GETCARINFO = 1001003;
  public static final int K_MSG_PLUGIN_GETLIST = 1001001;
  public static final int K_MSG_PLUGIN_GETWEATHER = 1001002;
  public static final int K_MSG_SHARE_BASE = 1002000;
  public static final int K_MSG_SHARE_GETPOIDETAIL = 1002002;
  public static final int K_MSG_SHARE_GETSHORTURL = 1002001;
  public static final int K_MSG_SHARE_PARSESHORTURL = 1002003;
  public static final int K_MSG_USERCENTER_BASE = 1000000;
  public static final int K_MSG_USERCENTER_CALC_SCORE = 1000009;
  public static final int K_MSG_USERCENTER_DELETE_MESSAGE = 1000005;
  public static final int K_MSG_USERCENTER_GET_MESSAGE = 1000002;
  public static final int K_MSG_USERCENTER_GET_NOT_SYNC_MILLEAGE = 1000010;
  public static final int K_MSG_USERCENTER_GET_SCORE = 1000007;
  public static final int K_MSG_USERCENTER_GET_SHOP_ADDR = 1000008;
  public static final int K_MSG_USERCENTER_HOME_NOTIFY_MSG = 1000004;
  public static final int K_MSG_USERCENTER_LOGIN = 1000011;
  public static final int K_MSG_USERCENTER_MARK_MESSAGE = 1000003;
  public static final int K_MSG_USERCENTER_NEW_MESSAGE = 1000001;
  public static final int K_MSG_USERCENTER_OFFLINE_DATA_UPDATE_FINISH = 1000006;
  public static final int K_MSG_USERCENTER_SHORT_URL = 1000012;
  public static final int K_SUBSYSTEM_APP = 5;
  public static final String SCORE_SHOP_ADDR = "score_shop_addr";
  public static final String SP_DEFAULT_MILEAGE_TEXT = "0km";
  public static final int SP_DEFAULT_MILEAGE_VALUE = 0;
  public static final String SP_DEFAULT_SCORE_TEXT = "0分";
  public static final int SP_DEFAULT_SCORE_VALUE = 0;
  public static final String SP_MILEAGE_DESCRIPTION_TEXT = "sp_mileage_description_text";
  public static final String SP_MILEAGE_TEXT = "sp_mileage_key";
  public static final String SP_NEW_MESSAGE_COUNT = "sp_new_message_count";
  public static final String SP_SCORE_TEXT = "sp_score_key";
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/navi/logic/AppCommandConst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */