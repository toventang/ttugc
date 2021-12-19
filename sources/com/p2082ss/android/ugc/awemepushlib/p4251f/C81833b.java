package com.p2082ss.android.ugc.awemepushlib.p4251f;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.awemepushlib.f.b */
public final class C81833b {

    /* renamed from: a */
    private static int f182967a = -1;

    /* renamed from: b */
    private static int f182968b = -1;

    /* renamed from: c */
    private static final Pattern f182969c = Pattern.compile("^0-([\\d]+)$");

    static {
        Covode.recordClassIndex(95246);
    }

    /* renamed from: a */
    public static boolean m141724a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m141725a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return Settings.canDrawOverlays(context);
            } catch (Throwable unused) {
            }
        }
        try {
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) m141723a(context, "appops"), Integer.valueOf(AppOpsManager.class.getField("OP_SYSTEM_ALERT_WINDOW").getInt(null)), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private static Object m141723a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10097);
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
                    MethodCollector.m26664o(10097);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
