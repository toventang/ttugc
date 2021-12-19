package com.bytedance.android.livesdk.performance;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.livesdk.performance.a */
public class C10084a {

    /* renamed from: a */
    private static BatteryManager f24493a;

    /* renamed from: b */
    private static IntentFilter f24494b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static {
        Covode.recordClassIndex(11647);
    }

    /* renamed from: b */
    public static double m18607b(Context context) {
        if (!m18608c(context)) {
            return -1.0d;
        }
        double longProperty = (double) m18605a(context).getLongProperty(5);
        Double.isNaN(longProperty);
        return (longProperty * 1.0d) / 1000000.0d;
    }

    /* renamed from: c */
    static boolean m18608c(Context context) {
        if (Build.VERSION.SDK_INT < 21 || context == null || m18605a(context) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static BatteryManager m18605a(Context context) {
        MethodCollector.m26663i(10777);
        if (f24493a == null) {
            synchronized (C10084a.class) {
                try {
                    if (f24493a == null) {
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        f24493a = (BatteryManager) m18606a(context, "batterymanager");
                    }
                } finally {
                    MethodCollector.m26664o(10777);
                }
            }
        }
        BatteryManager batteryManager = f24493a;
        MethodCollector.m26664o(10777);
        return batteryManager;
    }

    /* renamed from: a */
    private static Object m18606a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10927);
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
                    MethodCollector.m26664o(10927);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
