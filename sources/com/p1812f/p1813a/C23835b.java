package com.p1812f.p1813a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* renamed from: com.f.a.b */
public final class C23835b {

    /* renamed from: a */
    public static AbstractC23844e f56368a;

    /* renamed from: b */
    public static boolean f56369b;

    /* renamed from: c */
    public static boolean f56370c;

    /* renamed from: d */
    public static boolean f56371d = true;

    /* renamed from: e */
    public static Context f56372e;

    static {
        Covode.recordClassIndex(27946);
    }

    /* renamed from: a */
    private static NetworkInfo m45040a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static boolean m45043a(Context context) {
        NetworkInfo a;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m45041a(context, "connectivity");
            if (connectivityManager == null || (a = m45040a(connectivityManager)) == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static Object m45041a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7310);
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
                    MethodCollector.m26664o(7310);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    static void m45042a(boolean z, String str, JSONObject jSONObject) {
        if (!z) {
            Context context = f56372e;
            if (context != null && !m45043a(context)) {
                return;
            }
            if (ApmDelegate.C12507a.f30372a.mo20329a("image_monitor_error_v2")) {
                C12290b.m22064a("image_monitor_error_v2", jSONObject);
            }
        }
        AbstractC23844e eVar = f56368a;
        if (eVar != null) {
            eVar.mo34258a(z, jSONObject);
        }
    }
}
