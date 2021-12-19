package com.bytedance.push.p1588a;

import android.content.Context;
import android.os.Looper;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.message.C30066d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.push.a.a */
public class C21758a {

    /* renamed from: c */
    private static volatile C21758a f51567c;

    /* renamed from: a */
    public final Context f51568a;

    /* renamed from: b */
    public final WeakHandler f51569b;

    static {
        Covode.recordClassIndex(25407);
    }

    /* renamed from: a */
    public final void mo35394a() {
        RunnableC217591 r2 = new Runnable() {
            /* class com.bytedance.push.p1588a.C21758a.RunnableC217591 */

            static {
                Covode.recordClassIndex(25408);
            }

            public final void run() {
                C21758a.this.mo35395b();
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC13596e.m24423a(r2);
        } else {
            r2.run();
        }
    }

    /* renamed from: b */
    public final synchronized AbstractC21760b mo35395b() {
        AbstractC21760b bVar;
        MethodCollector.m26663i(2859);
        try {
            Class<?> cls = Class.forName("com.a.b.AKeeperImpl");
            bVar = (AbstractC21760b) cls.getMethod("inst", new Class[0]).invoke(cls, new Object[0]);
            MethodCollector.m26664o(2859);
        } catch (Throwable unused) {
            MethodCollector.m26664o(2859);
            return null;
        }
        return bVar;
    }

    private C21758a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f51568a = applicationContext;
        this.f51569b = C30066d.m60817a().f71759a;
    }

    /* renamed from: a */
    public static C21758a m40727a(Context context) {
        MethodCollector.m26663i(2840);
        if (f51567c == null) {
            synchronized (C21758a.class) {
                try {
                    if (f51567c == null) {
                        f51567c = new C21758a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2840);
                    throw th;
                }
            }
        }
        C21758a aVar = f51567c;
        MethodCollector.m26664o(2840);
        return aVar;
    }
}
