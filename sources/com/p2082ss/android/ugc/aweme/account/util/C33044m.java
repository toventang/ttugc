package com.p2082ss.android.ugc.aweme.account.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.account.util.m */
public final class C33044m {

    /* renamed from: a */
    public static final C33044m f78591a = new C33044m();

    private C33044m() {
    }

    static {
        Covode.recordClassIndex(39851);
    }

    /* renamed from: a */
    public static final boolean m67681a(Context context) {
        Object obj;
        int simState;
        TelephonyManager telephonyManager = null;
        if (context != null) {
            obj = m67680a(context, "phone");
        } else {
            obj = null;
        }
        if (obj instanceof TelephonyManager) {
            telephonyManager = obj;
        }
        TelephonyManager telephonyManager2 = telephonyManager;
        if (telephonyManager2 == null || (simState = telephonyManager2.getSimState()) == 0 || simState == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m67680a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12638);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12638);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
