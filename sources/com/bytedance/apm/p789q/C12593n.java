package com.bytedance.apm.p789q;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21454c;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.apm.q.n */
public final class C12593n {

    /* renamed from: a */
    private static String f30624a;

    static {
        Covode.recordClassIndex(14410);
    }

    /* renamed from: a */
    public static String m22697a() {
        String str = f30624a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b = m22698b();
        f30624a = b;
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: b */
    private static String m22698b() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder(32);
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        C21454c.m40295a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                C21454c.m40295a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C21454c.m40295a(bufferedReader);
            return null;
        }
    }
}
