package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;

public final class cu {
    /* renamed from: a */
    private static final Proxy f19624a = new Proxy(Type.HTTP, new InetSocketAddress("10.0.0.172", 80));
    /* renamed from: b */
    private static final Proxy f19625b = new Proxy(Type.HTTP, new InetSocketAddress("10.0.0.200", 80));

    /* renamed from: a */
    public static String m15627a() {
        String str = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e) {
        }
        return str;
    }

    /* renamed from: a */
    public static File m15626a(String str) {
        if (!"mounted".equals(m15627a())) {
            return null;
        }
        File externalStorageDirectory;
        try {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        } catch (Exception e) {
            externalStorageDirectory = null;
        }
        if (externalStorageDirectory != null) {
            return new File(externalStorageDirectory, str);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static void m15630a(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
        if (r4 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = 0;
        if (r7 == 0) goto L_0x0020;
    L_0x0006:
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
    L_0x0009:
        r0 = r4.openFileOutput(r5, r1);	 Catch:{ Exception -> 0x0022, all -> 0x0027 }
        r1 = new java.io.ByteArrayInputStream;	 Catch:{ Exception -> 0x0022, all -> 0x002f }
        r2 = "utf-8";
        r2 = r6.getBytes(r2);	 Catch:{ Exception -> 0x0022, all -> 0x002f }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0022, all -> 0x002f }
        com.baidu.mobstat.da.m15654a(r1, r0);	 Catch:{ Exception -> 0x0022, all -> 0x002f }
        com.baidu.mobstat.da.m15653a(r0);
        goto L_0x0002;
    L_0x0020:
        r1 = 0;
        goto L_0x0009;
    L_0x0022:
        r1 = move-exception;
        com.baidu.mobstat.da.m15653a(r0);
        goto L_0x0002;
    L_0x0027:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x002b:
        com.baidu.mobstat.da.m15653a(r1);
        throw r0;
    L_0x002f:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mobstat.cu.a(android.content.Context, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public static void m15631a(String str, String str2, boolean z) {
        Throwable th;
        Closeable closeable = null;
        try {
            Closeable fileOutputStream;
            File a = m15626a(str);
            if (a != null) {
                if (!a.exists()) {
                    File parentFile = a.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                }
                fileOutputStream = new FileOutputStream(a, z);
                try {
                    da.m15654a(new ByteArrayInputStream(str2.getBytes("utf-8")), fileOutputStream);
                } catch (Exception e) {
                    closeable = fileOutputStream;
                    da.m15653a(closeable);
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    closeable = fileOutputStream;
                    th = th3;
                    da.m15653a(closeable);
                    throw th;
                }
            }
            fileOutputStream = null;
            da.m15653a(fileOutputStream);
        } catch (Exception e2) {
            da.m15653a(closeable);
        } catch (Throwable th4) {
            th = th4;
            da.m15653a(closeable);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m15628a(Context context, String str) {
        Throwable th;
        Closeable closeable = null;
        Closeable openFileInput;
        try {
            openFileInput = context.openFileInput(str);
            try {
                byte[] a = m15632a((InputStream) openFileInput);
                if (a != null) {
                    String str2 = new String(a, "utf-8");
                    da.m15653a(openFileInput);
                    return str2;
                }
                da.m15653a(openFileInput);
                return "";
            } catch (Exception e) {
                closeable = openFileInput;
                da.m15653a(closeable);
                return "";
            } catch (Throwable th2) {
                th = th2;
                da.m15653a(openFileInput);
                throw th;
            }
        } catch (Exception e2) {
            da.m15653a(closeable);
            return "";
        } catch (Throwable th3) {
            Throwable th4 = th3;
            openFileInput = null;
            th = th4;
            da.m15653a(openFileInput);
            throw th;
        }
    }

    /* renamed from: b */
    public static String m15633b(String str) {
        Throwable th;
        File a = m15626a(str);
        if (a != null && a.exists()) {
            Closeable closeable = null;
            Closeable fileInputStream;
            try {
                fileInputStream = new FileInputStream(a);
                try {
                    byte[] a2 = m15632a((InputStream) fileInputStream);
                    if (a2 != null) {
                        String str2 = new String(a2, "utf-8");
                        da.m15653a(fileInputStream);
                        return str2;
                    }
                    da.m15653a(fileInputStream);
                } catch (Exception e) {
                    closeable = fileInputStream;
                    da.m15653a(closeable);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    da.m15653a(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                da.m15653a(closeable);
                return "";
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileInputStream = null;
                th = th4;
                da.m15653a(fileInputStream);
                throw th;
            }
        }
        return "";
    }

    /* renamed from: a */
    private static byte[] m15632a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        return da.m15654a(inputStream, byteArrayOutputStream) ? byteArrayOutputStream.toByteArray() : null;
    }

    /* renamed from: b */
    public static boolean m15634b(Context context, String str) {
        return context.deleteFile(str);
    }

    /* renamed from: c */
    public static boolean m15636c(String str) {
        File a = m15626a(str);
        if (a == null || !a.isFile()) {
            return false;
        }
        return a.delete();
    }

    /* renamed from: c */
    public static boolean m15635c(Context context, String str) {
        return context.getFileStreamPath(str).exists();
    }

    /* renamed from: d */
    public static HttpURLConnection m15637d(Context context, String str) {
        return m15629a(context, str, 50000, 50000);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public static HttpURLConnection m15629a(Context context, String str, int i, int i2) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo2 == null || !networkInfo2.isAvailable()) {
            if (networkInfo != null && networkInfo.isAvailable()) {
                String extraInfo = networkInfo.getExtraInfo();
                extraInfo = extraInfo != null ? extraInfo.toLowerCase() : "";
                db.m15657a(extraInfo);
                if (extraInfo.startsWith("cmwap") || extraInfo.startsWith("uniwap") || extraInfo.startsWith("3gwap")) {
                    httpURLConnection = (HttpURLConnection) url.openConnection(f19624a);
                } else if (extraInfo.startsWith("ctwap")) {
                    httpURLConnection = (HttpURLConnection) url.openConnection(f19625b);
                }
            }
            httpURLConnection = null;
        } else {
            db.m15657a("WIFI is available");
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        if (httpURLConnection == null) {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i2);
        return httpURLConnection;
    }

    /* renamed from: e */
    public static boolean m15638e(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) != -1;
        } catch (Exception e) {
            db.m15661b("Check permission failed.");
            return false;
        }
    }
}
