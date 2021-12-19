package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.cy */
final class RunnableC25444cy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f60394a;

    /* renamed from: b */
    private final /* synthetic */ String f60395b;

    /* renamed from: c */
    private final /* synthetic */ C25445cz f60396c;

    static {
        Covode.recordClassIndex(30843);
    }

    public final void run() {
        Bundle bundle;
        if (this.f60396c.f60398a > 0) {
            LifecycleCallback lifecycleCallback = this.f60394a;
            if (this.f60396c.f60399b != null) {
                bundle = this.f60396c.f60399b.getBundle(this.f60395b);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo41554a(bundle);
        }
        if (this.f60396c.f60398a >= 2) {
            this.f60394a.mo41556b();
        }
        if (this.f60396c.f60398a >= 3) {
            this.f60394a.mo41558c();
        }
        if (this.f60396c.f60398a >= 4) {
            this.f60394a.mo41559d();
        }
    }

    RunnableC25444cy(C25445cz czVar, LifecycleCallback lifecycleCallback, String str) {
        this.f60396c = czVar;
        this.f60394a = lifecycleCallback;
        this.f60395b = str;
    }
}
