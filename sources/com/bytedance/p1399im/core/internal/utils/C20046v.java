package com.bytedance.p1399im.core.internal.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1407c.C19512f;

/* renamed from: com.bytedance.im.core.internal.utils.v */
public final class C20046v {

    /* renamed from: a */
    private static Handler f47642a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(22891);
    }

    /* renamed from: b */
    public static boolean m37934b() {
        if (Looper.getMainLooper() == Looper.myLooper() && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m37931a() {
        if (m37934b()) {
            StringBuilder sb = new StringBuilder(100);
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 1; i < stackTrace.length; i++) {
                sb.append(stackTrace[i].getClassName());
                sb.append(".");
                sb.append(stackTrace[i].getMethodName());
                sb.append("  lines = ");
                sb.append(stackTrace[i].getLineNumber());
                sb.append("\n");
            }
            C19512f.m36457b("imsdk", "can not be call in main thread! trace = \n" + sb.toString(), (Throwable) null);
            throw new Error("can not be call in main thread! trace = " + sb.toString());
        }
    }

    /* renamed from: a */
    public static void m37932a(Runnable runnable) {
        f47642a.post(runnable);
    }

    /* renamed from: b */
    public static void m37933b(final Runnable runnable) {
        RunnableC19987d.m37728a(new AbstractC19986c<Object>() {
            /* class com.bytedance.p1399im.core.internal.utils.C20046v.C200471 */

            static {
                Covode.recordClassIndex(22892);
            }

            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final Object mo31187a() {
                runnable.run();
                return null;
            }
        }, (AbstractC19985b) null);
    }
}
