package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.util.l */
public final class C25610l {

    /* renamed from: a */
    private static String f60722a;

    /* renamed from: b */
    private static int f60723b;

    static {
        Covode.recordClassIndex(31020);
    }

    /* renamed from: a */
    public static String m49426a() {
        if (f60722a == null) {
            if (f60723b == 0) {
                f60723b = Process.myPid();
            }
            f60722a = m49427a(f60723b);
        }
        return f60722a;
    }

    /* renamed from: a */
    private static BufferedReader m49425a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    private static String m49427a(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.m26663i(9603);
        String str = null;
        if (i <= 0) {
            MethodCollector.m26664o(9603);
            return null;
        }
        try {
            bufferedReader = m49425a(new StringBuilder(25).append("/proc/").append(i).append("/cmdline").toString());
            try {
                str = bufferedReader.readLine().trim();
                C25608j.m49418a(bufferedReader);
            } catch (IOException unused) {
                C25608j.m49418a(bufferedReader);
                MethodCollector.m26664o(9603);
                return str;
            } catch (Throwable th2) {
                th = th2;
                C25608j.m49418a(bufferedReader);
                MethodCollector.m26664o(9603);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            C25608j.m49418a(bufferedReader);
            MethodCollector.m26664o(9603);
            return str;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            C25608j.m49418a(bufferedReader);
            MethodCollector.m26664o(9603);
            throw th;
        }
        MethodCollector.m26664o(9603);
        return str;
    }
}
