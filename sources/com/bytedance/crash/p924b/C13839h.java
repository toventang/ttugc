package com.bytedance.crash.p924b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.crash.b.h */
public class C13839h {

    /* renamed from: b */
    private static volatile C13839h f33690b;

    /* renamed from: a */
    public final C13820a f33691a;

    static {
        Covode.recordClassIndex(15896);
    }

    private C13839h(Context context) {
        this.f33691a = new C13820a(context);
    }

    /* renamed from: a */
    public static C13839h m24996a(Context context) {
        MethodCollector.m26663i(3145);
        if (f33690b == null) {
            synchronized (C13839h.class) {
                try {
                    if (f33690b == null) {
                        f33690b = new C13839h(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3145);
                    throw th;
                }
            }
        }
        C13839h hVar = f33690b;
        MethodCollector.m26664o(3145);
        return hVar;
    }
}
