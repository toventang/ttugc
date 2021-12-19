package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.cx */
final class RunnableC25443cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f60391a;

    /* renamed from: b */
    private final /* synthetic */ String f60392b;

    /* renamed from: c */
    private final /* synthetic */ FragmentC25442cw f60393c;

    static {
        Covode.recordClassIndex(30842);
    }

    public final void run() {
        Bundle bundle;
        if (this.f60393c.f60388a > 0) {
            LifecycleCallback lifecycleCallback = this.f60391a;
            if (this.f60393c.f60389b != null) {
                bundle = this.f60393c.f60389b.getBundle(this.f60392b);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo41554a(bundle);
        }
        if (this.f60393c.f60388a >= 2) {
            this.f60391a.mo41556b();
        }
        if (this.f60393c.f60388a >= 3) {
            this.f60391a.mo41558c();
        }
        if (this.f60393c.f60388a >= 4) {
            this.f60391a.mo41559d();
        }
    }

    RunnableC25443cx(FragmentC25442cw cwVar, LifecycleCallback lifecycleCallback, String str) {
        this.f60393c = cwVar;
        this.f60391a = lifecycleCallback;
        this.f60392b = str;
    }
}
