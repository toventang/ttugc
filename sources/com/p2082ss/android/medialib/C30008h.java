package com.p2082ss.android.medialib;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.medialib.h */
public class C30008h {

    /* renamed from: b */
    private static final String f71610b = C30008h.class.getSimpleName();

    /* renamed from: c */
    private static volatile C30008h f71611c = null;

    /* renamed from: a */
    public RecordInvoker f71612a;

    static {
        Covode.recordClassIndex(36461);
    }

    /* renamed from: a */
    public static C30008h m60555a() {
        MethodCollector.m26663i(2479);
        synchronized (C30008h.class) {
            try {
                if (f71611c == null) {
                    synchronized (C30008h.class) {
                        try {
                            if (f71611c == null) {
                                f71611c = new C30008h();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(2479);
            }
        }
        C30008h hVar = f71611c;
        MethodCollector.m26664o(2479);
        return hVar;
    }

    /* renamed from: a */
    public final void mo52834a(float f) {
        RecordInvoker recordInvoker = this.f71612a;
        if (recordInvoker != null) {
            recordInvoker.updateReactionBGAlpha(f);
        }
    }
}
