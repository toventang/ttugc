package com.bytedance.android.live.broadcast.p192c;

import com.bytedance.android.live.broadcast.p192c.p193a.p194a.C3189b;
import com.bytedance.android.live.effect.api.AbstractC4169e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.broadcast.c.c */
public class C3216c {

    /* renamed from: c */
    private static volatile C3216c f9246c;

    /* renamed from: a */
    public C3189b f9247a;

    /* renamed from: b */
    public AbstractC4169e f9248b;

    static {
        Covode.recordClassIndex(3697);
    }

    private C3216c() {
    }

    /* renamed from: b */
    public final C3189b mo8569b() {
        if (this.f9247a == null) {
            this.f9247a = new C3189b();
        }
        return this.f9247a;
    }

    /* renamed from: a */
    public static C3216c m8707a() {
        MethodCollector.m26663i(6935);
        if (f9246c == null) {
            synchronized (C3216c.class) {
                try {
                    if (f9246c == null) {
                        f9246c = new C3216c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6935);
                    throw th;
                }
            }
        }
        C3216c cVar = f9246c;
        MethodCollector.m26664o(6935);
        return cVar;
    }
}
