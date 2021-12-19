package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Locale;

/* renamed from: com.ttnet.org.chromium.net.impl.s */
public final class C87644s {

    /* renamed from: a */
    private static final Object f199091a = new Object();

    /* renamed from: b */
    private static int f199092b = 0;

    static {
        Covode.recordClassIndex(103626);
    }

    /* renamed from: a */
    static void m152413a(StringBuilder sb) {
        sb.append(" Cronet/");
        sb.append("TTNetVersion:a6246045 2021-11-26 QuicVersion:705d0b81 2021-08-12");
    }

    /* renamed from: b */
    private static int m152414b(Context context) {
        int i;
        MethodCollector.m26663i(6461);
        synchronized (f199091a) {
            try {
                if (f199092b == 0) {
                    try {
                        f199092b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
                        IllegalStateException illegalStateException = new IllegalStateException("Cannot determine package version");
                        MethodCollector.m26664o(6461);
                        throw illegalStateException;
                    }
                }
                i = f199092b;
            } finally {
                MethodCollector.m26664o(6461);
            }
        }
        return i;
    }

    /* renamed from: a */
    public static String m152412a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(m152414b(context));
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append(";");
        m152413a(sb);
        sb.append(')');
        return sb.toString();
    }
}
