package com.p2082ss.android.ugc.aweme.shortvideo.p3858s;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.c */
public final class C72829c {
    static {
        Covode.recordClassIndex(85515);
    }

    /* renamed from: a */
    public static NetworkInfo m128600a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    private static NetworkInfo m128603b(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getNetworkInfo(1);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: b */
    public static boolean m128604b(Context context) {
        NetworkInfo a;
        if (context == null || (a = m128600a((ConnectivityManager) m128601a(context, "connectivity"))) == null || !a.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m128605c(Context context) {
        NetworkInfo b;
        if (context == null || (b = m128603b((ConnectivityManager) m128601a(context, "connectivity"))) == null) {
            return false;
        }
        return b.isAvailable();
    }

    /* renamed from: a */
    public static boolean m128602a(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) m128601a(context, "connectivity")).getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Object m128601a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5508);
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
                    MethodCollector.m26664o(5508);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
