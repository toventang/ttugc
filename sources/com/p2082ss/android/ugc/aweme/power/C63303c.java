package com.p2082ss.android.ugc.aweme.power;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.power.c */
public class C63303c implements AbstractC63302b {

    /* renamed from: b */
    private static C63303c f143682b;

    /* renamed from: a */
    public int f143683a;

    static {
        Covode.recordClassIndex(74581);
    }

    /* renamed from: b */
    public final boolean mo101877b() {
        if (this.f143683a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C63303c m114800a() {
        MethodCollector.m26663i(13664);
        if (f143682b == null) {
            synchronized (C63303c.class) {
                try {
                    if (f143682b == null) {
                        f143682b = new C63303c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13664);
                    throw th;
                }
            }
        }
        C63303c cVar = f143682b;
        MethodCollector.m26664o(13664);
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.power.AbstractC63302b
    /* renamed from: a */
    public final void mo101876a(int i) {
        this.f143683a = i;
    }
}
