package com.tencent.p280a.p281a.p282a.p283a;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import com.baidu.che.codriver.sdk.p081a.C2602k.C1981b;
import com.baidu.navisdk.util.common.SystemAuth;
import com.tencent.wxop.stat.p291b.C6139h;
import org.json.JSONObject;

/* renamed from: com.tencent.a.a.a.a.h */
public final class C6085h {
    /* renamed from: a */
    static String m21662a(Context context) {
        try {
            if (C6085h.m21665a(context, SystemAuth.READ_PHONE_STATE_AUTH)) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            }
            Log.i("MID", "Could not get permission of android.permission.READ_PHONE_STATE");
        } catch (Throwable th) {
            Log.w("MID", th);
        }
        return "";
    }

    /* renamed from: a */
    private static void m21663a(String str, Throwable th) {
        Log.e("MID", str, th);
    }

    /* renamed from: a */
    static void m21664a(JSONObject jSONObject, String str, String str2) {
        if (C6085h.m21666a(str2)) {
            jSONObject.put(str, str2);
        }
    }

    /* renamed from: a */
    static boolean m21665a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            C6085h.m21663a("checkPermission error", th);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m21666a(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    /* renamed from: b */
    static String m21667b(Context context) {
        if (C6085h.m21665a(context, "android.permission.ACCESS_WIFI_STATE")) {
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService(C1981b.f6365e);
                return wifiManager == null ? "" : wifiManager.getConnectionInfo().getMacAddress();
            } catch (Exception e) {
                Log.i("MID", "get wifi address error" + e);
                return "";
            }
        }
        Log.i("MID", "Could not get permission of android.permission.ACCESS_WIFI_STATE");
        return "";
    }

    /* renamed from: b */
    public static boolean m21668b(String str) {
        return str != null && str.trim().length() >= 40;
    }

    /* renamed from: c */
    static String m21669c(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C6139h.m21848b(Base64.decode(str.getBytes("UTF-8"), 0)), "UTF-8").trim().replace("\t", "").replace("\n", "").replace("\r", "");
        } catch (Throwable th) {
            C6085h.m21663a("decode error", th);
            return str;
        }
    }

    /* renamed from: d */
    static String m21670d(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(Base64.encode(C6139h.m21846a(str.getBytes("UTF-8")), 0), "UTF-8").trim().replace("\t", "").replace("\n", "").replace("\r", "");
        } catch (Throwable th) {
            C6085h.m21663a("decode error", th);
            return str;
        }
    }
}
