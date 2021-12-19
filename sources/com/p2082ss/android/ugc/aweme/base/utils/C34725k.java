package com.p2082ss.android.ugc.aweme.base.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.base.utils.k */
public class C34725k {

    /* renamed from: a */
    private static final String f82014a = C34725k.class.getSimpleName();

    static {
        Covode.recordClassIndex(41717);
    }

    /* renamed from: a */
    public static String m70938a() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) m70940b(C17867d.m33078a(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getNetworkOperator();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static int m70937a(Context context) {
        String a = m70939a(context, "-1");
        if ("46000".equals(a) || "46002".equals(a) || "46007".equals(a)) {
            return 3;
        }
        if ("46001".equals(a) || "46006".equals(a) || "46009".equals(a)) {
            return 2;
        }
        if ("46003".equals(a) || "46005".equals(a) || "46011".equals(a)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static String m70939a(Context context, String str) {
        if (context == null) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) m70940b(context, "phone");
            if (telephonyManager == null) {
                return str;
            }
            return telephonyManager.getSimOperator();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: b */
    private static Object m70940b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13863);
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
                    MethodCollector.m26664o(13863);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
