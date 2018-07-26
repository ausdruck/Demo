package com.baidu.android.common.logging;

import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Log {
    public static final int FILE_LIMETE = 10485760;
    public static final int FILE_NUMBER = 2;
    private static Logger sFilelogger;
    private static boolean sLog2File = false;
    private static boolean sLogEnabled = true;

    private Log() {
    }

    /* renamed from: d */
    public static void m1728d(String str, String str2) {
        if (!sLogEnabled) {
            return;
        }
        if (!sLog2File || sFilelogger == null) {
            android.util.Log.d(str, str2);
        } else {
            sFilelogger.log(Level.INFO, str + ": " + str2);
        }
    }

    /* renamed from: d */
    public static void m1729d(String str, String str2, Throwable th) {
        m1728d(str, str2 + '\n' + getStackTraceString(th));
    }

    /* renamed from: e */
    public static void m1730e(String str, String str2) {
        if (!sLogEnabled) {
            return;
        }
        if (!sLog2File || sFilelogger == null) {
            android.util.Log.e(str, str2);
        } else {
            sFilelogger.log(Level.SEVERE, str + ": " + str2);
        }
    }

    /* renamed from: e */
    public static void m1731e(String str, String str2, Throwable th) {
        m1730e(str, str2 + '\n' + getStackTraceString(th));
    }

    /* renamed from: e */
    public static void m1732e(String str, Throwable th) {
        m1730e(str, getStackTraceString(th));
    }

    private static String getLogFileName() {
        String processNameForPid = getProcessNameForPid(Process.myPid());
        if (TextUtils.isEmpty(processNameForPid)) {
            processNameForPid = "BaiduFileLog";
        }
        return processNameForPid.replace(':', '_');
    }

    private static String getProcessNameForPid(int i) {
        Exception e;
        String str = "/proc/" + i + "/cmdline";
        String str2 = "/proc/" + i + "/status";
        String str3 = "";
        try {
            BufferedReader bufferedReader;
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(str)));
            String readLine = bufferedReader2.readLine();
            BufferedReader bufferedReader3;
            if (TextUtils.isEmpty(readLine)) {
                bufferedReader2 = new BufferedReader(new FileReader(new File(str2)));
                str2 = bufferedReader2.readLine();
                while (str2 != null) {
                    if (str2.startsWith("Name:")) {
                        int indexOf = str2.indexOf("\t");
                        if (indexOf >= 0) {
                            bufferedReader3 = bufferedReader2;
                            str = str2.substring(indexOf + 1);
                            bufferedReader = bufferedReader3;
                        }
                        bufferedReader3 = bufferedReader2;
                        str = str3;
                        bufferedReader = bufferedReader3;
                    } else {
                        str2 = bufferedReader2.readLine();
                    }
                }
                bufferedReader3 = bufferedReader2;
                str = str3;
                bufferedReader = bufferedReader3;
            } else {
                bufferedReader3 = bufferedReader2;
                str = readLine.substring(0, readLine.indexOf(0));
                bufferedReader = bufferedReader3;
            }
            try {
                bufferedReader.close();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            str = str3;
            e = exception;
            e.printStackTrace();
            return str;
        }
        return str;
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static void m1733i(String str, String str2) {
        if (!sLogEnabled) {
            return;
        }
        if (!sLog2File || sFilelogger == null) {
            android.util.Log.i(str, str2);
        } else {
            sFilelogger.log(Level.INFO, str + ": " + str2);
        }
    }

    /* renamed from: i */
    public static void m1734i(String str, String str2, Throwable th) {
        m1733i(str, str2 + '\n' + getStackTraceString(th));
    }

    public static void setLog2File(boolean z) {
        sLog2File = z;
        if (sLog2File && sFilelogger == null) {
            String logFileName = getLogFileName();
            try {
                Handler fileHandler = new FileHandler(new File(Environment.getExternalStorageDirectory(), logFileName).getAbsolutePath() + "_%g.log", FILE_LIMETE, 2, true);
                fileHandler.setFormatter(new SimpleFormatter());
                sFilelogger = Logger.getLogger(logFileName);
                sFilelogger.setLevel(Level.ALL);
                sFilelogger.addHandler(fileHandler);
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void setLogEnabled(boolean z) {
        sLogEnabled = z;
    }

    /* renamed from: v */
    public static void m1735v(String str, String str2) {
        if (!sLogEnabled) {
            return;
        }
        if (!sLog2File || sFilelogger == null) {
            android.util.Log.v(str, str2);
        } else {
            sFilelogger.log(Level.INFO, str + ": " + str2);
        }
    }

    /* renamed from: v */
    public static void m1736v(String str, String str2, Throwable th) {
        m1735v(str, str2 + '\n' + getStackTraceString(th));
    }

    /* renamed from: w */
    public static void m1737w(String str, String str2) {
        if (!sLogEnabled) {
            return;
        }
        if (!sLog2File || sFilelogger == null) {
            android.util.Log.w(str, str2);
        } else {
            sFilelogger.log(Level.WARNING, str + ": " + str2);
        }
    }

    /* renamed from: w */
    public static void m1738w(String str, String str2, Throwable th) {
        m1737w(str, str2 + '\n' + getStackTraceString(th));
    }
}
