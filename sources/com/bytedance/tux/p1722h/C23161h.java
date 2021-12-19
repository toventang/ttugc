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

/* renamed from: com.bytedance.tux.h.h */
public final class C23161h {

    /* renamed from: a */
    public static final C23162a f54815a = new C23162a((byte) 0);

    /* renamed from: b */
    private final Vibrator f54816b;

    static {
        Covode.recordClassIndex(27090);
    }

    /* renamed from: com.bytedance.tux.h.h$a */
    public static final class C23162a {
        static {
            Covode.recordClassIndex(27091);
        }

        private C23162a() {
        }

        public /* synthetic */ C23162a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo37654a() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                VibrationEffect createOneShot = VibrationEffect.createOneShot(12, 200);
                Vibrator vibrator = this.f54816b;
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                    return;
                }
                return;
            }
            Vibrator vibrator2 = this.f54816b;
            if (vibrator2 != null) {
                vibrator2.vibrate(12);
            }
        } catch (Exception unused) {
        }
    }

    public C23161h(Context context) {
        C89219l.m154719c(context, "");
        Object a = m43654a(context, "vibrator");
        if (a != null) {
            this.f54816b = (Vibrator) a;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    private static Object m43654a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9092);
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
                    MethodCollector.m26664o(9092);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
