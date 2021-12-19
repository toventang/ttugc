package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ix */
public final class RunnableC26480ix implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C26498jo f62312a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f62313b;

    static {
        Covode.recordClassIndex(31902);
    }

    public final void run() {
        this.f62312a.mo43484k();
        C26498jo joVar = this.f62312a;
        Runnable runnable = this.f62313b;
        joVar.mo43480g();
        if (joVar.f62356c == null) {
            joVar.f62356c = new ArrayList();
        }
        joVar.f62356c.add(runnable);
        this.f62312a.mo43482i();
    }

    RunnableC26480ix(C26498jo joVar, Runnable runnable) {
        this.f62312a = joVar;
        this.f62313b = runnable;
    }
}
