package com.bytedance.android.ecommerce.ocr.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.ecommerce.ocr.view.d */
public final class C2897d {

    /* renamed from: a */
    public int f8625a;

    /* renamed from: b */
    public WindowManager f8626b;

    /* renamed from: c */
    OrientationEventListener f8627c;

    /* renamed from: d */
    public AbstractC2896c f8628d;

    static {
        Covode.recordClassIndex(3326);
    }

    /* renamed from: a */
    public final void mo7529a() {
        OrientationEventListener orientationEventListener = this.f8627c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f8627c = null;
        this.f8626b = null;
        this.f8628d = null;
    }

    /* renamed from: a */
    public static Object m8207a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4105);
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
                    MethodCollector.m26664o(4105);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
