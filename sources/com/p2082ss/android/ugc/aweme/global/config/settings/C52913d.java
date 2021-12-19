package com.p2082ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.d */
public final class C52913d {

    /* renamed from: a */
    private static volatile C52913d f121690a;

    /* renamed from: b */
    private boolean f121691b;

    static {
        Covode.recordClassIndex(62321);
    }

    private C52913d() {
    }

    /* renamed from: b */
    public final boolean mo88581b() {
        boolean z;
        MethodCollector.m26663i(8384);
        synchronized (C52913d.class) {
            try {
                z = this.f121691b;
            } finally {
                MethodCollector.m26664o(8384);
            }
        }
        return z;
    }

    /* renamed from: a */
    public static C52913d m97751a() {
        MethodCollector.m26663i(8237);
        if (f121690a == null) {
            synchronized (C52913d.class) {
                try {
                    if (f121690a == null) {
                        f121690a = new C52913d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8237);
                    throw th;
                }
            }
        }
        C52913d dVar = f121690a;
        MethodCollector.m26664o(8237);
        return dVar;
    }

    /* renamed from: a */
    public final void mo88580a(boolean z) {
        MethodCollector.m26663i(8385);
        synchronized (C52913d.class) {
            try {
                this.f121691b = z;
            } finally {
                MethodCollector.m26664o(8385);
            }
        }
    }
}
