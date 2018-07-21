package com.baidu.navisdk.util.statistic.datacheck.regular;

import android.os.Bundle;
import com.baidu.navisdk.util.statistic.datacheck.DataCheckHelper;
import com.baidu.navisdk.util.statistic.datacheck.GeneralRegularData;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LongValueRegular
  extends Regular
{
  public long a = Long.MIN_VALUE;
  public List<Long> arrValues = null;
  public long b = Long.MAX_VALUE;
  public long fixValue = Long.MIN_VALUE;
  private Pattern pattern = null;
  public String regex = null;
  
  public LongValueRegular(GeneralRegularData paramGeneralRegularData, String paramString1, String paramString2, String paramString3)
  {
    super(paramGeneralRegularData, paramString1, paramString2, paramString3);
  }
  
  public boolean check()
  {
    boolean bool2;
    if ((this.mGeneralRegularData != null) && (this.mGeneralRegularData.getDataBundle() != null) && (!this.mGeneralRegularData.getDataBundle().containsKey(this.name))) {
      bool2 = true;
    }
    long l2;
    long l1;
    boolean bool1;
    do
    {
      return bool2;
      l2 = Long.MIN_VALUE;
      bool2 = false;
      l1 = l2;
      bool1 = bool2;
      if (this.mGeneralRegularData != null)
      {
        l1 = l2;
        bool1 = bool2;
        if (this.mGeneralRegularData.getDataBundle() != null)
        {
          l1 = l2;
          bool1 = bool2;
          if (this.mGeneralRegularData.getDataBundle().containsKey(this.name))
          {
            l2 = this.mGeneralRegularData.getDataBundle().getLong(this.name);
            if ((!"f".equals(this.category)) || (this.fixValue != l2)) {
              break;
            }
            bool1 = true;
            l1 = l2;
          }
        }
      }
      bool2 = bool1;
    } while (bool1);
    String str3 = "-";
    String str4 = "[error][name:" + this.name + "][category:" + this.category + "][type:" + this.type + "][regularValue:";
    Object localObject;
    String str2;
    if ("f".equals(this.category))
    {
      localObject = str4 + this.fixValue;
      str2 = "" + this.fixValue;
    }
    for (;;)
    {
      localObject = (String)localObject + "][actualvalue:" + l1 + "]";
      this.mGeneralRegularData.addErrorInfo((String)localObject);
      this.mGeneralRegularData.addToastErrorInfo(this.name, "" + l1);
      try
      {
        localObject = new JSONObject();
        ((JSONObject)localObject).put("name", this.name);
        ((JSONObject)localObject).put("category", this.category);
        ((JSONObject)localObject).put("type", this.type);
        ((JSONObject)localObject).put("regularValue", str2);
        ((JSONObject)localObject).put("actualvalue", "" + l1);
        DataCheckHelper.sUpJsonArr.put(localObject);
        return bool1;
      }
      catch (JSONException localJSONException)
      {
        return bool1;
      }
      if ("v".equals(this.category))
      {
        bool1 = true;
        l1 = l2;
        break;
      }
      if ("arr".equals(this.category))
      {
        if ((this.arrValues != null) && (this.arrValues.contains(Long.valueOf(l2)))) {}
        for (bool1 = true;; bool1 = false)
        {
          l1 = l2;
          break;
        }
      }
      if ("area".equals(this.category))
      {
        if ((this.a != Long.MIN_VALUE) && (this.b != Long.MAX_VALUE))
        {
          if ((l2 > this.a) && (l2 < this.b)) {}
          for (bool1 = true;; bool1 = false)
          {
            l1 = l2;
            break;
          }
        }
        if ((this.a != Long.MIN_VALUE) && (this.b == Long.MAX_VALUE))
        {
          if (l2 > this.a) {}
          for (bool1 = true;; bool1 = false)
          {
            l1 = l2;
            break;
          }
        }
        l1 = l2;
        bool1 = bool2;
        if (this.a != Long.MIN_VALUE) {
          break;
        }
        l1 = l2;
        bool1 = bool2;
        if (this.b == Long.MAX_VALUE) {
          break;
        }
        if (l2 < this.b) {}
        for (bool1 = true;; bool1 = false)
        {
          l1 = l2;
          break;
        }
      }
      l1 = l2;
      bool1 = bool2;
      if (!"regex".equals(this.category)) {
        break;
      }
      if ((this.pattern == null) && (this.regex != null) && (this.regex.length() > 0)) {
        this.pattern = Pattern.compile(this.regex);
      }
      l1 = l2;
      bool1 = bool2;
      if (this.pattern == null) {
        break;
      }
      bool1 = this.pattern.matcher("" + l2).matches();
      l1 = l2;
      break;
      String str1 = str4;
      str2 = str3;
      if (!"v".equals(this.category)) {
        if ("arr".equals(this.category))
        {
          str1 = str4 + this.arrValues;
          str2 = this.arrValues.toString();
        }
        else if ("area".equals(this.category))
        {
          str1 = str4 + this.a + "," + this.b;
          str2 = this.a + "," + this.b;
        }
        else
        {
          str1 = str4;
          str2 = str3;
          if ("regex".equals(this.category))
          {
            str1 = str4 + this.regex;
            str2 = this.regex;
          }
        }
      }
    }
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/navisdk/util/statistic/datacheck/regular/LongValueRegular.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */