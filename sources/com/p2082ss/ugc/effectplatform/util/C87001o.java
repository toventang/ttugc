package com.p2082ss.ugc.effectplatform.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.o */
public final class C87001o {

    /* renamed from: a */
    public static final C87001o f196170a = new C87001o();

    private C87001o() {
    }

    static {
        Covode.recordClassIndex(102767);
    }

    /* renamed from: a */
    private static NetworkInfo m150689a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public static boolean m150692a(Object obj) {
        if (obj != null && (obj instanceof Context)) {
            return m150691a((Context) obj);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m150691a(Context context) {
        try {
            Object a = m150690a(context, "connectivity");
            if (a != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) a;
                if (connectivityManager == null) {
                    return false;
                }
                NetworkInfo a2 = m150689a(connectivityManager);
                C89219l.m154709a((Object) a2, "");
                return a2.isConnected();
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m150690a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1810);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(1810);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
