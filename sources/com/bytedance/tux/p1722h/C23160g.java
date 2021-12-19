package com.bytedance.tux.p1722h;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.h.g */
public final class C23160g {

    /* renamed from: a */
    private final Vibrator f54814a;

    static {
        Covode.recordClassIndex(27089);
    }

    /* renamed from: a */
    public final void mo37652a() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                VibrationEffect createOneShot = VibrationEffect.createOneShot(85, 61);
                Vibrator vibrator = this.f54814a;
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                    return;
                }
                return;
            }
            Vibrator vibrator2 = this.f54814a;
            if (vibrator2 != null) {
                vibrator2.vibrate(85);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo37653b() {
        if (Build.VERSION.SDK_INT >= 29) {
            VibrationEffect createPredefined = VibrationEffect.createPredefined(0);
            C89219l.m154709a((Object) createPredefined, "");
            Vibrator vibrator = this.f54814a;
            if (vibrator != null) {
                vibrator.vibrate(createPredefined);
            }
        }
    }

    public C23160g(Context context) {
        C89219l.m154719c(context, "");
        Object a = m43651a(context, "vibrator");
        if (a != null) {
            this.f54814a = (Vibrator) a;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    private static Object m43651a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9494);
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
                    MethodCollector.m26664o(9494);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
