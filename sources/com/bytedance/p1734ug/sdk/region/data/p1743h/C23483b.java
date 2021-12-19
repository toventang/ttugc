package com.bytedance.p1734ug.sdk.region.data.p1743h;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
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

/* renamed from: com.bytedance.ug.sdk.region.data.h.b */
public final class C23483b {
    static {
        Covode.recordClassIndex(27484);
    }

    /* renamed from: a */
    public static String m44174a() {
        try {
            return Resources.getSystem().getConfiguration().locale.getCountry();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m44175a(Context context) {
        try {
            return ((TelephonyManager) m44173a(context, "phone")).getSimCountryIso();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m44176b(Context context) {
        try {
            return ((TelephonyManager) m44173a(context, "phone")).getNetworkCountryIso();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m44173a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10304);
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
                    MethodCollector.m26664o(10304);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
