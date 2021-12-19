package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.a */
public final class C81847a {

    /* renamed from: a */
    private static volatile boolean f183007a;

    static {
        Covode.recordClassIndex(95261);
    }

    /* renamed from: a */
    public static void m141746a() {
        MethodCollector.m26663i(10199);
        if (!f183007a) {
            synchronized (C81868j.class) {
                try {
                    if (!f183007a) {
                        m141749b();
                        f183007a = true;
                    }
                } finally {
                    MethodCollector.m26664o(10199);
                }
            }
            return;
        }
        MethodCollector.m26664o(10199);
    }

    /* renamed from: b */
    private static void m141749b() {
        try {
            Reflect call = Reflect.m24528on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            if (call != null) {
                Class<?> cls = Class.forName("android.app.ActivityThread$H");
                Reflect on = Reflect.m24528on(Class.forName("android.app.ActivityThread$H"));
                int intValue = ((Integer) on.field("SCHEDULE_CRASH", new Class[0]).get()).intValue();
                int intValue2 = ((Integer) on.field("RECEIVER", new Class[0]).get()).intValue();
                int intValue3 = ((Integer) on.field("CREATE_SERVICE", new Class[0]).get()).intValue();
                int intValue4 = ((Integer) on.field("BIND_SERVICE", new Class[0]).get()).intValue();
                int intValue5 = ((Integer) on.field("SERVICE_ARGS", new Class[0]).get()).intValue();
                Handler handler = (Handler) call.field("mH", cls).get();
                if (handler != null) {
                    Reflect on2 = Reflect.m24529on(handler);
                    on2.set("mCallback", new C81858b(intValue, intValue2, intValue3, intValue4, intValue5, (Handler.Callback) on2.field("mCallback", Handler.Callback.class).get()));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m141747a(boolean z) {
        if (z) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81847a.RunnableC818481 */

                static {
                    Covode.recordClassIndex(95262);
                }

                public final void run() {
                    C81847a.m141746a();
                }
            });
            C81890x.f183054a.execute(new Runnable() {
                /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81847a.RunnableC818492 */

                static {
                    Covode.recordClassIndex(95263);
                }

                public final void run() {
                    C81847a.m141746a();
                }
            });
            return;
        }
        m141749b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r1.contains("com.adm") == false) goto L_0x006b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ boolean m141748a(int r5, int r6, int r7, int r8, int r9, android.os.Handler.Callback r10, android.os.Message r11) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.interaction.C81847a.m141748a(int, int, int, int, int, android.os.Handler$Callback, android.os.Message):boolean");
    }
}
