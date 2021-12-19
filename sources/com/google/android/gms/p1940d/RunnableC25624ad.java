package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.d.ad */
public final class RunnableC25624ad implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C25622ac f60751a;

    /* renamed from: b */
    private final /* synthetic */ Callable f60752b;

    static {
        Covode.recordClassIndex(31035);
    }

    RunnableC25624ad(C25622ac acVar, Callable callable) {
        this.f60751a = acVar;
        this.f60752b = callable;
    }

    public final void run() {
        try {
            this.f60751a.mo41879a(this.f60752b.call());
        } catch (Exception e) {
            this.f60751a.mo41878a(e);
        }
    }
}
