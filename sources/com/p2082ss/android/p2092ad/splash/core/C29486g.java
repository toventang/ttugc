package com.p2082ss.android.p2092ad.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;

/* renamed from: com.ss.android.ad.splash.core.g */
public class C29486g {

    /* renamed from: c */
    private static volatile C29486g f70160c;

    /* renamed from: a */
    volatile C29455b f70161a;

    /* renamed from: b */
    long f70162b;

    static {
        Covode.recordClassIndex(35880);
    }

    private C29486g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo51576c() {
        this.f70161a = null;
        this.f70162b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C29455b mo51575b() {
        if (Math.abs(System.currentTimeMillis() - this.f70162b) <= 10000) {
            return this.f70161a;
        }
        this.f70161a = null;
        return null;
    }

    /* renamed from: a */
    public static C29486g m59087a() {
        MethodCollector.m26663i(12606);
        if (f70160c == null) {
            synchronized (C29486g.class) {
                try {
                    if (f70160c == null) {
                        f70160c = new C29486g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12606);
                    throw th;
                }
            }
        }
        C29486g gVar = f70160c;
        MethodCollector.m26664o(12606);
        return gVar;
    }
}
