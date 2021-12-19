package com.bytedance.lighten.loader;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lighten.loader.z */
public final class C20831z {
    static {
        Covode.recordClassIndex(24407);
    }

    /* renamed from: a */
    static C24250e.EnumC24251a m39187a(C20745e.EnumC20748c cVar) {
        if (cVar == C20745e.EnumC20748c.OVERLAY_COLOR) {
            return C24250e.EnumC24251a.OVERLAY_COLOR;
        }
        return C24250e.EnumC24251a.BITMAP_ONLY;
    }

    /* renamed from: a */
    public static Object m39188a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8618);
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
                    MethodCollector.m26664o(8618);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
