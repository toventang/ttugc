package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.gms.internal.measurement.az */
public class C25829az {

    /* renamed from: a */
    private static UserManager f60943a;

    /* renamed from: b */
    private static volatile boolean f60944b = (!m50014a());

    /* renamed from: c */
    private static boolean f60945c = false;

    private C25829az() {
    }

    /* renamed from: a */
    public static boolean m50014a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(31244);
    }

    /* renamed from: a */
    static boolean m50015a(Context context) {
        MethodCollector.m26663i(5027);
        if (f60944b) {
            MethodCollector.m26664o(5027);
            return true;
        }
        synchronized (C25829az.class) {
            try {
                if (f60944b) {
                    return true;
                }
                boolean b = m50016b(context);
                if (b) {
                    f60944b = b;
                }
                MethodCollector.m26664o(5027);
                return b;
            } finally {
                MethodCollector.m26664o(5027);
            }
        }
    }

    /* renamed from: b */
    private static boolean m50016b(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f60943a == null) {
                f60943a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f60943a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
                if (z) {
                    f60943a = null;
                }
            } catch (NullPointerException unused) {
                f60943a = null;
                i++;
            }
        }
        return z;
    }
}
