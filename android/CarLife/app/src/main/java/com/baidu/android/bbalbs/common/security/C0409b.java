package com.baidu.android.bbalbs.common.security;

import java.security.MessageDigest;

/* renamed from: com.baidu.android.bbalbs.common.security.b */
public final class C0409b {
    /* renamed from: a */
    public static String m1725a(byte[] bArr, String str, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            String toHexString = Integer.toHexString(b & 255);
            if (z) {
                toHexString = toHexString.toUpperCase();
            }
            if (toHexString.length() == 1) {
                stringBuilder.append("0");
            }
            stringBuilder.append(toHexString).append(str);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m1726a(byte[] bArr, boolean z) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            return C0409b.m1725a(instance.digest(), "", z);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
