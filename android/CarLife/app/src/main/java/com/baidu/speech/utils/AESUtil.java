package com.baidu.speech.utils;

import android.annotation.SuppressLint;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AESUtil {
    private static final String ALGORITHM_NAME = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    public static byte[] decrypt(String str, String str2, byte[] bArr) throws Exception {
        Key secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(str.getBytes()));
        return instance.doFinal(bArr);
    }

    @SuppressLint({"TrulyRandom"})
    public static byte[] encrypt(String str, String str2, byte[] bArr) throws Exception {
        Key secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec(str.getBytes()));
        return instance.doFinal(bArr);
    }
}
