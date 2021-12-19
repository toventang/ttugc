package com.appsflyer.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.AndroidUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.appsflyer.internal.p */
public final class C2324p {
    static {
        Covode.recordClassIndex(2592);
    }

    C2324p() {
    }

    /* renamed from: com.appsflyer.internal.p$a */
    public static final class C2325a {

        /* renamed from: Ι */
        public static final C2324p f7085 = new C2324p();

        static {
            Covode.recordClassIndex(2593);
        }
    }

    /* renamed from: ı */
    public static Location m7126(Context context) {
        try {
            m7125xffaf7d5(context, "location");
            m7127(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            m7127(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ǃ */
    private static boolean m7127(Context context, String[] strArr) {
        for (String str : strArr) {
            if (AndroidUtils.isPermissionAvailable(context, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com_appsflyer_internal_p_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m7125xffaf7d5(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2800);
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
                    MethodCollector.m26664o(2800);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
